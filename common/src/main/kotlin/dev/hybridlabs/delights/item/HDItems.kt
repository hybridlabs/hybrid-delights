package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.HybridDelightsCommon
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
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
                        .fast()
                        .meat()
                        .build()
                )
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
                        .fast()
                        .meat()
                        .build()
                )
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
                        .fast()
                        .meat()
                        .build()
                )
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
                        .nutrition(2)
                        .saturationMod(0.4F)
                        .effect(MobEffectInstance(MobEffects.POISON, 300, 0),0.25f)
                        .fast()
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
                        .nutrition(2)
                        .saturationMod(0.4F)
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
                        .fast()
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
                .stacksTo(1)
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
                .stacksTo(1)
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
                .stacksTo(1)
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
                .stacksTo(1)
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
                .stacksTo(1)
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
                .stacksTo(1)
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
                .stacksTo(1)
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
        )
    }

    private fun register(id: String, item: Supplier<Item>): Supplier<Item> {
        return HybridDelightsCommon.ITEMS.register(id, item)
    }
}
