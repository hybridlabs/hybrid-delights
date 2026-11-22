package dev.hybridlabs.delights.loot

import net.fabricmc.fabric.api.loot.v3.LootTableEvents
import net.minecraft.advancements.criterion.EntityPredicate
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.world.level.storage.loot.LootContext
import net.minecraft.world.level.storage.loot.LootPool
import net.minecraft.world.level.storage.loot.entries.NestedLootTable
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue

/**
 * Applies [HDLootInjections] on Fabric.
 * If a source mod is absent none of its loot tables load, so nothing is injected.
 */
object HDLootModification {
    fun register() {
        LootTableEvents.MODIFY.register { key, tableBuilder, source, registries ->
            // Data packs are the player's word on what drops, so only touch tables from code.
            if (!source.isBuiltin) return@register
            if (!key.identifier().path.startsWith(HDLootInjections.ENTITY_TABLE_PREFIX)) return@register

            HDLootInjections.ALL
                .filter { it.sourceModId == key.identifier().namespace }
                .forEach { tableBuilder.withPool(createPool(it, registries)) }
        }
    }

    // The pool goes on every entity table of the source mod, but only rolls for the tagged ones.
    private fun createPool(injection: LootInjection, registries: HolderLookup.Provider): LootPool.Builder {
        return LootPool.lootPool()
            .setRolls(ConstantValue.exactly(1.0F))
            .`when`(
                LootItemEntityPropertyCondition.hasProperties(
                    LootContext.EntityTarget.THIS,
                    EntityPredicate.Builder.entity().of(
                        registries.lookupOrThrow(Registries.ENTITY_TYPE),
                        injection.targets,
                    ),
                )
            )
            .add(NestedLootTable.lootTableReference(injection.table))
    }
}
