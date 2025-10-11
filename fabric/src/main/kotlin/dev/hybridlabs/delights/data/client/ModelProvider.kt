package dev.hybridlabs.delights.data.client

import dev.hybridlabs.delights.item.HybridDelightsItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.ModelTemplates

class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockModelGenerators) {}
    
    override fun generateItemModels(generator: ItemModelGenerators) {
        setOf(
        HybridDelightsItems.BISQUE.get(),
        HybridDelightsItems.CHOWDER.get(),
        HybridDelightsItems.CRAB_CAKE.get(),
        HybridDelightsItems.CRAB_RANGOON.get(),
        HybridDelightsItems.EEL_NOODLES.get(),
        HybridDelightsItems.FISHERMANS_PIE.get(),
        HybridDelightsItems.FISHERMANS_SOUP.get(),
        HybridDelightsItems.LOBSTER_STEW.get(),
        HybridDelightsItems.MASGOUF.get(),
        HybridDelightsItems.TUNA_CASSEROLE.get(),
        HybridDelightsItems.TUNA_SALAD.get(),
        HybridDelightsItems.TUNA_SANDWICH.get(),
        ).forEach { item ->
            generator.generateFlatItem(item, ModelTemplates.FLAT_ITEM)
        }
    }
}
