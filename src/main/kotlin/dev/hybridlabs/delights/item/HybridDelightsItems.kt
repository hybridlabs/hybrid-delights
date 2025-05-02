package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.HybridDelights
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.item.Items
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object HybridDelightsItems {

    val FISH_FILET = register(
        "fish_filet",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(2)
                        .saturationModifier(0.4F)
                        .meat()
                        .build()
                )
        )
    )

    val CRAB_CAKE = register(
        "crab_cake",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(6)
                        .saturationModifier(1.0F)
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
                        .hunger(6)
                        .saturationModifier(1.0F)
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
                        .hunger(6)
                        .saturationModifier(1.0F)
                        .meat()
                        .build()
                )
                .maxCount(1)
        )
    )

    val CRAB_RANGOON = register(
        "crab_rangoon",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(6)
                        .saturationModifier(1.0F)
                        .meat()
                        .build()
                )
        )
    )

    val RAW_RAY_WING = register(
        "raw_ray_wing",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(2)
                        .saturationModifier(0.4F)
                        .meat()
                        .build()
                )
        )
    )

    val BARREL_EYES = register(
        "barrel_eyes",
        Item(
            FabricItemSettings()
                .food(
                    FoodComponent.Builder()
                        .hunger(2)
                        .saturationModifier(0.4F)
                        .meat()
                        .build()
                )
        )
    )

    private fun register(id: String, item: Item): Item {
        return Registry.register(Registries.ITEM, Identifier(HybridDelights.MOD_ID, id), item)
    }
}