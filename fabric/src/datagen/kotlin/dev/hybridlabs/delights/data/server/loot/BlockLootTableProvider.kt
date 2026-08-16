package dev.hybridlabs.delights.data.server.loot

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.core.HolderLookup
import java.util.concurrent.CompletableFuture

class BlockLootTableProvider(output: FabricDataOutput, registryLookup: CompletableFuture<HolderLookup.Provider>) :
    FabricBlockLootTableProvider(output, registryLookup) {

    override fun generate() {
        }
}