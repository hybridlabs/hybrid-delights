package dev.hybridlabs.delights.data.client

import dev.hybridlabs.delights.data.HybridDelightsDataGenerator.filterHybridDelights
import dev.hybridlabs.delights.item.HybridDelightsItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.client.BlockStateModelGenerator
import net.minecraft.data.client.ItemModelGenerator
import net.minecraft.data.client.ModelIds
import net.minecraft.data.client.Models
import net.minecraft.item.SpawnEggItem
import net.minecraft.registry.Registries

class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockStateModelGenerator) {
        // spawn eggs
        Registries.ITEM
            .filter(filterHybridDelights(Registries.ITEM))
            .forEach { item ->
                if (item is SpawnEggItem) {
                    generator.registerParentedItemModel(item, ModelIds.getMinecraftNamespacedItem("template_spawn_egg"))
                }
            }
    }
    override fun generateItemModels(generator: ItemModelGenerator) {
        generator.register(HybridDelightsItems.CRAB_CAKE, Models.GENERATED)
        generator.register(HybridDelightsItems.FISH_FILET, Models.GENERATED)
        generator.register(HybridDelightsItems.RAY_WING, Models.GENERATED)
    }
}
