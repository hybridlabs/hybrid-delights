package dev.hybridlabs.delights.loot

import net.fabricmc.fabric.api.loot.v2.LootTableEvents
import net.minecraft.advancements.critereon.EntityPredicate
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
        LootTableEvents.MODIFY.register { key, tableBuilder, source, _ ->
            // Data packs are the player's word on what drops, so only touch tables from code.
            if (!source.isBuiltin) return@register
            if (!key.location().path.startsWith(HDLootInjections.ENTITY_TABLE_PREFIX)) return@register

            HDLootInjections.ALL
                .filter { it.sourceModId == key.location().namespace }
                .forEach { tableBuilder.withPool(createPool(it)) }
        }
    }

    // The pool goes on every entity table of the source mod, but only rolls for the tagged ones.
    private fun createPool(injection: LootInjection): LootPool.Builder {
        return LootPool.lootPool()
            .setRolls(ConstantValue.exactly(1.0F))
            .`when`(
                LootItemEntityPropertyCondition.hasProperties(
                    LootContext.EntityTarget.THIS,
                    EntityPredicate.Builder.entity().of(injection.targets),
                )
            )
            .add(NestedLootTable.lootTableReference(injection.table))
    }
}