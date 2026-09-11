package dev.hybridlabs.delights.data.server

import dev.hybridlabs.delights.block.HybridStoveBlock
import dev.hybridlabs.delights.tag.HDBlockTags
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.tags.BlockTags
import java.util.concurrent.CompletableFuture

class BlockTagProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) :
    FabricTagProvider.BlockTagProvider(output, registriesFuture) {
    override fun addTags(arg: HolderLookup.Provider) {

        BuiltInRegistries.BLOCK
            .filterIsInstance<HybridStoveBlock>()
            .forEach { stove ->
                getOrCreateTagBuilder(HDBlockTags.HEAT_SOURCES).add(stove)
                getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(stove)
            }
    }
}
