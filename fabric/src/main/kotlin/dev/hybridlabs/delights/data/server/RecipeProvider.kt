package dev.hybridlabs.delights.data.server

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.minecraft.data.recipes.FinishedRecipe
import java.util.function.Consumer

class RecipeProvider(output: FabricDataOutput) : FabricRecipeProvider(output) {

    override fun buildRecipes(exporter: Consumer<FinishedRecipe>) {
    }
}