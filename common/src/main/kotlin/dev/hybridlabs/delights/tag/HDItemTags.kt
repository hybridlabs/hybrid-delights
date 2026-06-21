@file:Suppress("UnstableApiUsage")

package dev.hybridlabs.delights.tag

import dev.hybridlabs.aquatic.CommonClass
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item

object HDItemTags {
    val KNIVES = createConventional("tools/knives")

    private fun create(id: String): TagKey<Item> {
        return TagKey.create(Registries.ITEM, CommonClass.locate(id))
    }

    private fun createConventional(id: String): TagKey<Item> {
		return TagKey.create(Registries.ITEM, ResourceLocation("c", id))
    }
}
