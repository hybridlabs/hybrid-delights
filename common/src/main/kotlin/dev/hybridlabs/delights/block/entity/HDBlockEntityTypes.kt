package dev.hybridlabs.delights.block.entity

import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.delights.platform.registration.RegistryObject
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.entity.BlockEntityType

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
object HDBlockEntityTypes {
    val SCHIST_STOVE =
        register("schist_stove", ::SchistStoveBlockEntity, HDBlocks.SCHIST_STOVE)
    val CHIMNEYSTONE_STOVE =
        register("chimneystone_stove", ::ChimneystoneStoveBlockEntity, HDBlocks.CHIMNEYSTONE_STOVE)
    val RED_BRINESTONE_STOVE =
        register("red_brinestone_stove", ::RedBrinestoneStoveBlockEntity, HDBlocks.RED_BRINESTONE_STOVE)
    val ORANGE_BRINESTONE_STOVE =
        register("orange_brinestone_stove", ::OrangeBrinestoneStoveBlockEntity, HDBlocks.ORANGE_BRINESTONE_STOVE)
    val YELLOW_BRINESTONE_STOVE =
        register("yellow_brinestone_stove", ::YellowBrinestoneStoveBlockEntity, HDBlocks.YELLOW_BRINESTONE_STOVE)

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