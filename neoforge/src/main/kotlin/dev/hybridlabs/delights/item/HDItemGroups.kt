package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.Constants
import dev.hybridlabs.delights.HybridDelightsCommon
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
                    HDItemGroupItems.DISPLAY_ITEMS.forEach { output.accept(it.get()) }
                }
                .build()
        }
}
