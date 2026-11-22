package dev.hybridlabs.delights.block

import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.core.particles.ParticleTypes
import net.minecraft.sounds.SoundEvents
import net.minecraft.sounds.SoundSource
import net.minecraft.util.RandomSource
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResult
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.Items
import net.minecraft.tags.ItemTags
import net.minecraft.world.item.context.BlockPlaceContext
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.HorizontalDirectionalBlock
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.block.state.properties.BooleanProperty
import net.minecraft.world.level.block.state.properties.EnumProperty
import net.minecraft.world.phys.BlockHitResult

/**
 * The decorative stove variants. They share the lit/facing behaviour of Farmer's Delight's stove,
 * but keep their own block type so every brick set can have a matching stove.
 */
class HybridStoveBlock(
    properties: Properties
) : Block(properties) {

    init {
        registerDefaultState(
            stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(LIT, false)
        )
    }

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block, BlockState>) {
        builder.add(FACING, LIT)
    }

    override fun getStateForPlacement(context: BlockPlaceContext): BlockState {
        return defaultBlockState().setValue(FACING, context.horizontalDirection.opposite)
    }

    override fun useItemOn(
        stack: ItemStack,
        state: BlockState,
        level: Level,
        pos: BlockPos,
        player: Player,
        hand: InteractionHand,
        hit: BlockHitResult
    ): InteractionResult {
        if (!state.getValue(LIT) && (stack.`is`(Items.FLINT_AND_STEEL) || stack.`is`(Items.FIRE_CHARGE))) {
            if (!level.isClientSide) {
                level.setBlock(pos, state.setValue(LIT, true), 11)
                level.playSound(
                    null, pos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS,
                    1.0f, level.random.nextFloat() * 0.4f + 0.8f
                )
            }
            return InteractionResult.SUCCESS
        }

        if (state.getValue(LIT) && stack.`is`(ItemTags.SHOVELS)) {
            if (!level.isClientSide) {
                level.setBlock(pos, state.setValue(LIT, false), 11)
                level.playSound(null, pos, SoundEvents.FIRE_EXTINGUISH, SoundSource.BLOCKS, 1.0f, 1.0f)
            }
            return InteractionResult.SUCCESS
        }

        return super.useItemOn(stack, state, level, pos, player, hand, hit)
    }

    override fun stepOn(level: Level, pos: BlockPos, state: BlockState, entity: net.minecraft.world.entity.Entity) {
        if (!level.isClientSide && state.getValue(LIT) && entity is LivingEntity && !entity.fireImmune()) {
            entity.hurt(level.damageSources().hotFloor(), 1.0f)
        }
        super.stepOn(level, pos, state, entity)
    }

    override fun animateTick(
        state: BlockState,
        level: Level,
        pos: BlockPos,
        random: RandomSource
    ) {
        if (!state.getValue(LIT)) return

        val x = pos.x.toDouble() + 0.5
        val y = pos.y.toDouble()
        val z = pos.z.toDouble() + 0.5

        if (random.nextInt(10) == 0) {
            level.playLocalSound(
                x, y, z, SoundEvents.FURNACE_FIRE_CRACKLE, SoundSource.BLOCKS,
                1.0f, 1.0f, false
            )
        }

        val direction = state.getValue(FACING)
        val horizontalOffset = random.nextDouble() * 0.6 - 0.3

        val xOffset =
            if (direction.axis == Direction.Axis.X) direction.stepX * 0.52 else horizontalOffset
        val yOffset = random.nextDouble() * 6.0 / 16.0
        val zOffset =
            if (direction.axis == Direction.Axis.Z) direction.stepZ * 0.52 else horizontalOffset

        level.addParticle(ParticleTypes.SMOKE, x + xOffset, y + yOffset, z + zOffset, 0.0, 0.0, 0.0)
        level.addParticle(ParticleTypes.FLAME, x + xOffset, y + yOffset, z + zOffset, 0.0, 0.0, 0.0)
    }

    companion object {
        val FACING: EnumProperty<Direction> = BlockStateProperties.HORIZONTAL_FACING
        val LIT: BooleanProperty = BlockStateProperties.LIT
    }
}
