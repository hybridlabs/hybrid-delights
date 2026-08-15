package dev.hybridlabs.delights.block.entity

import net.minecraft.core.BlockPos
import net.minecraft.world.item.crafting.RecipeType
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.phys.Vec2
import vectorwing.farmersdelight.common.block.entity.AbstractStoveBlockEntity
import vectorwing.farmersdelight.common.block.entity.StoveBlockEntity

class YellowBrinestoneStoveBlockEntity(pos: BlockPos, state: BlockState) :
    AbstractStoveBlockEntity(HDBlockEntityTypes.YELLOW_BRINESTONE_STOVE.get(), pos, state, RecipeType.CAMPFIRE_COOKING) {

    override fun getInventorySlotCount(): Int {
        return 6
    }

    override fun getStoveItemOffset(index: Int): Vec2 {
        val X_OFFSET = 0.3f
        val Y_OFFSET = 0.2f
        val OFFSETS = arrayOf(
            Vec2(X_OFFSET, Y_OFFSET),
            Vec2(0.0f, Y_OFFSET),
            Vec2(-X_OFFSET, Y_OFFSET),
            Vec2(X_OFFSET, -Y_OFFSET),
            Vec2(0.0f, -Y_OFFSET),
            Vec2(-X_OFFSET, -Y_OFFSET),
        )
        return OFFSETS[index]
    }

    companion object {
        fun particleTick(level: Level?, pos: BlockPos?, state: BlockState?, stoveEntity: StoveBlockEntity) {
            if (stoveEntity.isEmpty) return
            stoveEntity.addSmokeParticles()
        }
    }
}