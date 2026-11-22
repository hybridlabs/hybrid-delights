package dev.hybridlabs.delights.block

import dev.hybridlabs.delights.HybridDelightsCommon
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour

/**
 * Block ids are no longer assigned by the registry, they have to be set on
 * [BlockBehaviour.Properties] before the block is constructed. Registration goes through
 * [HDBlocks.register], which exposes the id being registered here so block factories can build
 * their properties without threading it through every call site.
 */
object HDBlockProperties {
    private val currentId = ThreadLocal<ResourceKey<Block>?>()

    fun <T> withId(id: String, factory: () -> T): T {
        val previous = currentId.get()
        currentId.set(ResourceKey.create(Registries.BLOCK, HybridDelightsCommon.locate(id)))
        try {
            return factory()
        } finally {
            currentId.set(previous)
        }
    }

    private fun id(): ResourceKey<Block> {
        return checkNotNull(currentId.get()) { "Block properties must be created during block registration" }
    }

    fun of(): BlockBehaviour.Properties = BlockBehaviour.Properties.of().setId(id())

    fun ofFullCopy(block: Block): BlockBehaviour.Properties =
        BlockBehaviour.Properties.ofFullCopy(block).setId(id())
}
