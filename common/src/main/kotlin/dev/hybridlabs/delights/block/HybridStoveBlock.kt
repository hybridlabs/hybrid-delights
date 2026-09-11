package dev.hybridlabs.delights.block

import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.core.particles.ParticleTypes
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceKey
import net.minecraft.resources.ResourceLocation
import net.minecraft.sounds.SoundEvents
import net.minecraft.sounds.SoundSource
import net.minecraft.util.RandomSource
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResult
import net.minecraft.world.damagesource.DamageSource
import net.minecraft.world.damagesource.DamageType
import net.minecraft.world.entity.Entity
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.FireChargeItem
import net.minecraft.world.item.FlintAndSteelItem
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.Items
import net.minecraft.world.item.ShovelItem
import net.minecraft.world.item.context.BlockPlaceContext
import net.minecraft.world.item.enchantment.EnchantmentHelper
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Mirror
import net.minecraft.world.level.block.Rotation
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.StateDefinition
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.block.state.properties.BooleanProperty
import net.minecraft.world.level.block.state.properties.DirectionProperty
import net.minecraft.world.phys.BlockHitResult

/**
 * A Farmer's Delight style stove that only acts as a heat source.
 *
 * Built on vanilla classes rather than Farmer's Delight's stove, because Farmer's Delight
 * Refabricated for 1.20.1 has no AbstractStoveBlock and its StoveBlock is locked to its own
 * block entity type. Cooking pots and skillets pick it up through the heat_sources tag.
 */
class HybridStoveBlock(
    properties: Properties,
) : Block(properties) {

    companion object {
        val FACING: DirectionProperty = BlockStateProperties.HORIZONTAL_FACING
        val LIT: BooleanProperty = BlockStateProperties.LIT

        private val STOVE_BURN: ResourceKey<DamageType> =
            ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation("farmersdelight", "stove_burn"))
    }

    init {
        registerDefaultState(
            stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(LIT, false)
        )
    }

    override fun use(
        state: BlockState,
        level: Level,
        pos: BlockPos,
        player: Player,
        hand: InteractionHand,
        hit: BlockHitResult,
    ): InteractionResult {
        val heldStack = player.getItemInHand(hand)

        if (state.getValue(LIT)) {
            if (heldStack.item is ShovelItem) {
                extinguish(state, level, pos)
                heldStack.hurtAndBreak(1, player) { it.broadcastBreakEvent(hand) }
                return InteractionResult.sidedSuccess(level.isClientSide)
            }

            if (heldStack.`is`(Items.WATER_BUCKET)) {
                level.playSound(player, pos, SoundEvents.GENERIC_EXTINGUISH_FIRE, SoundSource.BLOCKS, 1.0f, 1.0f)
                extinguish(state, level, pos)
                if (!player.abilities.instabuild) {
                    player.setItemInHand(hand, ItemStack(Items.BUCKET))
                }
                return InteractionResult.sidedSuccess(level.isClientSide)
            }
        } else {
            if (heldStack.item is FlintAndSteelItem) {
                level.playSound(
                    player,
                    pos,
                    SoundEvents.FLINTANDSTEEL_USE,
                    SoundSource.BLOCKS,
                    1.0f,
                    level.random.nextFloat() * 0.4f + 0.8f
                )
                level.setBlock(pos, state.setValue(LIT, true), UPDATE_ALL_IMMEDIATE)
                heldStack.hurtAndBreak(1, player) { it.broadcastBreakEvent(hand) }
                return InteractionResult.sidedSuccess(level.isClientSide)
            }

            if (heldStack.item is FireChargeItem) {
                level.playSound(
                    player,
                    pos,
                    SoundEvents.FIRECHARGE_USE,
                    SoundSource.BLOCKS,
                    1.0f,
                    (level.random.nextFloat() - level.random.nextFloat()) * 0.2f + 1.0f
                )
                level.setBlock(pos, state.setValue(LIT, true), UPDATE_ALL_IMMEDIATE)
                if (!player.abilities.instabuild) {
                    heldStack.shrink(1)
                }
                return InteractionResult.sidedSuccess(level.isClientSide)
            }
        }

        return InteractionResult.PASS
    }

    private fun extinguish(state: BlockState, level: Level, pos: BlockPos) {
        level.setBlock(pos, state.setValue(LIT, false), UPDATE_CLIENTS)
        level.playLocalSound(
            pos.x + 0.5,
            pos.y.toDouble(),
            pos.z + 0.5,
            SoundEvents.FIRE_EXTINGUISH,
            SoundSource.BLOCKS,
            0.5f,
            2.6f,
            false
        )
    }

    override fun stepOn(level: Level, pos: BlockPos, state: BlockState, entity: Entity) {
        if (state.getValue(LIT)
            && !entity.fireImmune()
            && entity is LivingEntity
            && !EnchantmentHelper.hasFrostWalker(entity)
        ) {
            entity.hurt(stoveBurn(level), 1.0f)
        }

        super.stepOn(level, pos, state, entity)
    }

    // Farmer's Delight's damage type is data driven, so fall back to magma's if it is missing.
    private fun stoveBurn(level: Level): DamageSource {
        return level.registryAccess()
            .registryOrThrow(Registries.DAMAGE_TYPE)
            .getHolder(STOVE_BURN)
            .map { DamageSource(it) }
            .orElseGet { level.damageSources().hotFloor() }
    }

    override fun getStateForPlacement(context: BlockPlaceContext): BlockState {
        return defaultBlockState()
            .setValue(FACING, context.horizontalDirection.opposite)
            .setValue(LIT, true)
    }

    override fun createBlockStateDefinition(builder: StateDefinition.Builder<Block, BlockState>) {
        super.createBlockStateDefinition(builder)
        builder.add(FACING, LIT)
    }

    override fun rotate(state: BlockState, rotation: Rotation): BlockState {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)))
    }

    override fun mirror(state: BlockState, mirror: Mirror): BlockState {
        return state.rotate(mirror.getRotation(state.getValue(FACING)))
    }

    override fun animateTick(
        state: BlockState,
        level: Level,
        pos: BlockPos,
        random: RandomSource,
    ) {
        if (state.getValue(LIT)) {
            val x = pos.x.toDouble() + 0.5
            val y = pos.y.toDouble()
            val z = pos.z.toDouble() + 0.5

            if (random.nextInt(10) == 0) {
                level.playLocalSound(
                    x,
                    y,
                    z,
                    SoundEvents.FURNACE_FIRE_CRACKLE,
                    SoundSource.BLOCKS,
                    1.0f,
                    1.0f,
                    false
                )

            }

            val direction = state.getValue(FACING)
            val axis = direction.axis

            val horizontalOffset = random.nextDouble() * 0.6 - 0.3

            val xOffset =
                if (axis == Direction.Axis.X)
                    direction.stepX * 0.52
                else
                    horizontalOffset

            val yOffset = random.nextDouble() * 6.0 / 16.0

            val zOffset =
                if (axis == Direction.Axis.Z)
                    direction.stepZ * 0.52
                else
                    horizontalOffset

            level.addParticle(
                ParticleTypes.SMOKE,
                x + xOffset,
                y + yOffset,
                z + zOffset,
                0.0,
                0.0,
                0.0
            )

            level.addParticle(
                ParticleTypes.FLAME,
                x + xOffset,
                y + yOffset,
                z + zOffset,
                0.0,
                0.0,
                0.0
            )
        }
    }
}
