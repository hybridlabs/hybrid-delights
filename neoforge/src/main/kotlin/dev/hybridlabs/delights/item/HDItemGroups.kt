package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.Constants
import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.platform.Services
import dev.hybridlabs.delights.platform.registration.RegistryObject
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack

/**
 * The creative tab is built in the loader module. In 26.x [CreativeModeTab.Output] is protected in
 * vanilla, and only the loader-patched classpath (Fabric API/NeoForge) makes it usable.
 */
object HDItemGroups {

    val HYBRID_DELIGHTS: RegistryObject<CreativeModeTab> =
        HybridDelightsCommon.CREATIVE_MODE_TABS.register(Constants.MOD_ID) {
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                .title(Component.translatable("itemGroup.${Constants.MOD_ID}.items"))
                .icon { ItemStack(HDItems.CRAB_CAKE.get()) }
                .displayItems { _, output ->
                    if (Services.PLATFORM.isModLoaded("hybrid_blocks")) {
                        HDItemGroupItems.HYBRID_BLOCKS_STOVES.forEach { output.accept(it.get()) }
                    }
                    if (Services.PLATFORM.isModLoaded("hybrid_aquatic")) {
                        HDItemGroupItems.HYBRID_AQUATIC_STOVES.forEach { output.accept(it.get()) }
                        HDItemGroupItems.HYBRID_AQUATIC_FURNITURE.forEach { output.accept(it.get()) }
                    }
                    HDItemGroupItems.DISPLAY_ITEMS.forEach { output.accept(it.get()) }
                    if (Services.PLATFORM.isModLoaded("fantastic_fishery")) {
                        HDItemGroupItems.FANTASTIC_FISHERY_ITEMS.forEach { output.accept(it.get()) }
                    }
                    if (Services.PLATFORM.isModLoaded("hybrid_birds")) {
                        HDItemGroupItems.HYBRID_BIRDS_ITEMS.forEach { output.accept(it.get()) }
                    }
                }
                .build()
        }
}
