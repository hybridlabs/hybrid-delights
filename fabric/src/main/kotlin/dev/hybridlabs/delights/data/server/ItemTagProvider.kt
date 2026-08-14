package dev.hybridlabs.delights.data.server

import dev.hybridlabs.delights.item.HDItems
import dev.hybridlabs.delights.tag.HDItemTags
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Items
import java.util.concurrent.CompletableFuture

class ItemTagProvider(output: FabricDataOutput, registriesFuture: CompletableFuture<HolderLookup.Provider>) :
    FabricTagProvider.ItemTagProvider(output, registriesFuture) {
    override fun addTags(arg: HolderLookup.Provider) {

        setOf(
            HDItems.CORAL_KNIFE.get(),
            HDItems.SHARK_TOOTH_KNIFE.get(),
        ).forEach { item ->
            getOrCreateTagBuilder(HDItemTags.KNIVES).add(item)
        }

        setOf(
            HDItems.COD_ROE.get(),
            HDItems.SALMON_ROE.get(),
            HDItems.TROPICAL_FISH_ROE.get(),
            HDItems.CARP_ROE.get(),
        ).forEach { item ->
            getOrCreateTagBuilder(HDItemTags.ROE).add(item)
        }

        setOf(
            HDItems.CURED_COD_ROE.get(),
            HDItems.CURED_SALMON_ROE.get(),
            HDItems.CURED_TROPICAL_FISH_ROE.get(),
            HDItems.CURED_CARP_ROE.get(),
        ).forEach { item ->
            getOrCreateTagBuilder(HDItemTags.CURED_ROE).add(item)
        }

        //#region Hybrid Aquatic Tags
        getOrCreateTagBuilder(HDItemTags.TUNA)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "tuna"))

        getOrCreateTagBuilder(HDItemTags.MACKEREL)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "mackerel"))

        getOrCreateTagBuilder(HDItemTags.HERRING)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "herring"))

        getOrCreateTagBuilder(HDItemTags.PUFFERFISH)
            .add(Items.PUFFERFISH)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "blowfish"))

        getOrCreateTagBuilder(HDItemTags.CARP)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "carp"))

        getOrCreateTagBuilder(HDItemTags.EEL)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "moray_eel"))

        getOrCreateTagBuilder(HDItemTags.RAY)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "stingray"))

        getOrCreateTagBuilder(HDItemTags.SHRIMP)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "raw_shrimp"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "cooked_shrimp"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "raw_crayfish"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "cooked_crayfish"))

        getOrCreateTagBuilder(HDItemTags.TENTACLE)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "raw_tentacle"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "cooked_tentacle"))

        getOrCreateTagBuilder(HDItemTags.UNI)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "uni"))

        getOrCreateTagBuilder(HDItemTags.FISH_MEAT)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "raw_fish_meat"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "cooked_fish_meat"))

        getOrCreateTagBuilder(HDItemTags.FISH_STEAK)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "raw_fish_steak"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "cooked_fish_steak"))

        getOrCreateTagBuilder(HDItemTags.LOBSTER_CLAW)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "raw_lobster"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "cooked_lobster"))

        getOrCreateTagBuilder(HDItemTags.LOBSTER_TAIL)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "raw_lobster_tail"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "cooked_lobster_tail"))

        getOrCreateTagBuilder(HDItemTags.LOBSTER_MEAT)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "raw_lobster"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "cooked_lobster"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "raw_lobster_tail"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "cooked_lobster_tail"))

        getOrCreateTagBuilder(HDItemTags.CRAB_MEAT)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "raw_crab"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "cooked_crab"))

        getOrCreateTagBuilder(HDItemTags.BULL_KELP)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "bull_kelp"))

        getOrCreateTagBuilder(HDItemTags.BRINE_BUCKET)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "brine_bucket"))
        //#endregion

        //#region Hybrid Birds Tags
        getOrCreateTagBuilder(HDItemTags.DUCK_MEAT)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "duck"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "cooked_duck"))
        
        getOrCreateTagBuilder(HDItemTags.GOOSE_MEAT)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "goose"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "cooked_goose"))

        getOrCreateTagBuilder(HDItemTags.TURKEY_MEAT)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "turkey"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "cooked_turkey"))

        getOrCreateTagBuilder(HDItemTags.PUFFIN_MEAT)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "puffin"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "cooked_puffin"))

        getOrCreateTagBuilder(HDItemTags.BIRD_EGG)
            .add(Items.EGG)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "duck_egg"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "goose_egg"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "swan_egg"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "turkey_egg"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "guinea_fowl_egg"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "peacock_egg"))

        getOrCreateTagBuilder(HDItemTags.COOKED_EGG)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_birds", "cooked_egg"))
        //#endregion

        //#region Fantastic Fishery Tags
        getOrCreateTagBuilder(HDItemTags.FRIGID_VESSEL)
            .addOptional(ResourceLocation.fromNamespaceAndPath("fantastic_fishery", "frigid_vessel"))

        getOrCreateTagBuilder(HDItemTags.FUNGILL)
            .addOptional(ResourceLocation.fromNamespaceAndPath("fantastic_fishery", "fungill"))

        getOrCreateTagBuilder(HDItemTags.BLOOD_EEL)
            .addOptional(ResourceLocation.fromNamespaceAndPath("fantastic_fishery", "fungill"))

        getOrCreateTagBuilder(HDItemTags.POROUS_SHELL)
            .addOptional(ResourceLocation.fromNamespaceAndPath("fantastic_fishery", "porous_shell"))

        getOrCreateTagBuilder(HDItemTags.PLUNDERERS_HOOP)
            .addOptional(ResourceLocation.fromNamespaceAndPath("fantastic_fishery", "plunderers_hoop"))

        getOrCreateTagBuilder(HDItemTags.PLUNDERERS_CORE)
            .addOptional(ResourceLocation.fromNamespaceAndPath("fantastic_fishery", "plunderers_core"))

        getOrCreateTagBuilder(HDItemTags.MORSEL)
            .addOptional(ResourceLocation.fromNamespaceAndPath("fantastic_fishery", "morsel"))

        getOrCreateTagBuilder(HDItemTags.MORSEL_BAR)
            .addOptional(ResourceLocation.fromNamespaceAndPath("fantastic_fishery", "morsel_bar"))

        getOrCreateTagBuilder(HDItemTags.MORSEL_POP)
            .addOptional(ResourceLocation.fromNamespaceAndPath("fantastic_fishery", "morsel_pop"))
        //#endregion

        //#region Hybrid API Tags
        getOrCreateTagBuilder(HDItemTags.CORAL_CHUNK)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "coral_chunk"))

        getOrCreateTagBuilder(HDItemTags.SHARK_TOOTH)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "shark_tooth"))

        getOrCreateTagBuilder(HDItemTags.GLOWSLIME)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "glowslime"))
        //#endregion
    }
}