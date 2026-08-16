@file:Suppress("UnstableApiUsage")

package dev.hybridlabs.delights.tag

import dev.hybridlabs.delights.HybridDelightsCommon
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.level.block.Block

object HDBlockTags {

    val HEAT_SOURCES = createFDTag("heat_sources")

    private fun create(id: String): TagKey<Block> {
        return TagKey.create(Registries.BLOCK, HybridDelightsCommon.locate(id))
    }

    private fun createConventional(id: String): TagKey<Block> {
		return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", id))
    }

    private fun createFDTag(id: String): TagKey<Block> {
		return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("farmersdelight", id))
    }
}
