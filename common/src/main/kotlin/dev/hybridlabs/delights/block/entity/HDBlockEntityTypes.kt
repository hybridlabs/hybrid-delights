package dev.hybridlabs.delights.block.entity

import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.delights.platform.registration.RegistryObject
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.entity.BlockEntityType

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
object HDBlockEntityTypes {

    val STOVE =
        register(
            "stove",
            ::HybridStoveBlockEntity,
            HDBlocks.YELLOW_BRINESTONE_STOVE,
            HDBlocks.ORANGE_BRINESTONE_STOVE,
            HDBlocks.RED_BRINESTONE_STOVE,
            HDBlocks.SCHIST_STOVE,
            HDBlocks.CHIMNEYSTONE_STOVE,
            HDBlocks.RED_STOVE,
            HDBlocks.ORANGE_STOVE,
            HDBlocks.YELLOW_STOVE,
            HDBlocks.GREEN_STOVE,
            HDBlocks.LIME_STOVE,
            HDBlocks.CYAN_STOVE,
            HDBlocks.BLUE_STOVE,
            HDBlocks.LIGHT_BLUE_STOVE,
            HDBlocks.PURPLE_STOVE,
            HDBlocks.MAGENTA_STOVE,
            HDBlocks.PINK_STOVE,
            HDBlocks.WHITE_STOVE,
            HDBlocks.LIGHT_GRAY_STOVE,
            HDBlocks.GRAY_STOVE,
            HDBlocks.BLACK_STOVE,
            HDBlocks.BROWN_STOVE,
            HDBlocks.NETHER_BRICK_STOVE,
            HDBlocks.RED_NETHER_BRICK_STOVE,
            HDBlocks.CALCITE_STOVE,
            HDBlocks.MUD_STOVE,
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