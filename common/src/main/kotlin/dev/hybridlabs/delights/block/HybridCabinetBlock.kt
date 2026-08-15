package dev.hybridlabs.delights.block

import dev.hybridlabs.delights.block.entity.HDBlockEntityTypes
import dev.hybridlabs.delights.block.entity.HybridCabinetBlockEntity
import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.server.level.ServerLevel
import net.minecraft.util.RandomSource
import net.minecraft.world.InteractionResult
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.player.Player
import net.minecraft.world.inventory.AbstractContainerMenu
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.context.BlockPlaceContext
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.BaseEntityBlock
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.Mirror
import net.minecraft.world.level.block.RenderShape
import net.minecraft.world.level.block.Rotation
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.block.state.properties.BooleanProperty
import net.minecraft.world.level.block.state.properties.DirectionProperty
import net.minecraft.world.phys.BlockHitResult

class HybridCabinetBlock(
    properties: Properties
) : BaseEntityBlock(properties) {

    override fun codec() = CODEC

    companion object {
        val CODEC = simpleCodec(::HybridCabinetBlock)
        val FACING: DirectionProperty = BlockStateProperties.HORIZONTAL_FACING
        val OPEN: BooleanProperty = BlockStateProperties.OPEN
    }

    constructor() : this(Properties.ofFullCopy(Blocks.BARREL))

    init {
        registerDefaultState(
            stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(OPEN, false)
        )
    }

    override fun newBlockEntity(
        pos: BlockPos,
        state: BlockState
    ): BlockEntity {
        return HybridCabinetBlockEntity(pos, state)
    }

    override fun getRenderShape(state: BlockState): RenderShape {
        return RenderShape.MODEL
    }

    override fun tick(state: BlockState, level: ServerLevel, pos: BlockPos, random: RandomSource) {
        val blockEntity = level.getBlockEntity(pos)

        if (blockEntity is HybridCabinetBlockEntity) {
            blockEntity.recheckOpen()
        }
    }

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block, BlockState>) {
        super.createBlockStateDefinition(builder)
        builder.add(FACING, OPEN)
    }

    override fun getStateForPlacement(context: BlockPlaceContext): BlockState? {
        return defaultBlockState().setValue(
            FACING,
            context.horizontalDirection.opposite
        )
    }

    override fun useWithoutItem(
        state: BlockState,
        level: Level,
        pos: BlockPos,
        player: Player,
        hit: BlockHitResult
    ): InteractionResult {
        if (!level.isClientSide) {
            val blockEntity = level.getBlockEntity(pos)

            if (blockEntity is HybridCabinetBlockEntity) {
                player.openMenu(blockEntity)
            }
        }

        return InteractionResult.SUCCESS
    }

    override fun hasAnalogOutputSignal(state: BlockState): Boolean {
        return true
    }

    override fun getAnalogOutputSignal(
        state: BlockState,
        level: Level,
        pos: BlockPos
    ): Int {
        return AbstractContainerMenu.getRedstoneSignalFromBlockEntity(
            level.getBlockEntity(pos)
        )
    }

    override fun rotate(
        state: BlockState,
        rotation: Rotation
    ): BlockState {
        return state.setValue(
            FACING,
            rotation.rotate(state.getValue(FACING))
        )
    }

    override fun mirror(
        state: BlockState,
        mirror: Mirror
    ): BlockState {
        return state.rotate(
            mirror.getRotation(state.getValue(FACING))
        )
    }
}