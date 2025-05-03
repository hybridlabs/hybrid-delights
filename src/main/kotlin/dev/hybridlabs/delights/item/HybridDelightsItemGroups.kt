@file:Suppress("UnstableApiUsage")

package dev.hybridlabs.delights.item

import dev.hybridlabs.delights.HybridDelights
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemStack
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.text.Text
import net.minecraft.util.Identifier

object  HybridDelightsItemGroups {
    val HYBRID_DELIGHTS = register("items", FabricItemGroup.builder()
        .displayName(Text.translatable("itemGroup.${HybridDelights.MOD_ID}.items"))
        .icon { ItemStack(HybridDelightsItems.CRAB_CAKE) }
        .entries { _, entries ->

            // food items

            entries.add(HybridDelightsItems.CRAB_CAKE)
            entries.add(HybridDelightsItems.CRAB_RANGOON)
            entries.add(HybridDelightsItems.BISQUE)
            entries.add(HybridDelightsItems.LOBSTER_STEW)
            entries.add(HybridDelightsItems.CHOWDER)
            entries.add(HybridDelightsItems.FISHERMANS_SOUP)
            entries.add(HybridDelightsItems.FISHERMANS_PIE)
            entries.add(HybridDelightsItems.TUNA_SANDWICH)
            entries.add(HybridDelightsItems.TUNA_CASSEROLE)
            entries.add(HybridDelightsItems.TUNA_SALAD)
            entries.add(HybridDelightsItems.EEL_NOODLES)
            entries.add(HybridDelightsItems.MASGOUF)


            Registries.ITEM.forEach { item ->
                val id = Registries.ITEM.getId(item)
                if (id.namespace != HybridDelights.MOD_ID) {
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
