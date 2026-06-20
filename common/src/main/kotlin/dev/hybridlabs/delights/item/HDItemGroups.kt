@file:Suppress("UnstableApiUsage")

package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.Constants
import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.platform.registration.RegistryObject
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack

object  HDItemGroups {

    val HYBRID_DELIGHTS = register(
        Constants.MOD_ID, CreativeModeTab.builder(CreativeModeTab.Row.TOP,0)
        .title(Component.translatable("itemGroup.${Constants.MOD_ID}.items"))
        .icon { ItemStack(HDItems.CRAB_CAKE.get()) }
        .displayItems { _, entries ->

            entries.accept(HDItems.BRINE_BOTTLE.get())

            entries.accept(HDItems.COD_ROE.get())
            entries.accept(HDItems.SALMON_ROE.get())
            entries.accept(HDItems.TROPICAL_FISH_ROE.get())
            entries.accept(HDItems.CARP_ROE.get())

            entries.accept(HDItems.PUFFERFISH_SLICE.get())
            entries.accept(HDItems.COOKED_PUFFERFISH_SLICE.get())

            entries.accept(HDItems.CRAB_CAKE.get())
            entries.accept(HDItems.CRAB_RANGOON.get())
            entries.accept(HDItems.BISQUE.get())

            entries.accept(HDItems.LOBSTER_STEW.get())
            entries.accept(HDItems.BAKED_STUFFED_LOBSTER.get())

            entries.accept(HDItems.CHOWDER.get())

            entries.accept(HDItems.TUNA_SANDWICH.get())
            entries.accept(HDItems.TUNA_ROLL.get())
            entries.accept(HDItems.TUNA_CASSEROLE.get())
            entries.accept(HDItems.TUNA_SALAD.get())

            entries.accept(HDItems.FISHERMANS_SOUP.get())
            entries.accept(HDItems.FISHERMANS_PIE.get())

            entries.accept(HDItems.EEL_NOODLES.get())
            entries.accept(HDItems.MASGOUF.get())
            entries.accept(HDItems.FISH_KEBAB.get())

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
        return HybridDelightsCommon.CREATIVE_MODE_TABS.register(id) { itemGroup }
    }
}