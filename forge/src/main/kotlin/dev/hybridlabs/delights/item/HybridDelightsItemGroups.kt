@file:Suppress("unused", "DEPRECATION", "SameParameterValue")

package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.CommonClass
import dev.hybridlabs.delights.Constants
import dev.hybridlabs.delights.platform.registration.RegistryObject
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack

object HybridDelightsItemGroups {
    val HYBRID_DELIGHTS = register(
        "items",
        CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup.${Constants.MOD_ID}.items"))
            .icon { ItemStack(HybridDelightsItems.CRAB_CAKE.get()) }
            .displayItems { _, entries ->

                entries.accept(HybridDelightsItems.CRAB_CAKE.get())
                entries.accept(HybridDelightsItems.CRAB_RANGOON.get())
                entries.accept(HybridDelightsItems.BISQUE.get())
                entries.accept(HybridDelightsItems.LOBSTER_STEW.get())
                entries.accept(HybridDelightsItems.CHOWDER.get())
                entries.accept(HybridDelightsItems.FISHERMANS_SOUP.get())
                entries.accept(HybridDelightsItems.FISHERMANS_PIE.get())
                entries.accept(HybridDelightsItems.TUNA_SANDWICH.get())
                entries.accept(HybridDelightsItems.TUNA_CASSEROLE.get())
                entries.accept(HybridDelightsItems.TUNA_SALAD.get())
                entries.accept(HybridDelightsItems.EEL_NOODLES.get())
                entries.accept(HybridDelightsItems.MASGOUF.get())

                BuiltInRegistries.ITEM.forEach { item ->
                    val id = BuiltInRegistries.ITEM.getKey(item)
                    if (id.namespace != Constants.MOD_ID) {
                        return@forEach
                    }
                }
            }
            .build()
    )

    private fun register(id: String, itemGroup: CreativeModeTab): RegistryObject<CreativeModeTab> {
        return CommonClass.CREATIVE_MODE_TABS.register(id) { itemGroup }
    }
}