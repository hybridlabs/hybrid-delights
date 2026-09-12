package dev.hybridlabs.delights.tag

import dev.hybridlabs.hapi.tag.HAPIEntityTags
import net.minecraft.tags.TagKey
import net.minecraft.world.entity.EntityType

object HDEntityTypeTags {
    //#region Hybrid API Tags
    // Hybrid Aquatic's jellyfish are tagged by Hybrid API, under the hapi namespace rather than
    // hybrid_aquatic, and other mods' jellyfish land in the same tag.
    val ALL_JELLYFISH: TagKey<EntityType<*>> = HAPIEntityTags.ALL_JELLYFISH
    //#endregion
}
