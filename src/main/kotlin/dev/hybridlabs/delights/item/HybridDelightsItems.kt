package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.HybridDelights
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.FoodComponent
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object HybridDelightsItems {

    val CRAB_CAKE = register(
        "crab_cake",
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

    val RAY_WING = register(
        "ray_wing",
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