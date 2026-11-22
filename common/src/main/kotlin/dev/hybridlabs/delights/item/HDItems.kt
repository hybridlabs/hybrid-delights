package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.hapi.item.HAPIToolMaterials
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.level.block.Block
import vectorwing.farmersdelight.common.registry.ModEffects
import java.util.function.Supplier

object HDItems {

    val DRIFTWOOD_CABINET = registerBlockItem("driftwood_cabinet") { HDBlocks.DRIFTWOOD_CABINET.get() }

    val SCHIST_STOVE = registerBlockItem("schist_stove") { HDBlocks.SCHIST_STOVE.get() }
    val CHIMNEYSTONE_STOVE = registerBlockItem("chimneystone_stove") { HDBlocks.CHIMNEYSTONE_STOVE.get() }
    val YELLOW_BRINESTONE_STOVE =
        registerBlockItem("yellow_brinestone_stove") { HDBlocks.YELLOW_BRINESTONE_STOVE.get() }
    val ORANGE_BRINESTONE_STOVE =
        registerBlockItem("orange_brinestone_stove") { HDBlocks.ORANGE_BRINESTONE_STOVE.get() }
    val RED_BRINESTONE_STOVE = registerBlockItem("red_brinestone_stove") { HDBlocks.RED_BRINESTONE_STOVE.get() }

    val NETHER_BRICK_STOVE = registerBlockItem("nether_brick_stove") { HDBlocks.NETHER_BRICK_STOVE.get() }
    val RED_NETHER_BRICK_STOVE = registerBlockItem("red_nether_brick_stove") { HDBlocks.RED_NETHER_BRICK_STOVE.get() }
    val CALCITE_STOVE = registerBlockItem("calcite_brick_stove") { HDBlocks.CALCITE_STOVE.get() }
    val MUD_STOVE = registerBlockItem("mud_brick_stove") { HDBlocks.MUD_STOVE.get() }

    val WHITE_STOVE = registerBlockItem("white_brick_stove") { HDBlocks.WHITE_STOVE.get() }
    val ORANGE_STOVE = registerBlockItem("orange_brick_stove") { HDBlocks.ORANGE_STOVE.get() }
    val MAGENTA_STOVE = registerBlockItem("magenta_brick_stove") { HDBlocks.MAGENTA_STOVE.get() }
    val LIGHT_BLUE_STOVE = registerBlockItem("light_blue_brick_stove") { HDBlocks.LIGHT_BLUE_STOVE.get() }
    val YELLOW_STOVE = registerBlockItem("yellow_brick_stove") { HDBlocks.YELLOW_STOVE.get() }
    val LIME_STOVE = registerBlockItem("lime_brick_stove") { HDBlocks.LIME_STOVE.get() }
    val PINK_STOVE = registerBlockItem("pink_brick_stove") { HDBlocks.PINK_STOVE.get() }
    val GRAY_STOVE = registerBlockItem("gray_brick_stove") { HDBlocks.GRAY_STOVE.get() }
    val LIGHT_GRAY_STOVE = registerBlockItem("light_gray_brick_stove") { HDBlocks.LIGHT_GRAY_STOVE.get() }
    val CYAN_STOVE = registerBlockItem("cyan_brick_stove") { HDBlocks.CYAN_STOVE.get() }
    val PURPLE_STOVE = registerBlockItem("purple_brick_stove") { HDBlocks.PURPLE_STOVE.get() }
    val BLUE_STOVE = registerBlockItem("blue_brick_stove") { HDBlocks.BLUE_STOVE.get() }
    val BROWN_STOVE = registerBlockItem("brown_brick_stove") { HDBlocks.BROWN_STOVE.get() }
    val GREEN_STOVE = registerBlockItem("green_brick_stove") { HDBlocks.GREEN_STOVE.get() }
    val RED_STOVE = registerBlockItem("red_brick_stove") { HDBlocks.RED_STOVE.get() }
    val BLACK_STOVE = registerBlockItem("black_brick_stove") { HDBlocks.BLACK_STOVE.get() }

    val BRINE_BOTTLE = register(
        "brine_bottle"
    ) {
        BrineBottleItem(
            HDItemProperties.props().hdFood(0, 0.0f, effect = MobEffectInstance(MobEffects.POISON, 300, 0), chance = 1.0f, drink = true).usingConvertsTo(Items.GLASS_BOTTLE)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val SALT = register(
        "salt"
    ) {
        Item(
            HDItemProperties.props().hdFood(2, 0.3f)
        )
    }

    val SALTED_COD = register(
        "salted_cod"
    ) {
        Item(
            HDItemProperties.props().hdFood(3, 0.3f, fast = true)
        )
    }

    val SALTED_COD_SLICE = register(
        "salted_cod_slice"
    ) {
        Item(
            HDItemProperties.props().hdFood(2, 0.3f, fast = true)
        )
    }

    val SALTED_SALMON = register(
        "salted_salmon"
    ) {
        Item(
            HDItemProperties.props().hdFood(3, 0.3f, fast = true)
        )
    }

    val SALTED_SALMON_SLICE = register(
        "salted_salmon_slice"
    ) {
        Item(
            HDItemProperties.props().hdFood(2, 0.3f, fast = true)
        )
    }

    val CORAL_KNIFE = register(
        "coral_knife"
    ) {
        Item(HDItemProperties.props().sword(HAPIToolMaterials.CORAL, 0.5f, -2.0f))
    }

    val SHARK_TOOTH_KNIFE = register(
        "shark_tooth_knife"
    ) {
        Item(HDItemProperties.props().sword(HAPIToolMaterials.SEASHELL, 0.5f, -2.0f))
    }

    val PICKLED_HERRING = register(
        "pickled_herring"
    ) {
        Item(
            HDItemProperties.props().hdFood(6, 0.6f, drink = true).usingConvertsTo(Items.GLASS_BOTTLE)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val PICKLED_BULL_KELP = register(
        "pickled_bull_kelp"
    ) {
        Item(
            HDItemProperties.props().hdFood(6, 0.6f, drink = true).usingConvertsTo(Items.GLASS_BOTTLE)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val FISH_GELATIN = register(
        "fish_gelatin"
    ) {
        Item(
            HDItemProperties.props().hdFood(1, 0.2f)
        )
    }

    val JELLY = register(
        "jelly"
    ) {
        Item(
            HDItemProperties.props().hdFood(2, 0.2f)
        )
    }

    val JELLY_TOAST = register(
        "jelly_toast"
    ) {
        Item(
            HDItemProperties.props().hdFood(8, 0.8f, fast = true)
                .stacksTo(16)
        )
    }

    val COD_ROE = register(
        "cod_roe"
    ) {
        Item(
            HDItemProperties.props().hdFood(2, 0.4f)
                .stacksTo(16)
        )
    }

    val CURED_COD_ROE = register(
        "cured_cod_roe"
    ) {
        Item(
            HDItemProperties.props().hdFood(4, 0.6f, fast = true).usingConvertsTo(Items.GLASS_BOTTLE)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val SALMON_ROE = register(
        "salmon_roe"
    ) {
        Item(
            HDItemProperties.props().hdFood(2, 0.4f)
                .stacksTo(16)
        )
    }

    val CURED_SALMON_ROE = register(
        "cured_salmon_roe"
    ) {
        Item(
            HDItemProperties.props().hdFood(4, 0.6f, fast = true).usingConvertsTo(Items.GLASS_BOTTLE)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val TROPICAL_FISH_ROE = register(
        "tropical_fish_roe"
    ) {
        Item(
            HDItemProperties.props().hdFood(2, 0.4f)
                .stacksTo(16)
        )
    }

    val CURED_TROPICAL_FISH_ROE = register(
        "cured_tropical_fish_roe"
    ) {
        Item(
            HDItemProperties.props().hdFood(4, 0.6f, fast = true).usingConvertsTo(Items.GLASS_BOTTLE)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val CARP_ROE = register(
        "carp_roe"
    ) {
        Item(
            HDItemProperties.props().hdFood(2, 0.4f)
                .stacksTo(16)
        )
    }

    val CURED_CARP_ROE = register(
        "cured_carp_roe"
    ) {
        Item(
            HDItemProperties.props().hdFood(4, 0.6f, fast = true).usingConvertsTo(Items.GLASS_BOTTLE)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val CAVIAR_TOAST = register(
        "caviar_toast"
    ) {
        Item(
            HDItemProperties.props().hdFood(8, 0.8f, fast = true)
                .stacksTo(16)
        )
    }

    val RAY_WING = register(
        "ray_wing"
    ) {
        Item(
            HDItemProperties.props().hdFood(2, 0.1f)
        )
    }

    val COOKED_RAY_WING = register(
        "cooked_ray_wing"
    ) {
        Item(
            HDItemProperties.props().hdFood(6, 0.8f)
        )
    }

    val SALTED_RAY_WING = register(
        "salted_ray_wing"
    ) {
        Item(
            HDItemProperties.props().hdFood(3, 0.3f, fast = true)
        )
    }

    val PUFFERFISH_SLICE = register(
        "pufferfish_slice"
    ) {
        Item(
            HDItemProperties.props().hdFood(1, 0.1f, effect = MobEffectInstance(MobEffects.POISON, 300, 0), chance = 0.25f)
        )
    }

    val COOKED_PUFFERFISH_SLICE = register(
        "cooked_pufferfish_slice"
    ) {
        Item(
            HDItemProperties.props().hdFood(3, 0.8f)
        )
    }

    val SALTED_PUFFERFISH_SLICE = register(
        "salted_pufferfish_slice"
    ) {
        Item(
            HDItemProperties.props().hdFood(2, 0.3f, fast = true)
        )
    }

    val CRAB_CAKE = register(
        "crab_cake"
    ) {
        Item(
            HDItemProperties.props().hdFood(3, 0.8f)
        )
    }

    val CRAB_RANGOON = register(
        "crab_rangoon"
    ) {
        Item(
            HDItemProperties.props().hdFood(3, 0.8f, fast = true)
        )
    }

    val BISQUE = register(
        "bisque"
    ) {
        Item(
            HDItemProperties.props().hdFood(12, 0.8f, effect = MobEffectInstance(ModEffects.NOURISHMENT, 1200, 0), chance = 1.0f).usingConvertsTo(Items.BOWL)
                .stacksTo(16)
        )
    }

    val SHRIMP_FRIED_RICE = register(
        "shrimp_fried_rice"
    ) {
        Item(
            HDItemProperties.props().hdFood(12, 0.8f).usingConvertsTo(Items.BOWL)
                .stacksTo(16)
        )
    }

    val LOBSTER_STEW = register(
        "lobster_stew"
    ) {
        Item(
            HDItemProperties.props().hdFood(12, 0.8f, effect = MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), chance = 1.0f).usingConvertsTo(Items.BOWL)
                .stacksTo(16)
        )
    }


    val CHOWDER = register(
        "chowder",
    ) {
        Item(
            HDItemProperties.props().hdFood(12, 0.8f, effect = MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), chance = 1.0f).usingConvertsTo(Items.BOWL)
                .stacksTo(16)
        )
    }

    val TUNA_SANDWICH = register(
        "tuna_sandwich"
    ) {
        Item(
            HDItemProperties.props().hdFood(10, 0.8f)
        )
    }

    val TUNA_NACHOS = register(
        "tuna_nachos"
    ) {
        Item(
            HDItemProperties.props().hdFood(10, 0.8f)
                .stacksTo(16)
        )
    }

    val TUNA_CASSEROLE = register(
        "tuna_casserole"
    ) {
        Item(
            HDItemProperties.props().hdFood(14, 0.75f, effect = MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), chance = 1.0f).usingConvertsTo(Items.BOWL)
                .stacksTo(16)
        )
    }

    val TUNA_SALAD = register(
        "tuna_salad"
    ) {
        Item(
            HDItemProperties.props().hdFood(8, 0.95f).usingConvertsTo(Items.BOWL)
                .stacksTo(16)
        )
    }

    val FISHERMANS_SOUP = register(
        "fishermans_soup"
    ) {
        Item(
            HDItemProperties.props().hdFood(12, 0.8f, effect = MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), chance = 1.0f).usingConvertsTo(Items.BOWL)
                .stacksTo(16)
        )
    }

    val EEL_NOODLES = register(
        "eel_noodles"
    ) {
        Item(
            HDItemProperties.props().hdFood(14, 0.75f, effect = MobEffectInstance(ModEffects.NOURISHMENT, 6000, 0), chance = 1.0f)
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
        )
    }

    val FISHERMANS_PIE = register(
        "fishermans_pie"
    ) {
        Item(
            HDItemProperties.props().hdFood(14, 0.75f, effect = MobEffectInstance(ModEffects.NOURISHMENT, 6000, 0), chance = 1.0f)
                .stacksTo(1)
        )
    }

    val JELLIED_CARP = register(
        "jellied_carp",
    ) {
        Item(
            HDItemProperties.props().hdFood(14, 0.75f, effect = MobEffectInstance(ModEffects.NOURISHMENT, 1200, 0), chance = 1.0f)
                .stacksTo(16)
        )
    }

    val MASGOUF = register(
        "masgouf",
    ) {
        Item(
            HDItemProperties.props().hdFood(14, 0.75f, effect = MobEffectInstance(ModEffects.NOURISHMENT, 3600, 0), chance = 1.0f)
                .stacksTo(16)
        )
    }

    val FISH_KEBAB = register(
        "fish_kebab"
    ) {
        Item(
            HDItemProperties.props().hdFood(10, 1.0f).usingConvertsTo(Items.STICK)
                .stacksTo(16)
        )
    }

    val FISH_N_CHIPS = register(
        "fish_n_chips"
    ) {
        Item(
            HDItemProperties.props().hdFood(10, 1.0f)
                .stacksTo(16)
        )
    }

    val TUNA_ROLL = register(
        "tuna_roll",
    ) {
        Item(
            HDItemProperties.props().hdFood(7, 0.6f)
        )
    }

    val BAKED_STUFFED_LOBSTER = register(
        "baked_stuffed_lobster",
    ) {
        Item(
            HDItemProperties.props().hdFood(14, 0.75f, effect = MobEffectInstance(ModEffects.NOURISHMENT, 6000, 0), chance = 1.0f)
                .stacksTo(16)
        )
    }

    //#region Fantastic Fishery Items

    val MOSTLY_EATEN_FISHSICLE = register(
        "mostly_eaten_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(4, 0.2f)
                .stacksTo(16)
        )
    }

    val HALF_EATEN_FISHSICLE = register(
        "half_eaten_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(6, 0.4f).usingConvertsTo(MOSTLY_EATEN_FISHSICLE.get())
                .stacksTo(16)
        )
    }

    val FISHSICLE = register(
        "fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(8, 0.6f).usingConvertsTo(HALF_EATEN_FISHSICLE.get())
                .stacksTo(16)
        )
    }

    val MOSTLY_EATEN_SWEET_BERRY_FISHSICLE = register(
        "mostly_eaten_sweet_berry_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(4, 0.2f)
                .stacksTo(16)
        )
    }

    val HALF_EATEN_SWEET_BERRY_FISHSICLE = register(
        "half_eaten_sweet_berry_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(6, 0.4f).usingConvertsTo(MOSTLY_EATEN_SWEET_BERRY_FISHSICLE.get())
                .stacksTo(16)
        )
    }

    val SWEET_BERRY_FISHSICLE = register(
        "sweet_berry_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(8, 0.6f).usingConvertsTo(HALF_EATEN_SWEET_BERRY_FISHSICLE.get())
                .stacksTo(16)
        )
    }

    val MOSTLY_EATEN_GLOW_BERRY_FISHSICLE = register(
        "mostly_eaten_glow_berry_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(4, 0.2f, effect = MobEffectInstance(MobEffects.GLOWING, 600, 0), chance = 1.0f)
                .stacksTo(16)
        )
    }

    val HALF_EATEN_GLOW_BERRY_FISHSICLE = register(
        "half_eaten_glow_berry_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(6, 0.4f, effect = MobEffectInstance(MobEffects.GLOWING, 600, 0), chance = 1.0f).usingConvertsTo(MOSTLY_EATEN_GLOW_BERRY_FISHSICLE.get())
                .stacksTo(16)
        )
    }

    val GLOW_BERRY_FISHSICLE = register(
        "glow_berry_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(8, 0.6f, effect = MobEffectInstance(MobEffects.GLOWING, 600, 0), chance = 1.0f).usingConvertsTo(HALF_EATEN_GLOW_BERRY_FISHSICLE.get())
                .stacksTo(16)
        )
    }

    val MOSTLY_EATEN_MELON_FISHSICLE = register(
        "mostly_eaten_melon_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(4, 0.2f)
                .stacksTo(16)
        )
    }

    val HALF_EATEN_MELON_FISHSICLE = register(
        "half_eaten_melon_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(6, 0.4f).usingConvertsTo(MOSTLY_EATEN_MELON_FISHSICLE.get())
                .stacksTo(16)
        )
    }

    val MELON_FISHSICLE = register(
        "melon_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(8, 0.6f).usingConvertsTo(HALF_EATEN_MELON_FISHSICLE.get())
                .stacksTo(16)
        )
    }

    val MOSTLY_EATEN_PUMPKIN_FISHSICLE = register(
        "mostly_eaten_pumpkin_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(4, 0.2f)
                .stacksTo(16)
        )
    }

    val HALF_EATEN_PUMPKIN_FISHSICLE = register(
        "half_eaten_pumpkin_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(6, 0.4f).usingConvertsTo(MOSTLY_EATEN_PUMPKIN_FISHSICLE.get())
                .stacksTo(16)
        )
    }

    val PUMPKIN_FISHSICLE = register(
        "pumpkin_fishsicle",
    ) {
        Item(
            HDItemProperties.props().hdFood(8, 0.6f).usingConvertsTo(HALF_EATEN_PUMPKIN_FISHSICLE.get())
                .stacksTo(16)
        )
    }

    val MORSEL_OF_MORSEL = register(
        "morsel_of_morsel"
    ) {
        Item(
            HDItemProperties.props().hdFood(10, 0.8f, fast = true, effect = MobEffectInstance(MobEffects.REGENERATION, 30, 0), chance = 1.0f)
        )
    }

    val PLUNDERERS_ROE = register(
        "plunderers_roe"
    ) {
        Item(
            HDItemProperties.props().hdFood(2, 0.4f)
                .stacksTo(16)
        )
    }

    val CURED_PLUNDERERS_ROE = register(
        "cured_plunderers_roe"
    ) {
        Item(
            HDItemProperties.props().hdFood(4, 0.6f, fast = true).usingConvertsTo(Items.GLASS_BOTTLE)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }
    //#endregion

    //#region Hybrid Skies Items
    val SUNFLOWER_OIL = register(
        "sunflower_oil"
    ) {
        Item(
            HDItemProperties.props()
        )
    }

    val CHICKEN_NUGGET = register(
        "chicken_nugget"
    ) {
        Item(
            HDItemProperties.props().hdFood(4, 0.6f, fast = true)
        )
    }

    val FRIED_CHICKEN = register(
        "fried_chicken"
    ) {
        Item(
            HDItemProperties.props().hdFood(6, 0.8f)
        )
    }

    val MOSTLY_EATEN_BUCKET_OF_CHICKEN = register(
        "mostly_eaten_bucket_of_chicken",
    ) {
        Item(
            HDItemProperties.props().hdFood(8, 0.2f).usingConvertsTo(Items.BUCKET)
                .stacksTo(1)
        )
    }

    val PARTIALLY_EATEN_BUCKET_OF_CHICKEN = register(
        "partially_eaten_bucket_of_chicken",
    ) {
        Item(
            HDItemProperties.props().hdFood(8, 0.4f).usingConvertsTo(MOSTLY_EATEN_BUCKET_OF_CHICKEN.get())
                .stacksTo(1),
        )
    }

    val BUCKET_OF_CHICKEN = register(
        "bucket_of_chicken",
    ) {
        Item(
            HDItemProperties.props().hdFood(8, 0.6f).usingConvertsTo(PARTIALLY_EATEN_BUCKET_OF_CHICKEN.get())
                .stacksTo(1),
        )
    }

    //#endregion

    private fun register(id: String, item: Supplier<Item>): Supplier<Item> {
        return HybridDelightsCommon.ITEMS.register(id) { HDItemProperties.withId(id, item::get) }
    }

    fun registerBlockItem(id: String, block: Supplier<Block>): Supplier<Item> {
        return register(id) { BlockItem(block.get(), HDItemProperties.props()) }
    }
}
