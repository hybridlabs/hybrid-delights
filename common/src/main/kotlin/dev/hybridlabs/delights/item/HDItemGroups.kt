@file:Suppress("UnstableApiUsage")

package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.Constants
import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.platform.Services
import dev.hybridlabs.delights.platform.registration.RegistryObject
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack

object HDItemGroups {

    val HYBRID_DELIGHTS = register(
        Constants.MOD_ID, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup.${Constants.MOD_ID}.items"))
            .icon { ItemStack(HDItems.CRAB_CAKE.get()) }
            .displayItems { _, entries ->

                if (Services.PLATFORM.isModLoaded("hybrid_blocks")) {
                    HDItemGroupItems.HYBRID_BLOCKS_STOVES.forEach { entries.accept(it.get()) }
                }

                if (Services.PLATFORM.isModLoaded("hybrid_aquatic")) {
                    HDItemGroupItems.HYBRID_AQUATIC_STOVES.forEach { entries.accept(it.get()) }
                    HDItemGroupItems.HYBRID_AQUATIC_FURNITURE.forEach { entries.accept(it.get()) }
                }

                HDItemGroupItems.DISPLAY_ITEMS.forEach { entries.accept(it.get()) }

                if (Services.PLATFORM.isModLoaded("fantastic_fishery")) {
                    HDItemGroupItems.FANTASTIC_FISHERY_ITEMS.forEach { entries.accept(it.get()) }
                }

                if (Services.PLATFORM.isModLoaded("hybrid_birds")) {
                    HDItemGroupItems.HYBRID_BIRDS_ITEMS.forEach { entries.accept(it.get()) }
                }
            }
            .build()
    )

    private fun register(id: String, itemGroup: CreativeModeTab): RegistryObject<CreativeModeTab> {
        return HybridDelightsCommon.CREATIVE_MODE_TABS.register(id) { itemGroup }
    }
}
