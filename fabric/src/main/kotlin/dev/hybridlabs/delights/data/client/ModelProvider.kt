package dev.hybridlabs.delights.data.client

import dev.hybridlabs.delights.item.HDItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.ModelTemplates

class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockModelGenerators) {}
    
    override fun generateItemModels(generator: ItemModelGenerators) {
        setOf(
        HDItems.BRINE_BOTTLE.get(),
        HDItems.SALT.get(),
        HDItems.PICKLED_HERRING.get(),
        HDItems.PUFFERFISH_SLICE.get(),
        HDItems.COOKED_PUFFERFISH_SLICE.get(),
        HDItems.CARP_ROE.get(),
        HDItems.COD_ROE.get(),
        HDItems.SALMON_ROE.get(),
        HDItems.TROPICAL_FISH_ROE.get(),
        HDItems.BISQUE.get(),
        HDItems.CHOWDER.get(),
        HDItems.CRAB_CAKE.get(),
        HDItems.CRAB_RANGOON.get(),
        HDItems.EEL_NOODLES.get(),
        HDItems.FISHERMANS_PIE.get(),
        HDItems.FISHERMANS_SOUP.get(),
        HDItems.LOBSTER_STEW.get(),
        HDItems.BAKED_STUFFED_LOBSTER.get(),
        HDItems.MASGOUF.get(),
        HDItems.TUNA_ROLL.get(),
        HDItems.FISH_KEBAB.get(),
        HDItems.TUNA_CASSEROLE.get(),
        HDItems.TUNA_SALAD.get(),
        HDItems.TUNA_SANDWICH.get(),
        ).forEach { item ->
            generator.generateFlatItem(item, ModelTemplates.FLAT_ITEM)
        }
    }
}
