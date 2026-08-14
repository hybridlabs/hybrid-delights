@file:Suppress("UnstableApiUsage")

package dev.hybridlabs.delights.tag

import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.hapi.tag.HAPIItemTags
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item

object HDItemTags {
    val KNIVES = createConventional("tools/knives")

    val ROE = create("roe")
    val CURED_ROE = create("cured_roe")

    //#region Hybrid Aquatic Tags
    val TUNA = create("tuna")
    val MACKEREL = create("mackerel")
    val HERRING = create("herring")
    val PUFFERFISH = create("pufferfish")
    val CARP = create("carp")
    val EEL = create("eel")
    val RAY = create("ray")
    val HAGFISH = create("hagfish")
    val GLOWSLIME_FISH = create("glowslime_fish")
    val SHRIMP = create("shrimp")
    val TENTACLE = create("tentacle")
    val UNI = create("uni")
    val FISH_MEAT = create("fish_meat")
    val FISH_STEAK = create("fish_steak")
    val LOBSTER_TAIL = create("lobster_tail")
    val LOBSTER_CLAW = create("lobster_claw")
    val LOBSTER_MEAT = create("lobster_meat")
    val CRAB_MEAT = create("crab_meat")
    val TUBE_SPONGE = create("tube_sponge")
    val BULL_KELP = create("bull_kelp")
    val HAGSLIME = create("hagslime")
    val BRINE_BUCKET = create("brine_bucket")
    //#endregion

    //#region Hybrid Birds Tags
    val DUCK_MEAT = create("duck_meat")
    val GOOSE_MEAT = create("goose_meat")
    val TURKEY_MEAT = create("turkey_meat")
    val PUFFIN_MEAT = create("puffin_meat")
    val BIRD_EGG = create("bird_egg")
    val COOKED_EGG = create("cooked_egg")

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
