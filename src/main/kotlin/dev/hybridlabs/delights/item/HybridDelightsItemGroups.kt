@file:Suppress("UnstableApiUsage")

package dev.hybridlabs.delights.item

import dev.hybridlabs.aquatic.HybridAquatic
import dev.hybridlabs.delights.HybridDelights
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object  HybridDelightsItemGroups {
    val ITEMS = register("items", FabricItemGroup.builder()
        .displayName(Text.translatable("itemGroup.${HybridDelights.MOD_ID}.items"))
        .icon { ItemStack(HybridDelightsItems.CRAB_CAKE) }
        .entries { _, entries ->

            // food items

            entries.add(HybridDelightsItems.CRAB_CAKE)


            // spawn eggs
            Registries.ITEM.forEach { item ->
                val id = Registries.ITEM.getId(item)
                if (id.namespace != HybridAquatic.MOD_ID) {
                    return@forEach
                }
            }
        }
        .build()
    )

    private fun register(id: String, itemGroup: ItemGroup): ItemGroup {
        return Registry.register(Registries.ITEM_GROUP, Identifier(HybridDelights.MOD_ID, id), itemGroup)
    }
}
