package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.hapi.item.HAPIToolMaterials
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.BlockItem
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.level.block.Block
import vectorwing.farmersdelight.common.item.DrinkableItem
import vectorwing.farmersdelight.common.item.KnifeItem
import java.util.function.Supplier

object HDItems {
    
    val DRIFTWOOD_CABINET = registerBlockItem("driftwood_cabinet") { HDBlocks.DRIFTWOOD_CABINET.get() }

    val SCHIST_STOVE = registerBlockItem("schist_stove") { HDBlocks.SCHIST_STOVE.get() }
    val CHIMNEYSTONE_STOVE = registerBlockItem("chimneystone_stove") { HDBlocks.CHIMNEYSTONE_STOVE.get() }
    val YELLOW_BRINESTONE_STOVE = registerBlockItem("yellow_brinestone_stove") { HDBlocks.YELLOW_BRINESTONE_STOVE.get() }
    val ORANGE_BRINESTONE_STOVE = registerBlockItem("orange_brinestone_stove") { HDBlocks.ORANGE_BRINESTONE_STOVE.get() }
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
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(0)
                        .saturationModifier(0.0F).effect(MobEffectInstance(MobEffects.POISON, 300, 0),1.0F)
                        .usingConvertsTo { Items.GLASS_BOTTLE }
                        .build()
                )
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val SALT = register(
        "salt"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(2)
                        .saturationModifier(0.3F)
                        .build()
                )
        )
    }

    val SALTED_COD = register(
        "salted_cod"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(3)
                        .saturationModifier(0.3F)
                        .fast()
                        .build()
                )
        )
    }

    val SALTED_COD_SLICE = register(
        "salted_cod_slice"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(2)
                        .saturationModifier(0.3F)
                        .fast()
                        .build()
                )
        )
    }

    val SALTED_SALMON = register(
        "salted_salmon"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(3)
                        .saturationModifier(0.3F)
                        .fast()
                        .build()
                )
        )
    }

    val SALTED_SALMON_SLICE = register(
        "salted_salmon_slice"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(2)
                        .saturationModifier(0.3F)
                        .fast()
                        .build()
                )
        )
    }

    val CORAL_KNIFE = register(
        "coral_knife"
    ) {
        KnifeItem(
            HAPIToolMaterials.CORAL,  Item.Properties()
        )
    }

    val SHARK_TOOTH_KNIFE = register(
        "shark_tooth_knife"
    ) {
        KnifeItem(
            HAPIToolMaterials.SEASHELL, Item.Properties()
        )
    }

    val PICKLED_HERRING = register(
        "pickled_herring"
    ) {
        DrinkableItem(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(6)
                        .saturationModifier(0.6F)
                        .usingConvertsTo { Items.GLASS_BOTTLE }
                        .build()
                )
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val PICKLED_BULL_KELP = register(
        "pickled_bull_kelp"
    ) {
        DrinkableItem(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(6)
                        .saturationModifier(0.6F)
                        .usingConvertsTo { Items.GLASS_BOTTLE }
                        .build()
                )
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val FISH_GELATIN = register(
        "fish_gelatin"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(1)
                        .saturationModifier(0.2F)
                        .build()
                )
        )
    }

    val COD_ROE = register(
        "cod_roe"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(2)
                        .saturationModifier(0.4F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val CURED_COD_ROE = register(
        "cured_cod_roe"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(4)
                        .saturationModifier(0.6F)
                        .usingConvertsTo { Items.GLASS_BOTTLE }
                        .fast()
                        .build()
                )
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val SALMON_ROE = register(
        "salmon_roe"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(2)
                        .saturationModifier(0.4F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val CURED_SALMON_ROE = register(
        "cured_salmon_roe"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(4)
                        .saturationModifier(0.6F)
                        .usingConvertsTo { Items.GLASS_BOTTLE }
                        .fast()
                        .build()
                )
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val TROPICAL_FISH_ROE = register(
        "tropical_fish_roe"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(2)
                        .saturationModifier(0.4F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val CURED_TROPICAL_FISH_ROE = register(
        "cured_tropical_fish_roe"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(4)
                        .saturationModifier(0.6F)
                        .usingConvertsTo { Items.GLASS_BOTTLE }
                        .fast()
                        .build()
                )
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val CARP_ROE = register(
        "carp_roe"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(2)
                        .saturationModifier(0.4F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val CURED_CARP_ROE = register(
        "cured_carp_roe"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(4)
                        .saturationModifier(0.6F)
                        .usingConvertsTo { Items.GLASS_BOTTLE }
                        .fast()
                        .build()
                )
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val CAVIAR_TOAST = register(
        "caviar_toast"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(8)
                        .saturationModifier(0.8F)
                        .fast()
                        .build()
                )
                .stacksTo(16)
        )
    }

    val RAY_WING = register(
        "ray_wing"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(2)
                        .saturationModifier(0.1F)
                        .build()
                )
        )
    }

    val COOKED_RAY_WING = register(
        "cooked_ray_wing"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(6)
                        .saturationModifier(0.8F)
                        .build()
                )
        )
    }

    val SALTED_RAY_WING = register(
        "salted_ray_wing"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(3)
                        .saturationModifier(0.3F).fast()
                        
                        .build()
                )
        )
    }

    val FISH_CUTLET = register(
        "fish_cutlet"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(3)
                        .saturationModifier(0.2F)

                        .build()
                )
        )
    }

    val COOKED_FISH_CUTLET = register(
        "cooked_fish_cutlet"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(6)
                        .saturationModifier(0.5F)

                        .build()
                )
        )
    }

    val PUFFERFISH_SLICE = register(
        "pufferfish_slice"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(1)
                        .saturationModifier(0.1F).effect(MobEffectInstance(MobEffects.POISON, 300, 0),0.25f)

                        .build()
                )
        )
    }

    val COOKED_PUFFERFISH_SLICE = register(
        "cooked_pufferfish_slice"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(3)
                        .saturationModifier(0.8F)
                        .build()
                )
        )
    }

    val SALTED_PUFFERFISH_SLICE = register(
        "salted_pufferfish_slice"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(2)
                        .saturationModifier(0.3F).fast()
                        
                        .build()
                )
        )
    }

    val CRAB_CAKE = register(
        "crab_cake"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(3)
                        .saturationModifier(0.8F)
                        .build()
                )
        )
    }

    val CRAB_RANGOON = register(
        "crab_rangoon"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(3)
                        .saturationModifier(0.8F).fast()
                        
                        .build()
                )
        )
    }

    val BISQUE = register(
        "bisque"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(12)
                        .saturationModifier(0.8F)
                        .usingConvertsTo { Items.BOWL }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val SHRIMP_FRIED_RICE = register(
        "shrimp_fried_rice"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(12)
                        .saturationModifier(0.8F)
                        .usingConvertsTo { Items.BOWL }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val LOBSTER_STEW = register(
        "lobster_stew"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(12)
                        .saturationModifier(0.8F)
                        .usingConvertsTo { Items.BOWL }
                        .build()
                )
                .stacksTo(16)
        )
    }


    val CHOWDER = register(
        "chowder",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(12)
                        .saturationModifier(0.8F)
                        .usingConvertsTo { Items.BOWL }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val TUNA_SANDWICH = register(
        "tuna_sandwich"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(10)
                        .saturationModifier(0.8F)
                        .build()
                )
        )
    }

    val TUNA_NACHOS = register(
        "tuna_nachos"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(10)
                        .saturationModifier(0.8F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val TUNA_CASSEROLE = register(
        "tuna_casserole"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(14)
                        .saturationModifier(0.75F)
                        .usingConvertsTo { Items.BOWL }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val TUNA_SALAD = register(
        "tuna_salad"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(8)
                        .saturationModifier(0.95F)
                        .usingConvertsTo { Items.BOWL }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val FISHERMANS_SOUP = register(
        "fishermans_soup"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(12)
                        .saturationModifier(0.8F)
                        .usingConvertsTo { Items.BOWL }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val EEL_NOODLES = register(
        "eel_noodles"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(14)
                        .saturationModifier(0.75F)
                        .build()
                )
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
        )
    }

    val FISHERMANS_PIE = register(
        "fishermans_pie"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(14)
                        .saturationModifier(0.75F)
                        .build()
                )
                .stacksTo(1)
        )
    }

    val JELLIED_CARP = register(
        "jellied_carp",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(14)
                        .saturationModifier(0.75F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val MASGOUF = register(
        "masgouf",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(14)
                        .saturationModifier(0.75F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val FISH_KEBAB = register(
        "fish_kebab"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(10)
                        .saturationModifier(1.0F)
                        .usingConvertsTo { Items.STICK }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val FISH_N_CHIPS = register(
        "fish_n_chips"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(10)
                        .saturationModifier(1.0F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val TUNA_ROLL = register(
        "tuna_roll",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(7)
                        .saturationModifier(0.6F)
                        .build()
                )
        )
    }

    val BAKED_STUFFED_LOBSTER = register(
        "baked_stuffed_lobster",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(14)
                        .saturationModifier(0.75F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    //#region Fantastic Fishery Items

    val MOSTLY_EATEN_FISHSICLE = register(
        "mostly_eaten_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(4)
                        .saturationModifier(0.2F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val HALF_EATEN_FISHSICLE = register(
        "half_eaten_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(6)
                        .saturationModifier(0.4F)
                        .usingConvertsTo { MOSTLY_EATEN_FISHSICLE.get() }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val FISHSICLE = register(
        "fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(8)
                        .saturationModifier(0.6F)
                        .usingConvertsTo { HALF_EATEN_FISHSICLE.get() }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val MOSTLY_EATEN_SWEET_BERRY_FISHSICLE = register(
        "mostly_eaten_sweet_berry_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(4)
                        .saturationModifier(0.2F).build()
                )
                .stacksTo(16)
        )
    }

    val HALF_EATEN_SWEET_BERRY_FISHSICLE = register(
        "half_eaten_sweet_berry_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(6)
                        .saturationModifier(0.4F)
                        .usingConvertsTo { MOSTLY_EATEN_SWEET_BERRY_FISHSICLE.get() }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val SWEET_BERRY_FISHSICLE = register(
        "sweet_berry_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(8)
                        .saturationModifier(0.6F)
                        .usingConvertsTo { HALF_EATEN_SWEET_BERRY_FISHSICLE.get() }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val MOSTLY_EATEN_GLOW_BERRY_FISHSICLE = register(
        "mostly_eaten_glow_berry_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(4)
                        .saturationModifier(0.2F).build()
                )
                .stacksTo(16)
        )
    }

    val HALF_EATEN_GLOW_BERRY_FISHSICLE = register(
        "half_eaten_glow_berry_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(6)
                        .saturationModifier(0.4F)
                        .usingConvertsTo { MOSTLY_EATEN_GLOW_BERRY_FISHSICLE.get() }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val GLOW_BERRY_FISHSICLE = register(
        "glow_berry_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(8)
                        .saturationModifier(0.6F)
                        .usingConvertsTo { HALF_EATEN_GLOW_BERRY_FISHSICLE.get() }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val MOSTLY_EATEN_MELON_FISHSICLE = register(
        "mostly_eaten_melon_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(4)
                        .saturationModifier(0.2F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val HALF_EATEN_MELON_FISHSICLE = register(
        "half_eaten_melon_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(6)
                        .saturationModifier(0.4F)
                        .usingConvertsTo { MOSTLY_EATEN_MELON_FISHSICLE.get() }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val MELON_FISHSICLE = register(
        "melon_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(8)
                        .saturationModifier(0.6F)
                        .usingConvertsTo { HALF_EATEN_MELON_FISHSICLE.get() }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val MOSTLY_EATEN_PUMPKIN_FISHSICLE = register(
        "mostly_eaten_pumpkin_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(4)
                        .saturationModifier(0.2F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val HALF_EATEN_PUMPKIN_FISHSICLE = register(
        "half_eaten_pumpkin_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(6)
                        .saturationModifier(0.4F)
                        .usingConvertsTo { MOSTLY_EATEN_PUMPKIN_FISHSICLE.get() }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val PUMPKIN_FISHSICLE = register(
        "pumpkin_fishsicle",
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(8)
                        .saturationModifier(0.6F)
                        .usingConvertsTo { HALF_EATEN_PUMPKIN_FISHSICLE.get() }
                        .build()
                )
                .stacksTo(16)
        )
    }

    val MORSEL_OF_MORSEL = register(
        "morsel_of_morsel"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(10)
                        .saturationModifier(0.8F)
                        .fast()
                        .build()
                )
        )
    }

    val PLUNDERERS_ROE = register(
        "plunderers_roe"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(2)
                        .saturationModifier(0.4F)
                        .build()
                )
                .stacksTo(16)
        )
    }

    val CURED_PLUNDERERS_ROE = register(
        "cured_plunderers_roe"
    ) {
        Item(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(4)
                        .saturationModifier(0.6F)
                        .fast()
                        .usingConvertsTo { Items.GLASS_BOTTLE }
                        .build()
                )
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    //#endregion

    private fun register(id: String, item: Supplier<Item>): Supplier<Item> {
        return HybridDelightsCommon.ITEMS.register(id, item)
    }

    fun registerBlockItem(id: String, block: Supplier<Block>): Supplier<Item> {
        return register(id) { BlockItem(block.get(), Item.Properties()) }
    }
}
