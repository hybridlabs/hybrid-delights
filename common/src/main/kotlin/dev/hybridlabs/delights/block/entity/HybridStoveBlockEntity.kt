package dev.hybridlabs.delights.block.entity

import net.minecraft.core.BlockPos
import net.minecraft.world.level.block.entity.BlockEntity
import net.minecraft.world.level.block.state.BlockState

class HybridStoveBlockEntity(pos: BlockPos, state: BlockState) :
    BlockEntity(HDBlockEntityTypes.STOVE.get(), pos, state) {

}