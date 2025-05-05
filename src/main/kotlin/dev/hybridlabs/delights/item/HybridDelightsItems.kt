package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.HybridDelights
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.entity.effect.StatusEffectInstance
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import vectorwing.farmersdelight.common.registry.ModEffects

object HybridDelightsItems {

    val CRAB_CAKE = register(
        "crab_cake",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(3)
                        .saturationModifier(0.8F)
                        .snack()
                        .meat()
                        .build()
                )
        )
    )

    val CRAB_RANGOON = register(
        "crab_rangoon",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(3)
                        .saturationModifier(0.8F)
                        .snack()
                        .meat()
                        .build()
                )
        )
    )

    val BISQUE = register(
        "bisque",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(12)
                        .saturationModifier(0.8F)
                        .meat()
                        .statusEffect(StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1.0f)
                        .build()
                )
                .maxCount(1)
        )
    )

    val LOBSTER_STEW = register(
        "lobster_stew",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(12)
                        .saturationModifier(0.8F)
                        .meat()
                        .statusEffect(StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1.0f)
                        .build()
                )
                .maxCount(1)
        )
    )

    val CHOWDER = register(
        "chowder",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(12)
                        .saturationModifier(0.8F)
                        .meat()
                        .statusEffect(StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1.0f)
                        .build()
                )
                .maxCount(1)
        )
    )

    val TUNA_SANDWICH = register(
        "tuna_sandwich",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(10)
                        .saturationModifier(0.8F)
                        .meat()
                        .build()
                )
        )
    )

    val TUNA_CASSEROLE = register(
        "tuna_casserole",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(14)
                        .saturationModifier(0.75F)
                        .meat()
                        .statusEffect(StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1.0f)
                        .build()
                )
                .maxCount(1)
        )
    )

    val TUNA_SALAD = register(
        "tuna_salad",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(8)
                        .saturationModifier(0.95F)
                        .meat()
                        .build()
                )
                .maxCount(1)
        )
    )

    val FISHERMANS_SOUP = register(
        "fishermans_soup",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(12)
                        .saturationModifier(0.8F)
                        .meat()
                        .statusEffect(StatusEffectInstance(ModEffects.COMFORT.get(), 6000, 0), 1.0f)
                        .build()
                )
                .maxCount(1)
        )
    )

    val EEL_NOODLES = register(
        "eel_noodles",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(14)
                        .saturationModifier(0.75F)
                        .meat()
                        .build()
                )
                .maxCount(1)
        )
    )

    val FISHERMANS_PIE = register(
        "fishermans_pie",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(14)
                        .saturationModifier(0.75F)
                        .meat()
                        .statusEffect(StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1.0f)
                        .build()
                )
        )
    )

    val MASGOUF = register(
        "masgouf",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(14)
                        .saturationModifier(0.75F)
                        .meat()
                        .statusEffect(StatusEffectInstance(ModEffects.NOURISHMENT.get(), 6000, 0), 1.0f)
                        .build()
                )
        )
    )

    private fun register(id: String, item: Item): Item {
        return Registry.register(Registries.ITEM, Identifier(HybridDelights.MOD_ID, id), item)
    }
}