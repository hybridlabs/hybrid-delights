package dev.hybridlabs.delights.item

import dev.hybridlabs.aquatic.item.HAToolMaterials
import dev.hybridlabs.delights.HybridDelightsCommon
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import vectorwing.farmersdelight.common.item.DrinkableItem
import vectorwing.farmersdelight.common.item.KnifeItem
import java.util.function.Supplier

object HDItems {

    val BRINE_BOTTLE = register(
        "brine_bottle"
    ) {
        BrineBottleItem(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(0)
                        .saturationMod(0.0F)
                        .effect(MobEffectInstance(MobEffects.POISON, 300, 0),1.0f)
                        .meat()
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
                        .saturationMod(0.3F)
                        .meat()
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
                        .saturationMod(0.3F)
                        .meat()
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
                        .saturationMod(0.3F)
                        .meat()
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
                        .saturationMod(0.3F)
                        .meat()
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
                        .saturationMod(0.3F)
                        .meat()
                        .fast()
                        .build()
                )
        )
    }

    val CORAL_KNIFE = register(
        "coral_knife"
    ) {
        KnifeItem(HAToolMaterials.CORAL, 0.5f, -2.0f, Item.Properties()
        )
    }

    val SHARK_TOOTH_KNIFE = register(
        "shark_tooth_knife"
    ) {
        KnifeItem(HAToolMaterials.SEASHELL, 0.5f, -2.0f, Item.Properties()
        )
    }

    val PICKLED_HERRING = register(
        "pickled_herring"
    ) {
        DrinkableItem(
            Item.Properties()
                .food(
                    FoodProperties.Builder()
                        .nutrition(1)
                        .saturationMod(0.1F)
                        .meat()
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
                        .saturationMod(0.2F)
                        .meat()
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
                        .saturationMod(0.4F)
                        .meat()
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
                        .saturationMod(0.6F)
                        .meat()
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
                        .saturationMod(0.4F)
                        .meat()
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
                        .saturationMod(0.6F)
                        .meat()
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
                        .saturationMod(0.4F)
                        .meat()
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
                        .saturationMod(0.6F)
                        .meat()
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
                        .saturationMod(0.4F)
                        .meat()
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
                        .saturationMod(0.6F)
                        .meat()
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
                        .saturationMod(0.8F)
                        .meat()
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
                        .saturationMod(0.4F)
                        .meat()
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
                        .nutrition(2)
                        .saturationMod(0.4F)
                        .meat()
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
                        .nutrition(2)
                        .saturationMod(0.4F)
                        .fast()
                        .meat()
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
                        .saturationMod(0.1F)
                        .effect(MobEffectInstance(MobEffects.POISON, 300, 0),0.25f)
                        .meat()
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
                        .saturationMod(0.8F)
                        .meat()
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
                        .saturationMod(0.3F)
                        .fast()
                        .meat()
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
                        .saturationMod(0.8F)
                        .meat()
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
                        .saturationMod(0.8F)
                        .fast()
                        .meat()
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
                        .saturationMod(0.8F)
                        .meat()
                        .build()
                )
                .craftRemainder(Items.BOWL)
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
                        .saturationMod(0.8F)
                        .meat()
                        .build()
                )
                .craftRemainder(Items.BOWL)
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
                        .saturationMod(0.8F)
                        .meat()
                        .build()
                )
                .craftRemainder(Items.BOWL)
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
                        .saturationMod(0.8F)
                        .meat()
                        .build()
                )
                .craftRemainder(Items.BOWL)
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
                        .saturationMod(0.8F)
                        .meat()
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
                        .saturationMod(0.8F)
                        .meat()
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
                        .saturationMod(0.75F)
                        .meat()
                        .build()
                )
                .craftRemainder(Items.BOWL)
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
                        .saturationMod(0.95F)
                        .meat()
                        .build()
                )
                .craftRemainder(Items.BOWL)
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
                        .saturationMod(0.8F)
                        .meat()
                        .build()
                )
                .craftRemainder(Items.BOWL)
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
                        .saturationMod(0.75F)
                        .meat()
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
                        .saturationMod(0.75F)
                        .meat()
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
                        .saturationMod(0.75F)
                        .meat()
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
                        .saturationMod(0.75F)
                        .meat()
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
                        .saturationMod(1.0F)
                        .meat()
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
                        .saturationMod(0.6F)
                        .meat()
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
                        .saturationMod(0.75F)
                        .meat()
                        .build()
                )
                .stacksTo(16)
        )
    }

    private fun register(id: String, item: Supplier<Item>): Supplier<Item> {
        return HybridDelightsCommon.ITEMS.register(id, item)
    }
}
