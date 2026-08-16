@file:Suppress("UnstableApiUsage")

package dev.hybridlabs.delights.tag

import dev.hybridlabs.delights.HybridDelightsCommon
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item

object HDItemTags {
    val KNIVES = createConventional("tools/knives")

    val ROE = create("roe")
    val CURED_ROE = create("cured_roe")

    //#region Hybrid API Tags
    val CORAL_CHUNK = createHAPITag("coral_chunk")
    val SHARK_TOOTH = createHAPITag("shark_tooth")
    val GLOWSLIME = createHAPITag("glowslime")
    //#endregion

    private fun create(id: String): TagKey<Item> {
        return TagKey.create(Registries.ITEM, HybridDelightsCommon.locate(id))
    }

    private fun createConventional(id: String): TagKey<Item> {
		return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", id))
    }

    private fun createHAPITag(id: String): TagKey<Item> {
		return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("hapi", id))
    }
}
