package dev.hybridlabs.delights.loot

import net.fabricmc.fabric.api.loot.v2.LootTableEvents

/**
 * Applies [HDLootInjections] on Fabric.
 * If a source mod is absent none of its loot tables load, so nothing is injected.
 */
object HDLootModification {
    fun register() {
        LootTableEvents.MODIFY.register { _, _, id, tableBuilder, source ->
            // Data packs are the player's word on what drops, so only touch tables from code.
            if (!source.isBuiltin) return@register

            HDLootInjections.forEntityTable(id).forEach {
                tableBuilder.withPool(HDLootInjections.createPool(it))
            }
        }
    }
}
