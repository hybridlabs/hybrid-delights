package dev.hybridlabs.delights.data.server

import dev.hybridlabs.delights.item.HDItems
import dev.hybridlabs.delights.tag.HDItemTags
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.item.Item
import java.util.concurrent.CompletableFuture

class ItemTagProvider(output: FabricPackOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) :
    FabricTagsProvider.ItemTagsProvider(output, registriesFuture) {
    override fun addTags(arg: HolderLookup.Provider) {

        setOf(
            HDItems.CORAL_KNIFE.get(),
            HDItems.SHARK_TOOTH_KNIFE.get(),
        ).forEach { item ->
            builder(HDItemTags.KNIVES).add(key(item))
        }

        setOf(
            HDItems.COD_ROE.get(),
            HDItems.SALMON_ROE.get(),
            HDItems.TROPICAL_FISH_ROE.get(),
            HDItems.CARP_ROE.get(),
        ).forEach { item ->
            builder(HDItemTags.ROE).add(key(item))
        }

        setOf(
            HDItems.CURED_COD_ROE.get(),
            HDItems.CURED_SALMON_ROE.get(),
            HDItems.CURED_TROPICAL_FISH_ROE.get(),
            HDItems.CURED_CARP_ROE.get(),
        ).forEach { item ->
            builder(HDItemTags.CURED_ROE).add(key(item))
        }
    }

    private fun key(item: Item): ResourceKey<Item> =
        BuiltInRegistries.ITEM.getResourceKey(item).orElseThrow()
}
