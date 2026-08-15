package dev.hybridlabs.delights.data.client

import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.delights.item.HDItemGroups
import dev.hybridlabs.delights.item.HDItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import java.util.concurrent.CompletableFuture

class LanguageProvider( output: FabricDataOutput, lookupProvider: CompletableFuture<HolderLookup.Provider>) : FabricLanguageProvider(output,lookupProvider) {
    override fun generateTranslations(lookupProvider: HolderLookup.Provider, builder: TranslationBuilder) {
        // item group
        builder.add(
            BuiltInRegistries.CREATIVE_MODE_TAB.getResourceKey(HDItemGroups.HYBRID_DELIGHTS.get())
                .orElseThrow { IllegalStateException("Item group not registered") }, "Hybrid Delights"
        )

        // blocks
        mapOf(
            HDBlocks.SCHIST_STOVE.get() to "Schist Stove",
            HDBlocks.CHIMNEYSTONE_STOVE.get() to "Chimneystone Stove",
            HDBlocks.RED_BRINESTONE_STOVE.get() to "Red Brinestone Stove",
            HDBlocks.ORANGE_BRINESTONE_STOVE.get() to "Orange Brinestone Stove",
            HDBlocks.YELLOW_BRINESTONE_STOVE.get() to "Yellow Brinestone Stove",

            HDBlocks.NETHER_BRICK_STOVE.get() to "Nether Brick Stove",
            HDBlocks.RED_NETHER_BRICK_STOVE.get() to "Red Nether Brick Stove",
            HDBlocks.CALCITE_STOVE.get() to "Calcite Brick Stove",
            HDBlocks.MUD_STOVE.get() to "Mud Brick Stove",

            HDBlocks.WHITE_STOVE.get() to "White Stove",
            HDBlocks.ORANGE_STOVE.get() to "Orange Stove",
            HDBlocks.MAGENTA_STOVE.get() to "Magenta Stove",
            HDBlocks.LIGHT_BLUE_STOVE.get() to "Light Blue Stove",
            HDBlocks.YELLOW_STOVE.get() to "Yellow Stove",
            HDBlocks.LIME_STOVE.get() to "Lime Stove",
            HDBlocks.PINK_STOVE.get() to "Pink Stove",
            HDBlocks.GRAY_STOVE.get() to "Gray Stove",
            HDBlocks.LIGHT_GRAY_STOVE.get() to "Light Gray Stove",
            HDBlocks.CYAN_STOVE.get() to "Cyan Stove",
            HDBlocks.PURPLE_STOVE.get() to "Purple Stove",
            HDBlocks.BLUE_STOVE.get() to "Blue Stove",
            HDBlocks.BROWN_STOVE.get() to "Brown Stove",
            HDBlocks.GREEN_STOVE.get() to "Green Stove",
            HDBlocks.RED_STOVE.get() to "Red Stove",
            HDBlocks.BLACK_STOVE.get() to "Black Stove",
        ).forEach { (block, translation) ->
            builder.add(block, translation)
        }

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
            HDItems.PICKLED_BULL_KELP.get() to "Pickled Bull Kelp",
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
            HDItems.FISH_CUTLET.get() to "Fish Cutlet",
            HDItems.COOKED_FISH_CUTLET.get() to "Cooked Fish Cutlet",
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
            HDItems.FISH_N_CHIPS.get() to "Fish N Chips",
            HDItems.FISH_KEBAB.get() to "Fish Kebab",

            HDItems.TUNA_ROLL.get() to "Tuna Roll",
            HDItems.TUNA_SANDWICH.get() to "Tuna Sandwich",
            HDItems.TUNA_CASSEROLE.get() to "Tuna Casserole",
            HDItems.TUNA_SALAD.get() to "Tuna Salad",
            HDItems.TUNA_NACHOS.get() to "Tuna Nachos",

            HDItems.EEL_NOODLES.get() to "Eel Noodles",

            HDItems.FISHSICLE.get() to "Fishsicle",
            HDItems.HALF_EATEN_FISHSICLE.get() to "Half Eaten Fishsicle",
            HDItems.MOSTLY_EATEN_FISHSICLE.get() to "Mostly Eaten Fishsicle",

            HDItems.SWEET_BERRY_FISHSICLE.get() to "Sweet Berry Fishsicle",
            HDItems.HALF_EATEN_SWEET_BERRY_FISHSICLE.get() to "Half Eaten Sweet Berry Fishsicle",
            HDItems.MOSTLY_EATEN_SWEET_BERRY_FISHSICLE.get() to "Mostly Eaten Sweet Berry Fishsicle",

            HDItems.GLOW_BERRY_FISHSICLE.get() to "Glow Berry Fishsicle",
            HDItems.HALF_EATEN_GLOW_BERRY_FISHSICLE.get() to "Half Eaten Glow Berry Fishsicle",
            HDItems.MOSTLY_EATEN_GLOW_BERRY_FISHSICLE.get() to "Mostly Eaten Glow Berry Fishsicle",

            HDItems.MELON_FISHSICLE.get() to "Melon Fishsicle",
            HDItems.HALF_EATEN_MELON_FISHSICLE.get() to "Half Eaten Melon Fishsicle",
            HDItems.MOSTLY_EATEN_MELON_FISHSICLE.get() to "Mostly Eaten Melon Fishsicle",

            HDItems.PUMPKIN_FISHSICLE.get() to "Pumpkin Fishsicle",
            HDItems.HALF_EATEN_PUMPKIN_FISHSICLE.get() to "Half Eaten Pumpkin Fishsicle",
            HDItems.MOSTLY_EATEN_PUMPKIN_FISHSICLE.get() to "Mostly Eaten Pumpkin Fishsicle",
        ).forEach { (item, translation) ->
            builder.add(item, translation)
        }
    }
}