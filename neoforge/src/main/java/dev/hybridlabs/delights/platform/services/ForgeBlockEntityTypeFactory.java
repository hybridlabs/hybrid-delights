package dev.hybridlabs.delights.platform.services;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ForgeBlockEntityTypeFactory implements BlockEntityTypeFactory {

    @Override
    public <T extends BlockEntity> BlockEntityType<T> create(Factory<T> factory, Block... blocks) {
        return new BlockEntityType<>(factory::create, blocks);
    }
}
