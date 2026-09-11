package dev.hybridlabs.delights.loot

import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.compat.ModIds
import dev.hybridlabs.delights.tag.HDEntityTypeTags
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.tags.TagKey
import net.minecraft.world.entity.EntityType
import net.minecraft.world.level.storage.loot.LootTable

/**
 * An extra loot table rolled on top of another mod's entity drops.
 * The source mod keeps its own loot table, so its drops are added to and never replaced.
 */
data class LootInjection(
    val sourceModId: String,
    val targets: TagKey<EntityType<*>>,
    val table: ResourceKey<LootTable>,
)

/**
 * Every loot table Hybrid Delights adds to another mod's entities.
 * Fabric applies these in `HDLootModification`, NeoForge in `data/hybrid_delights/loot_modifiers`.
 */
object HDLootInjections {
    // Only entity loot tables carry the killing entity that a looting bonus reads.
    const val ENTITY_TABLE_PREFIX = "entities/"

    //#region Hybrid Aquatic Injections
    val JELLYFISH = create(ModIds.HYBRID_AQUATIC, HDEntityTypeTags.ALL_JELLYFISH, "jellyfish")
    //#endregion

    val ALL: List<LootInjection> = listOf(JELLYFISH)

    // A new injection also needs a loot table in data/hybrid_delights/loot_table/inject, and on
    // NeoForge a modifier in data/hybrid_delights/loot_modifiers listed by id in
    // data/neoforge/loot_modifiers/global_loot_modifiers.json. That index sits in the neoforge
    // namespace, not ours, and a modifier missing from it is ignored without a warning.
    private fun create(sourceModId: String, targets: TagKey<EntityType<*>>, id: String): LootInjection {
        return LootInjection(
            sourceModId,
            targets,
            ResourceKey.create(Registries.LOOT_TABLE, HybridDelightsCommon.locate("inject/$id")),
        )
    }
}