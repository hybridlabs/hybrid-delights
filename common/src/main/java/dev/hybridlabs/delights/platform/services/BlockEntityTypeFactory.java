package dev.hybridlabs.delights.platform.services;

import dev.hybridlabs.delights.platform.Services;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Creates {@link BlockEntityType}s. Vanilla made the constructor private in 26.1, so each loader
 * provides its own way of constructing them: Fabric via its object builder API, NeoForge via its
 * own public constructor patch.
 */
public interface BlockEntityTypeFactory {
    BlockEntityTypeFactory INSTANCE = Services.load(BlockEntityTypeFactory.class);

    <T extends BlockEntity> BlockEntityType<T> create(Factory<T> factory, Block... blocks);

    @FunctionalInterface
    interface Factory<T extends BlockEntity> {
        T create(BlockPos pos, BlockState state);
    }
}
