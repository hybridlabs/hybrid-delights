package dev.hybridlabs.delights.data.client

import dev.hybridlabs.delights.item.HDItemGroups
import dev.hybridlabs.delights.item.HDItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.core.registries.BuiltInRegistries

class LanguageProvider(output: FabricDataOutput) : FabricLanguageProvider(output) {
    override fun generateTranslations(builder: TranslationBuilder) {
        // item group
        builder.add(
            BuiltInRegistries.CREATIVE_MODE_TAB.getResourceKey(HDItemGroups.HYBRID_DELIGHTS.get())
                .orElseThrow { IllegalStateException("Item group not registered") }, "Hybrid Delights"
        )

        // items
        mapOf(
            HDItems.CORAL_KNIFE.get() to "Coral Knife",
            HDItems.SHARK_TOOTH_KNIFE.get() to "Shark Tooth Knife",
            HDItems.BRINE_BOTTLE.get() to "Brine Bottle",
            HDItems.SALT.get() to "Salt",
            HDItems.SALTED_COD.get() to "Salted Cod",
            HDItems.SALTED_COD_SLICE.get() to "Salted Cod Slice",
            HDItems.SALTED_SALMON.get() to "Salted Salmon",
            HDItems.SALTED_SALMON_SLICE.get() to "Salted Salmon Slice",
            HDItems.PICKLED_HERRING.get() to "Pickled Herring",
            HDItems.FISH_GELATIN.get() to "Fish Gelatin",
            HDItems.COD_ROE.get() to "Cod Roe",
            HDItems.CURED_COD_ROE.get() to "Cured Cod Roe",
            HDItems.SALMON_ROE.get() to "Salmon Roe",
            HDItems.CURED_SALMON_ROE.get() to "Cured Salmon Roe",
            HDItems.TROPICAL_FISH_ROE.get() to "Tropical Fish Roe",
            HDItems.CURED_TROPICAL_FISH_ROE.get() to "Cured Tropical Fish Roe",
            HDItems.CARP_ROE.get() to "Carp Roe",
            HDItems.CURED_CARP_ROE.get() to "Cured Carp Roe",
            HDItems.CAVIAR_TOAST.get() to "Caviar Toast",
            HDItems.PUFFERFISH_SLICE.get() to "Pufferfish Slice",
            HDItems.COOKED_PUFFERFISH_SLICE.get() to "Cooked Pufferfish Slice",
            HDItems.SALTED_PUFFERFISH_SLICE.get() to "Salted Pufferfish Slice",
            HDItems.RAY_WING.get() to "Ray Wing",
            HDItems.COOKED_RAY_WING.get() to "Cooked Ray Wing",
            HDItems.SALTED_RAY_WING.get() to "Salted Ray Wing",
            HDItems.CRAB_CAKE.get() to "Crab Cake",
            HDItems.CRAB_RANGOON.get() to "Crab Rangoon",
            HDItems.BISQUE.get() to "Bisque",
            HDItems.LOBSTER_STEW.get() to "Lobster Stew",
            HDItems.BAKED_STUFFED_LOBSTER.get() to "Baked Stuffed Lobster",
            HDItems.SHRIMP_FRIED_RICE.get() to "Shrimp Fried Rice",
            HDItems.CHOWDER.get() to "Chowder",
            HDItems.FISHERMANS_SOUP.get() to "Fisherman's Soup",
            HDItems.FISHERMANS_PIE.get() to "Fisherman's Pie",
            HDItems.JELLIED_CARP.get() to "Jellied Carp",
            HDItems.MASGOUF.get() to "Masgouf",
            HDItems.TUNA_ROLL.get() to "Tuna Roll",
            HDItems.FISH_KEBAB.get() to "Fish Kebab",
            HDItems.TUNA_SANDWICH.get() to "Tuna Sandwich",
            HDItems.TUNA_CASSEROLE.get() to "Tuna Casserole",
            HDItems.TUNA_SALAD.get() to "Tuna Salad",
            HDItems.TUNA_NACHOS.get() to "Tuna Nachos",
            HDItems.EEL_NOODLES.get() to "Eel Noodles",
        ).forEach { (item, translation) ->
            builder.add(item, translation)
        }
    }
}