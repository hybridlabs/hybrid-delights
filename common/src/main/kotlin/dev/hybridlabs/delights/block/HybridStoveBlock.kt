package dev.hybridlabs.delights.block

import dev.hybridlabs.delights.block.entity.HybridStoveBlockEntity
import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.core.particles.ParticleTypes
import net.minecraft.sounds.SoundEvents
import net.minecraft.sounds.SoundSource
import net.minecraft.util.RandomSource
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.HorizontalDirectionalBlock
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.state.BlockState
import vectorwing.farmersdelight.common.block.AbstractStoveBlock
import vectorwing.farmersdelight.common.registry.ModSounds

class HybridStoveBlock(
    properties: Properties,
) : AbstractStoveBlock(properties) {

    override fun newBlockEntity(
        pos: BlockPos,
        state: BlockState,
    ): BlockEntity {
        return HybridStoveBlockEntity(pos, state)
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

            val direction = state.getValue(HorizontalDirectionalBlock.FACING)
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