package dev.hybridlabs.delights.tag

import dev.hybridlabs.delights.compat.ModIds
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.entity.EntityType

object HDEntityTypeTags {
    //#region Hybrid Aquatic Tags
    val ALL_JELLYFISH = createHybridAquaticTag("all_jellyfish")
    //#endregion

    private fun createHybridAquaticTag(id: String): TagKey<EntityType<*>> {
        return TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(ModIds.HYBRID_AQUATIC, id))
    }
}
