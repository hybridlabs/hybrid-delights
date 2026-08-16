package dev.hybridlabs.delights.data.server

import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.delights.tag.HDBlockTags
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.tags.BlockTags
import java.util.concurrent.CompletableFuture

class BlockTagProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) :
    FabricTagProvider.BlockTagProvider(output, registriesFuture) {
    override fun addTags(arg: HolderLookup.Provider) {
        // misc
        getOrCreateTagBuilder(HDBlockTags.HEAT_SOURCES)
            .add(HDBlocks.SCHIST_STOVE.get())
            .add(HDBlocks.CHIMNEYSTONE_STOVE.get())
            .add(HDBlocks.RED_BRINESTONE_STOVE.get())
            .add(HDBlocks.ORANGE_BRINESTONE_STOVE.get())
            .add(HDBlocks.YELLOW_BRINESTONE_STOVE.get())

        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
            .add(HDBlocks.SCHIST_STOVE.get())
            .add(HDBlocks.CHIMNEYSTONE_STOVE.get())
            .add(HDBlocks.RED_BRINESTONE_STOVE.get())
            .add(HDBlocks.ORANGE_BRINESTONE_STOVE.get())
            .add(HDBlocks.YELLOW_BRINESTONE_STOVE.get())
    }
}
