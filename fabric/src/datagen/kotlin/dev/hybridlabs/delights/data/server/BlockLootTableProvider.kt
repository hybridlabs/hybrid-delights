package dev.hybridlabs.delights.data.server

import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.delights.block.HybridStoveBlock
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.core.registries.BuiltInRegistries

class BlockLootTableProvider(output: FabricDataOutput) : FabricBlockLootTableProvider(output) {
    override fun generate() {
        dropSelf(HDBlocks.DRIFTWOOD_CABINET.get())

        BuiltInRegistries.BLOCK
            .filterIsInstance<HybridStoveBlock>()
            .forEach(::dropSelf)
    }
}
