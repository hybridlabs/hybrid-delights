package dev.hybridlabs.delights.loot

import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.compat.ModIds
import dev.hybridlabs.delights.tag.HDEntityTypeTags
import net.minecraft.advancements.critereon.EntityPredicate
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.entity.EntityType
import net.minecraft.world.level.storage.loot.LootContext
import net.minecraft.world.level.storage.loot.LootPool
import net.minecraft.world.level.storage.loot.entries.LootTableReference
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue

/**
 * An extra loot table rolled on top of another mod's entity drops.
 * The source mod keeps its own loot table, so its drops are added to and never replaced.
 */
data class LootInjection(
    val sourceModId: String,
    val targets: TagKey<EntityType<*>>,
    val table: ResourceLocation,
)

/**
 * Every loot table Hybrid Delights adds to another mod's entities.
 * Fabric applies these in `HDLootModification`, Forge in `HDForgeLootModification`.
 */
object HDLootInjections {
    // Only entity loot tables carry the killing entity that a looting bonus reads.
    const val ENTITY_TABLE_PREFIX = "entities/"

    //#region Hybrid Aquatic Injections
    val JELLYFISH = create(ModIds.HYBRID_AQUATIC, HDEntityTypeTags.ALL_JELLYFISH, "jellyfish")
    //#endregion

    val ALL: List<LootInjection> = listOf(JELLYFISH)

    /**
     * The pool goes on every entity table of the source mod, but only rolls for the tagged ones.
     * Both loaders build it from here, since it needs nothing loader specific.
     */
    fun createPool(injection: LootInjection): LootPool.Builder {
        return LootPool.lootPool()
            .setRolls(ConstantValue.exactly(1.0F))
            .`when`(
                LootItemEntityPropertyCondition.hasProperties(
                    LootContext.EntityTarget.THIS,
                    EntityPredicate.Builder.entity().of(injection.targets),
                )
            )
            .add(LootTableReference.lootTableReference(injection.table))
    }

    /** The injections that apply to the entity loot table [id], if any. */
    fun forEntityTable(id: ResourceLocation): List<LootInjection> {
        if (!id.path.startsWith(ENTITY_TABLE_PREFIX)) return emptyList()
        return ALL.filter { it.sourceModId == id.namespace }
    }

    // A new injection also needs a loot table in data/hybrid_delights/loot_tables/inject.
    private fun create(sourceModId: String, targets: TagKey<EntityType<*>>, id: String): LootInjection {
        return LootInjection(
            sourceModId,
            targets,
            HybridDelightsCommon.locate("inject/$id"),
        )
    }
}
