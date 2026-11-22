package dev.hybridlabs.delights.platform.services;

import dev.hybridlabs.delights.platform.registration.RegistryObject;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.Block;

public class FabricClientPlatformHelper implements ClientPlatformHelper {

    @Override
    public <E extends Entity> void registerEntityRenderer(RegistryObject<EntityType<E>> entityType,
                                                          EntityRendererProvider<E> entityRendererFactory) {
        EntityRendererRegistry.register(entityType.get(), entityRendererFactory);
    }

    @Override
    public void registerBlockRenderers(ChunkSectionLayer layer, Block... blocks) {
        BlockRenderLayerMap.putBlocks(layer, blocks);
    }
}
