package dev.hybridlabs.delights.data

import dev.hybridlabs.delights.Constants
import dev.hybridlabs.delights.data.client.LanguageProvider
import dev.hybridlabs.delights.data.client.ModelProvider
import dev.hybridlabs.delights.data.server.BlockLootTableProvider
import dev.hybridlabs.delights.data.server.BlockTagProvider
import dev.hybridlabs.delights.data.server.RecipeProvider
import dev.hybridlabs.delights.data.server.ItemTagProvider
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.minecraft.core.Registry

object HybridDelightsDataGenerator : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(generator: FabricDataGenerator) {
        val pack = generator.createPack()
        pack.addProvider(::LanguageProvider)
        pack.addProvider(::ModelProvider)
        pack.addProvider(::BlockTagProvider)
        pack.addProvider(::ItemTagProvider)
        pack.addProvider(::BlockLootTableProvider)
        pack.addProvider(::RecipeProvider)
    }

    fun <T> filterHybridDelights(registry: Registry<T>): (T & Any) -> Boolean {
        return { o ->
            val id = registry.getKey(o)
            id!!.namespace == Constants.MOD_ID
        }
    }
}