package dev.hybridlabs.delights.data.client

import dev.hybridlabs.delights.data.HybridDelightsDataGenerator
import dev.hybridlabs.delights.item.HybridDelightsItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.*
import net.minecraft.registry.Registries

class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(p0: BlockStateModelGenerator?) {
        null
    }

    override fun generateItemModels(generator: ItemModelGenerator) {
        setOf(

            HybridDelightsItems.CRAB_CAKE
        )
            .filter(HybridDelightsDataGenerator.filterHybridDelights(Registries.ITEM))
            .forEach { item ->
                generator.register(item, Models.GENERATED)
            }
    }
}
