package dev.hybridlabs.delights.data.server

import dev.hybridlabs.delights.item.HDItems
import dev.hybridlabs.delights.tag.HDItemTags
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import java.util.concurrent.CompletableFuture

class ItemTagProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) :
    FabricTagProvider.ItemTagProvider(output, registriesFuture) {
    override fun addTags(arg: HolderLookup.Provider) {

        setOf(
            HDItems.CORAL_KNIFE.get(),
            HDItems.SHARK_TOOTH_KNIFE.get(),
        ).forEach { item ->
            getOrCreateTagBuilder(HDItemTags.KNIVES).add(item)
        }
    }
}