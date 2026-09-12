package dev.hybridlabs.delights.loot

import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.LootTableLoadEvent

/**
 * Applies [HDLootInjections] on Forge.
 * If a source mod is absent none of its loot tables load, so nothing is injected.
 */
object HDForgeLootModification {
    fun register() {
        MinecraftForge.EVENT_BUS.addListener(::onLootTableLoad)
    }

    private fun onLootTableLoad(event: LootTableLoadEvent) {
        HDLootInjections.forEntityTable(event.name).forEach {
            event.table.addPool(HDLootInjections.createPool(it).build())
        }
    }
}
