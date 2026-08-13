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

        getOrCreateTagBuilder(HDItemTags.HAGFISH)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "hagfish"))

        getOrCreateTagBuilder(HDItemTags.GLOWSLIME_FISH)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "anglerfish"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "barreleye"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "dragonfish"))
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "flashlight_fish"))

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

        getOrCreateTagBuilder(HDItemTags.TUBE_SPONGE)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "tube_sponge"))

        getOrCreateTagBuilder(HDItemTags.BULL_KELP)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "bull_kelp"))

        getOrCreateTagBuilder(HDItemTags.CORAL_CHUNK)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "coral_chunk"))

        getOrCreateTagBuilder(HDItemTags.SHARK_TOOTH)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "shark_tooth"))

        getOrCreateTagBuilder(HDItemTags.GLOWSLIME)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "glowslime"))

        getOrCreateTagBuilder(HDItemTags.HAGSLIME)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "hagslime"))

        getOrCreateTagBuilder(HDItemTags.BRINE_BUCKET)
            .addOptional(ResourceLocation.fromNamespaceAndPath("hybrid_aquatic", "brine_bucket"))
    }
}