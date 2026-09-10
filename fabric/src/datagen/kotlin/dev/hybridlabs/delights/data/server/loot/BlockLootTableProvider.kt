package dev.hybridlabs.delights.data.server.loot

import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.delights.block.HybridStoveBlock
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.BuiltInRegistries
import java.util.concurrent.CompletableFuture

class BlockLootTableProvider(output: FabricDataOutput, registryLookup: CompletableFuture<HolderLookup.Provider>) :
    FabricBlockLootTableProvider(output, registryLookup) {

    override fun generate() {
        dropSelf(HDBlocks.DRIFTWOOD_CABINET.get())

        BuiltInRegistries.BLOCK
            .filterIsInstance<HybridStoveBlock>()
            .forEach(::dropSelf)
    }
}
