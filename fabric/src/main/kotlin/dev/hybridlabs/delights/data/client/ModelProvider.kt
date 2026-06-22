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
            HDItems.CORAL_KNIFE.get(),
            HDItems.SHARK_TOOTH_KNIFE.get(),

            HDItems.BRINE_BOTTLE.get(),
            HDItems.SALT.get(),
            HDItems.PICKLED_HERRING.get(),
            HDItems.PICKLED_BULL_KELP.get(),

            HDItems.SALTED_COD.get(),
            HDItems.SALTED_COD_SLICE.get(),

            HDItems.SALTED_SALMON.get(),
            HDItems.SALTED_SALMON_SLICE.get(),

            HDItems.RAY_WING.get(),
            HDItems.COOKED_RAY_WING.get(),
            HDItems.SALTED_RAY_WING.get(),

            HDItems.PUFFERFISH_SLICE.get(),
            HDItems.COOKED_PUFFERFISH_SLICE.get(),
            HDItems.SALTED_PUFFERFISH_SLICE.get(),

            HDItems.CARP_ROE.get(),
            HDItems.CURED_CARP_ROE.get(),
            HDItems.COD_ROE.get(),
            HDItems.CURED_COD_ROE.get(),
            HDItems.SALMON_ROE.get(),
            HDItems.CURED_SALMON_ROE.get(),
            HDItems.TROPICAL_FISH_ROE.get(),
            HDItems.CURED_TROPICAL_FISH_ROE.get(),

            HDItems.CAVIAR_TOAST.get(),

            HDItems.FISH_GELATIN.get(),

            HDItems.BISQUE.get(),
            HDItems.CHOWDER.get(),

            HDItems.CRAB_CAKE.get(),
            HDItems.CRAB_RANGOON.get(),

            HDItems.EEL_NOODLES.get(),

            HDItems.FISHERMANS_PIE.get(),
            HDItems.FISHERMANS_SOUP.get(),

            HDItems.LOBSTER_STEW.get(),
            HDItems.BAKED_STUFFED_LOBSTER.get(),
            HDItems.SHRIMP_FRIED_RICE.get(),

            HDItems.JELLIED_CARP.get(),
            HDItems.MASGOUF.get(),
            HDItems.FISH_KEBAB.get(),

            HDItems.TUNA_ROLL.get(),
            HDItems.TUNA_CASSEROLE.get(),
            HDItems.TUNA_SALAD.get(),
            HDItems.TUNA_NACHOS.get(),
            HDItems.TUNA_SANDWICH.get(),
        ).forEach { item ->
            generator.generateFlatItem(item, ModelTemplates.FLAT_ITEM)
        }
    }
}
