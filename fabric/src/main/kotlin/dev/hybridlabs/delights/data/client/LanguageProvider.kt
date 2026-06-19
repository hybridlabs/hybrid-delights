package dev.hybridlabs.delights.data.client

import dev.hybridlabs.delights.item.HDItemGroups
import dev.hybridlabs.delights.item.HDItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider
import net.minecraft.core.registries.BuiltInRegistries

class LanguageProvider(output: FabricDataOutput) : FabricLanguageProvider(output) {
    override fun generateTranslations(builder: TranslationBuilder) {
        // item group
        builder.add(
            BuiltInRegistries.CREATIVE_MODE_TAB.getResourceKey(HDItemGroups.HYBRID_DELIGHTS.get())
                .orElseThrow { IllegalStateException("Item group not registered") }, "Hybrid Delights"
        )

        // items
        mapOf(
            HDItems.CRAB_CAKE.get() to "Crab Cake",
            HDItems.CRAB_RANGOON.get() to "Crab Rangoon",
            HDItems.BISQUE.get() to "Bisque",
            HDItems.LOBSTER_STEW.get() to "Lobster Stew",
            HDItems.BAKED_STUFFED_LOBSTER.get() to "Baked Stuffed Lobster",
            HDItems.CHOWDER.get() to "Chowder",
            HDItems.FISHERMANS_SOUP.get() to "Fisherman's Soup",
            HDItems.FISHERMANS_PIE.get() to "Fisherman's Pie",
            HDItems.MASGOUF.get() to "Masgouf",
            HDItems.TUNA_SANDWICH.get() to "Tuna Sandwich",
            HDItems.TUNA_CASSEROLE.get() to "Tuna Casserole",
            HDItems.TUNA_SALAD.get() to "Tuna Salad",
            HDItems.EEL_NOODLES.get() to "Eel Noodles",
        ).forEach { (item, translation) ->
            builder.add(item, translation)
        }
    }
}