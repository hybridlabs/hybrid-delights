@file:Suppress("UnstableApiUsage")

package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.Constants
import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.platform.Services
import dev.hybridlabs.delights.platform.registration.RegistryObject
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.network.chat.Component
import net.minecraft.world.item.CreativeModeTab
import net.minecraft.world.item.ItemStack

object HDItemGroups {

    val HYBRID_DELIGHTS = register(
        Constants.MOD_ID, CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable("itemGroup.${Constants.MOD_ID}.items"))
            .icon { ItemStack(HDItems.CRAB_CAKE.get()) }
            .displayItems { _, entries ->
                if (Services.PLATFORM.isModLoaded("hybrid_aquatic")) {
                    entries.accept(HDItems.DRIFTWOOD_CABINET.get())

                    entries.accept(HDItems.SCHIST_STOVE.get())
                    entries.accept(HDItems.CHIMNEYSTONE_STOVE.get())
                    entries.accept(HDItems.YELLOW_BRINESTONE_STOVE.get())
                    entries.accept(HDItems.ORANGE_BRINESTONE_STOVE.get())
                    entries.accept(HDItems.RED_BRINESTONE_STOVE.get())

                    entries.accept(HDItems.CORAL_KNIFE.get())
                    entries.accept(HDItems.SHARK_TOOTH_KNIFE.get())

                    entries.accept(HDItems.BRINE_BOTTLE.get())
                    entries.accept(HDItems.SALT.get())

                    entries.accept(HDItems.COD_ROE.get())
                    entries.accept(HDItems.CURED_COD_ROE.get())
                    entries.accept(HDItems.SALMON_ROE.get())
                    entries.accept(HDItems.CURED_SALMON_ROE.get())
                    entries.accept(HDItems.TROPICAL_FISH_ROE.get())
                    entries.accept(HDItems.CURED_TROPICAL_FISH_ROE.get())
                    entries.accept(HDItems.CARP_ROE.get())
                    entries.accept(HDItems.CURED_CARP_ROE.get())

                    entries.accept(HDItems.CAVIAR_TOAST.get())

                    entries.accept(HDItems.PICKLED_HERRING.get())
                    entries.accept(HDItems.PICKLED_BULL_KELP.get())

                    entries.accept(HDItems.FISH_GELATIN.get())
                    entries.accept(HDItems.JELLIED_CARP.get())

                    entries.accept(HDItems.SALTED_COD.get())
                    entries.accept(HDItems.SALTED_COD_SLICE.get())

                    entries.accept(HDItems.SALTED_SALMON.get())
                    entries.accept(HDItems.SALTED_SALMON_SLICE.get())

                    entries.accept(HDItems.FISH_CUTLET.get())
                    entries.accept(HDItems.COOKED_FISH_CUTLET.get())

                    entries.accept(HDItems.PUFFERFISH_SLICE.get())
                    entries.accept(HDItems.COOKED_PUFFERFISH_SLICE.get())
                    entries.accept(HDItems.SALTED_PUFFERFISH_SLICE.get())

                    entries.accept(HDItems.RAY_WING.get())
                    entries.accept(HDItems.COOKED_RAY_WING.get())
                    entries.accept(HDItems.SALTED_RAY_WING.get())

                    entries.accept(HDItems.CRAB_CAKE.get())
                    entries.accept(HDItems.CRAB_RANGOON.get())
                    entries.accept(HDItems.BISQUE.get())

                    entries.accept(HDItems.LOBSTER_STEW.get())
                    entries.accept(HDItems.BAKED_STUFFED_LOBSTER.get())

                    entries.accept(HDItems.SHRIMP_FRIED_RICE.get())
                    entries.accept(HDItems.CHOWDER.get())

                    entries.accept(HDItems.TUNA_SANDWICH.get())
                    entries.accept(HDItems.TUNA_ROLL.get())
                    entries.accept(HDItems.TUNA_CASSEROLE.get())
                    entries.accept(HDItems.TUNA_SALAD.get())
                    entries.accept(HDItems.TUNA_NACHOS.get())

                    entries.accept(HDItems.FISHERMANS_SOUP.get())
                    entries.accept(HDItems.FISHERMANS_PIE.get())

                    entries.accept(HDItems.EEL_NOODLES.get())
                    entries.accept(HDItems.MASGOUF.get())
                    entries.accept(HDItems.FISH_KEBAB.get())
                    entries.accept(HDItems.FISH_N_CHIPS.get())
                }

                if (Services.PLATFORM.isModLoaded("fantastic_fishery")) {
                    entries.accept(HDItems.FISHSICLE.get())
                    entries.accept(HDItems.SWEET_BERRY_FISHSICLE.get())
                    entries.accept(HDItems.GLOW_BERRY_FISHSICLE.get())
                    entries.accept(HDItems.MELON_FISHSICLE.get())
                    entries.accept(HDItems.PUMPKIN_FISHSICLE.get())
                }

                if (Services.PLATFORM.isModLoaded("hybrid_blocks")) {
                    entries.accept(HDItems.WHITE_STOVE.get())
                    entries.accept(HDItems.ORANGE_STOVE.get())
                    entries.accept(HDItems.MAGENTA_STOVE.get())
                    entries.accept(HDItems.LIGHT_BLUE_STOVE.get())
                    entries.accept(HDItems.YELLOW_STOVE.get())
                    entries.accept(HDItems.LIME_STOVE.get())
                    entries.accept(HDItems.PINK_STOVE.get())
                    entries.accept(HDItems.GRAY_STOVE.get())
                    entries.accept(HDItems.LIGHT_GRAY_STOVE.get())
                    entries.accept(HDItems.CYAN_STOVE.get())
                    entries.accept(HDItems.PURPLE_STOVE.get())
                    entries.accept(HDItems.BLUE_STOVE.get())
                    entries.accept(HDItems.BROWN_STOVE.get())
                    entries.accept(HDItems.GREEN_STOVE.get())
                    entries.accept(HDItems.RED_STOVE.get())
                    entries.accept(HDItems.BLACK_STOVE.get())
                    entries.accept(HDItems.NETHER_BRICK_STOVE.get())
                    entries.accept(HDItems.RED_NETHER_BRICK_STOVE.get())
                    entries.accept(HDItems.CALCITE_STOVE.get())
                    entries.accept(HDItems.MUD_STOVE.get())
                }

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