package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.HybridDelightsCommon
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Item
import java.util.function.Supplier

object HDItems {

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
