package dev.hybridlabs.delights.tag

import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.level.block.Block

object HDBlockTags {
    val HEAT_SOURCES = createFarmersDelight("heat_sources")

    private fun createFarmersDelight(id: String): TagKey<Block> {
        return TagKey.create(Registries.BLOCK, ResourceLocation("farmersdelight", id))
    }
}
