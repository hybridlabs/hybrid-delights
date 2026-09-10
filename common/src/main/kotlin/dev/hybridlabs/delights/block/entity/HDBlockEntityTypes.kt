package dev.hybridlabs.delights.block.entity

import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.delights.platform.registration.RegistryObject
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.entity.BlockEntityType
import vectorwing.farmersdelight.common.block.entity.CabinetBlockEntity

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
object HDBlockEntityTypes {

    val CABINET =
        register(
            "cabinet",
            ::CabinetBlockEntity,
            HDBlocks.DRIFTWOOD_CABINET
        )

    fun <T : BlockEntity?> register(
        id: String,
        factory: BlockEntityType.BlockEntitySupplier<T>, vararg validBlocks: RegistryObject<Block>?,
    ): RegistryObject<BlockEntityType<T?>> {

        return HybridDelightsCommon.BLOCK_ENTITY_TYPES.register(id) {
            val blocks = validBlocks.map { block -> block?.get() }.toTypedArray()
            val builder = BlockEntityType.Builder.of(factory, *blocks)
            builder.build(null)
        }
    }
}