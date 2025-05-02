package dev.hybridlabs.delights.data.client

import dev.hybridlabs.delights.item.HybridDelightsItemGroups
import dev.hybridlabs.delights.item.HybridDelightsItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.registry.Registries

class LanguageProvider(output: FabricDataOutput) : FabricLanguageProvider(output) {
    override fun generateTranslations(builder: TranslationBuilder) {
        // item group
        builder.add(
            Registries.ITEM_GROUP.getKey(HybridDelightsItemGroups.HYBRID_DELIGHTS)
                .orElseThrow { IllegalStateException("Item group not registered") }, "Hybrid Delights"
        )

        // items
        mapOf(
            HybridDelightsItems.CRAB_CAKE to "Crab Cake",
            HybridDelightsItems.CRAB_RANGOON to "Crab Rangoon",
            HybridDelightsItems.BISQUE to "Bisque",
            HybridDelightsItems.FISHERMANS_SOUP  to "Fisherman's Soup",
            HybridDelightsItems.FISH_FILET to "Fish Filet",
            HybridDelightsItems.RAW_RAY_WING to "Raw Ray Wing",
            HybridDelightsItems.BARREL_EYES to "Barrel Eyes",
        ).forEach { (item, translation) ->
            builder.add(item, translation)
        }
    }
}