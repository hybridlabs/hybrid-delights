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
    val SHRIMP = create("shrimp")
    val TENTACLE = create("tentacle")
    val UNI = create("uni")
    val FISH_MEAT = create("fish_meat")
    val FISH_STEAK = create("fish_steak")
    val LOBSTER_TAIL = create("lobster_tail")
    val LOBSTER_CLAW = create("lobster_claw")
    val LOBSTER_MEAT = create("lobster_meat")
    val CRAB_MEAT = create("crab_meat")
    val BULL_KELP = create("bull_kelp")
    val BRINE_BUCKET = create("brine_bucket")
    val DRIFTWOOD_LOG = create("driftwood_log")
    val DRIFTWOOD_PLANKS = create("driftwood_planks")
    val DRIFTWOOD_SLAB = create("driftwood_slab")
    val SCHIST = create("schist")
    val CHIMNEYSTONE = create("chimneystone")
    val RED_BRINESTONE = create("red_brinestone")
    val ORANGE_BRINESTONE = create("orange_brinestone")
    val YELLOW_BRINESTONE = create("yellow_brinestone")
    //#endregion

    //#region Hybrid Birds Tags
    val DUCK_MEAT = create("duck_meat")
    val GOOSE_MEAT = create("goose_meat")
    val TURKEY_MEAT = create("turkey_meat")
    val PUFFIN_MEAT = create("puffin_meat")
    val BIRD_EGG = create("bird_egg")
    val COOKED_EGG = create("cooked_egg")
    //#endregion

    //#region Hybrid Blocks Tags
    val WHITE_BRICKS = create("white_bricks")
    val ORANGE_BRICKS = create("orange_bricks")
    val MAGENTA_BRICKS = create("magenta_bricks")
    val LIGHT_BLUE_BRICKS = create("light_blue_bricks")
    val YELLOW_BRICKS = create("yellow_bricks")
    val LIME_BRICKS = create("lime_bricks")
    val PINK_BRICKS = create("pink_bricks")
    val GRAY_BRICKS = create("gray_bricks")
    val LIGHT_GRAY_BRICKS = create("light_gray_bricks")
    val CYAN_BRICKS = create("cyan_bricks")
    val PURPLE_BRICKS = create("purple_bricks")
    val BLUE_BRICKS = create("blue_bricks")
    val BROWN_BRICKS = create("brown_bricks")
    val GREEN_BRICKS = create("green_bricks")
    val RED_BRICKS = create("red_bricks")
    val BLACK_BRICKS = create("black_bricks")
    val CALCITE_BRICKS = create("calcite_bricks")
    //#endregion

    //#region Fantastic Fishery Tags
    val FRIGID_VESSEL = create("frigid_vessel")
    val FUNGILL = create("fungill")
    val BLOOD_EEL = create("blood_eel")
    val POROUS_SHELL = create("porous_shell")
    val PLUNDERERS_HOOP = create("plunderers_hoop")
    val PLUNDERERS_CORE = create("plunderers_core")
    val MORSEL = create("morsel")
    val MORSEL_BAR = create("morsel_bar")
    val MORSEL_POP = create("morsel_pop")
    //#endregion

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
