package dev.hybridlabs.delights.item

import net.minecraft.world.item.Item
import java.util.function.Supplier

/** Items shown in the Hybrid Delights creative tab, in display order. */
object HDItemGroupItems {
    val DISPLAY_ITEMS: List<Supplier<Item>> = listOf(
        HDItems.CORAL_KNIFE,
        HDItems.SHARK_TOOTH_KNIFE,
        HDItems.BRINE_BOTTLE,
        HDItems.SALT,
        HDItems.COD_ROE,
        HDItems.CURED_COD_ROE,
        HDItems.SALMON_ROE,
        HDItems.CURED_SALMON_ROE,
        HDItems.TROPICAL_FISH_ROE,
        HDItems.CURED_TROPICAL_FISH_ROE,
        HDItems.CARP_ROE,
        HDItems.CURED_CARP_ROE,
        HDItems.CAVIAR_TOAST,
        HDItems.JELLY,
        HDItems.JELLY_TOAST,
        HDItems.PICKLED_HERRING,
        HDItems.PICKLED_BULL_KELP,
        HDItems.FISH_GELATIN,
        HDItems.JELLIED_CARP,
        HDItems.SALTED_COD,
        HDItems.SALTED_COD_SLICE,
        HDItems.SALTED_SALMON,
        HDItems.SALTED_SALMON_SLICE,
        HDItems.PUFFERFISH_SLICE,
        HDItems.COOKED_PUFFERFISH_SLICE,
        HDItems.SALTED_PUFFERFISH_SLICE,
        HDItems.RAY_WING,
        HDItems.COOKED_RAY_WING,
        HDItems.SALTED_RAY_WING,
        HDItems.CRAB_CAKE,
        HDItems.CRAB_RANGOON,
        HDItems.BISQUE,
        HDItems.LOBSTER_STEW,
        HDItems.BAKED_STUFFED_LOBSTER,
        HDItems.SHRIMP_FRIED_RICE,
        HDItems.CHOWDER,
        HDItems.TUNA_SANDWICH,
        HDItems.TUNA_ROLL,
        HDItems.TUNA_CASSEROLE,
        HDItems.TUNA_SALAD,
        HDItems.TUNA_NACHOS,
        HDItems.FISHERMANS_SOUP,
        HDItems.FISHERMANS_PIE,
        HDItems.EEL_NOODLES,
        HDItems.MASGOUF,
        HDItems.FISH_KEBAB,
        HDItems.FISH_N_CHIPS,
    )

    /** Stoves made from Hybrid Blocks' bricks. */
    val HYBRID_BLOCKS_STOVES: List<Supplier<Item>> = listOf(
        HDItems.WHITE_STOVE,
        HDItems.ORANGE_STOVE,
        HDItems.MAGENTA_STOVE,
        HDItems.LIGHT_BLUE_STOVE,
        HDItems.YELLOW_STOVE,
        HDItems.LIME_STOVE,
        HDItems.PINK_STOVE,
        HDItems.GRAY_STOVE,
        HDItems.LIGHT_GRAY_STOVE,
        HDItems.CYAN_STOVE,
        HDItems.PURPLE_STOVE,
        HDItems.BLUE_STOVE,
        HDItems.BROWN_STOVE,
        HDItems.GREEN_STOVE,
        HDItems.RED_STOVE,
        HDItems.BLACK_STOVE,
        HDItems.NETHER_BRICK_STOVE,
        HDItems.RED_NETHER_BRICK_STOVE,
        HDItems.CALCITE_STOVE,
        HDItems.MUD_STOVE,
    )

    /** Stoves made from Hybrid Aquatic's stones. */
    val HYBRID_AQUATIC_STOVES: List<Supplier<Item>> = listOf(
        HDItems.SCHIST_STOVE,
        HDItems.CHIMNEYSTONE_STOVE,
        HDItems.YELLOW_BRINESTONE_STOVE,
        HDItems.ORANGE_BRINESTONE_STOVE,
        HDItems.RED_BRINESTONE_STOVE,
    )

    val HYBRID_AQUATIC_FURNITURE: List<Supplier<Item>> = listOf(
        HDItems.DRIFTWOOD_CABINET,
    )

    /** Items that only make sense alongside Fantastic Fishery, shown when that mod is loaded. */
    val FANTASTIC_FISHERY_ITEMS: List<Supplier<Item>> = listOf(
        HDItems.FISHSICLE,
        HDItems.SWEET_BERRY_FISHSICLE,
        HDItems.GLOW_BERRY_FISHSICLE,
        HDItems.MELON_FISHSICLE,
        HDItems.PUMPKIN_FISHSICLE,
        HDItems.MORSEL_OF_MORSEL,
        HDItems.PLUNDERERS_ROE,
        HDItems.CURED_PLUNDERERS_ROE,
    )

    /** Items that only make sense alongside Hybrid Birds, shown when that mod is loaded. */
    val HYBRID_BIRDS_ITEMS: List<Supplier<Item>> = listOf(
        HDItems.SUNFLOWER_OIL,
        HDItems.CHICKEN_NUGGET,
        HDItems.FRIED_CHICKEN,
        HDItems.BUCKET_OF_CHICKEN,
        HDItems.PARTIALLY_EATEN_BUCKET_OF_CHICKEN,
        HDItems.MOSTLY_EATEN_BUCKET_OF_CHICKEN,
    )
}
