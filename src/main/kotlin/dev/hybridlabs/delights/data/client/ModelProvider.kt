package dev.hybridlabs.delights.data.client

import dev.hybridlabs.delights.item.HybridDelightsItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.Models

class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockStateModelGenerator) {

    }
    
    override fun generateItemModels(generator: ItemModelGenerator) {
        generator.register(HybridDelightsItems.CRAB_CAKE, Models.GENERATED)
        generator.register(HybridDelightsItems.CRAB_RANGOON, Models.GENERATED)
        generator.register(HybridDelightsItems.BISQUE, Models.GENERATED)
        generator.register(HybridDelightsItems.FISHERMANS_SOUP, Models.GENERATED)
        generator.register(HybridDelightsItems.BARREL_EYES, Models.GENERATED)
        generator.register(HybridDelightsItems.FISH_FILET, Models.GENERATED)
        generator.register(HybridDelightsItems.RAW_RAY_WING, Models.GENERATED)
    }
}
