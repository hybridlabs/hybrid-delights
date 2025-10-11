package dev.hybridlabs.delights.data.client

import dev.hybridlabs.delights.item.HybridDelightsItemGroups
import dev.hybridlabs.delights.item.HybridDelightsItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.core.registries.BuiltInRegistries

class LanguageProvider(output: FabricDataOutput) : FabricLanguageProvider(output) {
    override fun generateTranslations(builder: TranslationBuilder) {

        // items
        mapOf(
            HybridDelightsItems.CRAB_CAKE.get() to "Crab Cake",
            HybridDelightsItems.CRAB_RANGOON.get() to "Crab Rangoon",
            HybridDelightsItems.BISQUE.get() to "Bisque",
            HybridDelightsItems.LOBSTER_STEW.get() to "Lobster Stew",
            HybridDelightsItems.CHOWDER.get() to "Chowder",
            HybridDelightsItems.FISHERMANS_SOUP.get() to "Fisherman's Soup",
            HybridDelightsItems.FISHERMANS_PIE.get() to "Fisherman's Pie",
            HybridDelightsItems.MASGOUF.get() to "Masgouf",
            HybridDelightsItems.TUNA_SANDWICH.get() to "Tuna Sandwich",
            HybridDelightsItems.TUNA_CASSEROLE.get() to "Tuna Casserole",
            HybridDelightsItems.TUNA_SALAD.get() to "Tuna Salad",
            HybridDelightsItems.EEL_NOODLES.get() to "Eel Noodles",
        ).forEach { (item, translation) ->
            builder.add(item, translation)
        }
    }
}