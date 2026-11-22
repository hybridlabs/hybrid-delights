package dev.hybridlabs.delights.block.entity

import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.delights.platform.registration.RegistryObject
import dev.hybridlabs.delights.platform.services.BlockEntityTypeFactory
import net.minecraft.core.BlockPos
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.entity.BlockEntityType
import net.minecraft.world.level.block.state.BlockState

object HDBlockEntityTypes {

    val CABINET =
        register(
            "cabinet",
            ::HybridCabinetBlockEntity,
            HDBlocks.DRIFTWOOD_CABINET
        )

    fun <T : BlockEntity> register(
        id: String,
        factory: (BlockPos, BlockState) -> T,
        vararg validBlocks: RegistryObject<Block>,
    ): RegistryObject<BlockEntityType<T>> {
        return HybridDelightsCommon.BLOCK_ENTITY_TYPES.register(id) {
            BlockEntityTypeFactory.INSTANCE.create(
                { pos, state -> factory(pos, state) },
                *validBlocks.map { it.get() }.toTypedArray()
            )
        }
    }
}
