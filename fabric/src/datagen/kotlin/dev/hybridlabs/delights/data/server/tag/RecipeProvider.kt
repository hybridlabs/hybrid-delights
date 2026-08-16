package dev.hybridlabs.delights.data.server.tag

import dev.hybridlabs.aquatic.item.HAItems
import dev.hybridlabs.aquatic.item.HAPlatformItems
import dev.hybridlabs.blocks.item.HybridBlocksItems
import dev.hybridlabs.delights.item.HDItems
import dev.hybridlabs.delights.tag.HDItemTags
import dev.hybridlabs.fantasticfishery.item.FFItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
import net.fabricmc.fabric.api.recipe.v1.ingredient.DefaultCustomIngredients
import net.minecraft.advancements.critereon.InventoryChangeTrigger
import net.minecraft.advancements.critereon.ItemPredicate
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.data.recipes.RecipeCategory
import net.minecraft.data.recipes.RecipeOutput
import net.minecraft.data.recipes.ShapedRecipeBuilder
import net.minecraft.data.recipes.ShapelessRecipeBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import net.minecraft.world.item.crafting.*
import net.minecraft.world.level.ItemLike
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab
import vectorwing.farmersdelight.common.crafting.ingredient.ItemAbilityIngredient
import vectorwing.farmersdelight.common.registry.ModItems
import vectorwing.farmersdelight.common.tag.CommonTags
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder
import vectorwing.farmersdelight.refabricated.ItemAbility
import java.util.concurrent.CompletableFuture

class RecipeProvider(output: FabricDataOutput, lookupProvider: CompletableFuture<HolderLookup.Provider>) :
    FabricRecipeProvider(output, lookupProvider) {

    val KNIVES = Ingredient.of(CommonTags.Items.TOOLS_KNIFE)

    override fun buildRecipes(exporter: RecipeOutput) {
        cuttingRecipes(exporter)
        knifeRecipes(exporter)
        craftingRecipes(exporter)
        smeltingRecipes(exporter)
        cookingRecipes(exporter)

        coloredStoveRecipe(HDItems.WHITE_STOVE.get(), HybridBlocksItems.WHITE_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.ORANGE_STOVE.get(), HybridBlocksItems.ORANGE_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.MAGENTA_STOVE.get(), HybridBlocksItems.MAGENTA_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.LIGHT_BLUE_STOVE.get(), HybridBlocksItems.LIGHT_BLUE_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.YELLOW_STOVE.get(), HybridBlocksItems.YELLOW_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.LIME_STOVE.get(), HybridBlocksItems.LIME_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.PINK_STOVE.get(), HybridBlocksItems.PINK_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.GRAY_STOVE.get(), HybridBlocksItems.GRAY_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.LIGHT_GRAY_STOVE.get(), HybridBlocksItems.LIGHT_GRAY_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.CYAN_STOVE.get(), HybridBlocksItems.CYAN_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.PURPLE_STOVE.get(), HybridBlocksItems.PURPLE_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.BLUE_STOVE.get(), HybridBlocksItems.BLUE_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.BROWN_STOVE.get(), HybridBlocksItems.BROWN_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.GREEN_STOVE.get(), HybridBlocksItems.GREEN_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.RED_STOVE.get(), HybridBlocksItems.RED_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.BLACK_STOVE.get(), HybridBlocksItems.BLACK_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.CALCITE_STOVE.get(), HybridBlocksItems.POLISHED_CALCITE_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.SCHIST_STOVE.get(), HAItems.SCHIST_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.CHIMNEYSTONE_STOVE.get(), HAItems.CHIMNEYSTONE_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.RED_BRINESTONE_STOVE.get(), HAItems.RED_BRINESTONE_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.ORANGE_BRINESTONE_STOVE.get(), HAItems.ORANGE_BRINESTONE_BRICKS.get())
            .save(exporter)

        coloredStoveRecipe(HDItems.YELLOW_BRINESTONE_STOVE.get(), HAItems.YELLOW_BRINESTONE_BRICKS.get())
            .save(exporter)
    }

    private fun cookingRecipes(exporter: RecipeOutput) {
        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.MORSEL_OF_MORSEL.get(), 3, 100, 1.0f, Items.PAPER)
            .addIngredient(FFItems.MORSEL_BAR.get())
            .addIngredient(Items.SUGAR)
            .addIngredient(Items.SUGAR)
            .unlockedByAnyIngredient(
                FFItems.MORSEL_BAR.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.SALT.get(), 1, 100, 1.0f)
            .addIngredient(HDItems.BRINE_BOTTLE.get())
            .unlockedByAnyIngredient(
                HDItems.BRINE_BOTTLE.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)
        
        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CURED_COD_ROE.get(), 1, 150, 1.0f, Items.GLASS_BOTTLE)
            .addIngredient(HDItems.SALT.get())
            .addIngredient(HDItems.COD_ROE.get())
            .unlockedByAnyIngredient(
                HDItems.SALT.get(), 
                HDItems.COD_ROE.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)
        
        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CURED_SALMON_ROE.get(), 1, 150, 1.0f, Items.GLASS_BOTTLE)
            .addIngredient(HDItems.SALT.get())
            .addIngredient(HDItems.SALMON_ROE.get())
            .unlockedByAnyIngredient(
                HDItems.SALT.get(), 
                HDItems.SALMON_ROE.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)
        
        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CURED_TROPICAL_FISH_ROE.get(), 1, 150, 1.0f, Items.GLASS_BOTTLE)
            .addIngredient(HDItems.SALT.get())
            .addIngredient(HDItems.TROPICAL_FISH_ROE.get())
            .unlockedByAnyIngredient(
                HDItems.SALT.get(), 
                HDItems.TROPICAL_FISH_ROE.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CURED_PLUNDERERS_ROE.get(), 1, 150, 1.0f, Items.GLASS_BOTTLE)
            .addIngredient(HDItems.SALT.get())
            .addIngredient(HDItems.PLUNDERERS_ROE.get())
            .unlockedByAnyIngredient(
                HDItems.SALT.get(),
                HDItems.PLUNDERERS_ROE.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)
        
        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CURED_CARP_ROE.get(), 1, 150, 1.0f, Items.GLASS_BOTTLE)
            .addIngredient(HDItems.SALT.get())
            .addIngredient(HDItems.CARP_ROE.get())
            .unlockedByAnyIngredient(
                HDItems.SALT.get(),
                HDItems.CARP_ROE.get()
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MISC)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.BAKED_STUFFED_LOBSTER.get(), 1, 400, 1.0f)
            .addIngredient(HAItems.RAW_LOBSTER.get())
            .addIngredient(HAItems.RAW_LOBSTER_TAIL.get())
            .addIngredient(HAItems.RAW_CRAB.get())
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/onion")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.RAW_LOBSTER.get())
                        .of(HAItems.RAW_LOBSTER_TAIL.get())
                        .of(HAItems.RAW_CRAB.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.LOBSTER_STEW.get(), 1, 400, 1.0f, Items.BOWL)
            .addIngredient(HAItems.RAW_LOBSTER.get())
            .addIngredient(HAItems.RAW_LOBSTER_TAIL.get())
            .addIngredient(Items.BREAD)
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/onion")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.RAW_LOBSTER.get())
                        .of(HAItems.RAW_LOBSTER_TAIL.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.BISQUE.get(), 1, 300, 1.0f, Items.BOWL)
            .addIngredient(HAItems.RAW_TENTACLE.get())
            .addIngredient(HAItems.RAW_SHRIMP.get())
            .addIngredient(HAItems.UNI.get())
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.RAW_TENTACLE.get())
                        .of(HAItems.RAW_SHRIMP.get())
                        .of(HAItems.UNI.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CHOWDER.get(), 1, 300, 1.0f, Items.BOWL)
            .addIngredient(HAItems.RAW_CRAB.get())
            .addIngredient(ModItems.MILK_BOTTLE.get())
            .addIngredient(Items.POTATO)
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.RAW_CRAB.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CRAB_CAKE.get(), 1, 300, 1.0f)
            .addIngredient(HAItems.RAW_CRAB.get())
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "grains/wheat")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "eggs")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.RAW_CRAB.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CRAB_RANGOON.get(), 1, 200, 1.0f)
            .addIngredient(HAItems.RAW_CRAB.get())
            .addIngredient(ModItems.MILK_BOTTLE.get())
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "dough")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "onion")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.RAW_CRAB.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.TUNA_CASSEROLE.get(), 1, 400, 1.0f, Items.BOWL)
            .addIngredient(HAItems.TUNA.get())
            .addIngredient(ModItems.RAW_PASTA.get())
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "eggs")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.TUNA.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.MASGOUF.get(), 1, 400, 1.0f)
            .addIngredient(HAItems.CARP.get())
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/onion")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.CARP.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.FISHERMANS_SOUP.get(), 1, 200, 1.0f, Items.BOWL)
            .addIngredient(HAItems.RAW_FISH_MEAT.get())
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/onion")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.RAW_FISH_MEAT.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.EEL_NOODLES.get(), 1, 400, 1.0f, Items.BOWL)
            .addIngredient(HAItems.MORAY_EEL.get())
            .addIngredient(ModItems.RAW_PASTA.get())
            .addIngredient(Items.SUGAR)
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.MORAY_EEL.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.FISH_KEBAB.get(), 1, 200, 1.0f, Items.STICK)
            .addIngredient(HAItems.RAW_FISH_MEAT.get())
            .addIngredient(ModItems.COD_SLICE.get())
            .addIngredient(ModItems.SALMON_SLICE.get())
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.RAW_FISH_MEAT.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.FISH_N_CHIPS.get(), 1, 200, 1.0f, Items.STICK)
            .addIngredient(HAItems.RAW_FISH_MEAT.get())
            .addIngredient(Items.POTATO)
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.RAW_FISH_MEAT.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.SHRIMP_FRIED_RICE.get(), 1, 200, 1.0f, Items.BOWL)
            .addIngredient(HAItems.RAW_SHRIMP.get())
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/onion")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "eggs")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/rice")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "vegetables/carrot")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.RAW_SHRIMP.get())
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)
    }

    private fun cuttingRecipes(exporter: RecipeOutput) {

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(FFItems.PLUNDERERS_HOOP.get()),
            KNIVES,
            FFItems.PLUNDERERS_CORE.get(), 1
        )
            .addResultWithChance(HDItems.PLUNDERERS_ROE.get(), 0.5f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.CARP.get()),
            KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResultWithChance(HDItems.CARP_ROE.get(), 0.5f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.TUNA.get()),
            KNIVES,
            HAItems.RAW_FISH_STEAK.get(), 2
        )
            .addResultWithChance(HDItems.FISH_GELATIN.get(), 0.66f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.BLOBFISH.get()),
            KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResultWithChance(HDItems.FISH_GELATIN.get(), 1.0f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.STINGRAY.get()),
            KNIVES,
            HDItems.RAY_WING.get(), 2)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(Items.COD),
            KNIVES,
            ModItems.COD_SLICE.get(), 2)
            .addResult(Items.BONE_MEAL)
            .addResultWithChance(HDItems.COD_ROE.get(), 0.5f)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "farmersdelight",
                    "cutting/cod"
                )
            )

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(Items.SALMON),
            KNIVES,
            ModItems.SALMON_SLICE.get(), 2
        )
            .addResult(Items.BONE_MEAL)
            .addResultWithChance(HDItems.SALMON_ROE.get(), 0.5f)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "farmersdelight",
                    "cutting/salmon"
                )
            )

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(Items.TROPICAL_FISH),
            KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResult(Items.BONE_MEAL)
            .addResultWithChance(HDItems.TROPICAL_FISH_ROE.get(), 0.5f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(Items.PUFFERFISH),
            KNIVES,
            HDItems.PUFFERFISH_SLICE.get(), 2)
            .addResult(Items.BONE_MEAL)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.BLOWFISH.get()),
            KNIVES,
            HDItems.PUFFERFISH_SLICE.get(), 2)
            .addResult(Items.BONE_MEAL)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.RAW_FISH_MEAT.get()),
            KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.RAW_FISH_STEAK.get()),
            KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.COOKED_FISH_STEAK.get()),
            KNIVES,
            HAItems.COOKED_FISH_MEAT.get(), 2
        )
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItems.SALTED_COD.get()),
            KNIVES,
            HDItems.SALTED_COD_SLICE.get(), 2)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItems.SALTED_SALMON.get()),
            KNIVES,
            HDItems.SALTED_SALMON_SLICE.get(), 2)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItemTags.GLOWSLIME_FISH),
            KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResultWithChance(HAItems.GLOWSLIME.get(), 0.75f)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "hybrid_delights",
                    "cutting/glowslime"
                )
            )

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HAItems.HAGFISH.get()),
            KNIVES,
            HAItems.RAW_FISH_MEAT.get(), 2
        )
            .addResultWithChance(HAItems.HAGSLIME.get(), 1.0f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(Items.SPONGE),
            KNIVES,
            HAItems.TUBE_SPONGE.get(), 4)
            .save(exporter)
    }

    private fun knifeRecipes(exporter: RecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, HDItems.CORAL_KNIFE.get())
            .pattern("C")
            .pattern("S")
            .define('C', HAItems.CORAL_CHUNK.get())
            .define('S', Items.STICK)
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.CORAL_CHUNK.get())
                        .build()
                )
            )
            .save(exporter)

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, HDItems.SHARK_TOOTH_KNIFE.get())
            .pattern("C")
            .pattern("S")
            .define('C', HAItems.SHARK_TOOTH.get())
            .define('S', Items.STICK)
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.SHARK_TOOTH.get())
                        .build()
                )
            )
            .save(exporter)
    }

    private fun craftingRecipes(exporter: RecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HDItems.NETHER_BRICK_STOVE.get())
            .pattern("iii")
            .pattern("B B")
            .pattern("BCB")
            .define('B', Items.NETHER_BRICKS)
            .define('C', Items.CAMPFIRE)
            .define('i',
                TagKey.create(
                    Registries.ITEM,
                    ResourceLocation.fromNamespaceAndPath("c", "ingots/iron")
                )
            )
            .unlockedBy(
                "has_campfire",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(Items.CAMPFIRE)
                        .build()
                )
            )
            .save(exporter)

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HDItems.RED_NETHER_BRICK_STOVE.get())
            .pattern("iii")
            .pattern("B B")
            .pattern("BCB")
            .define('B', Items.RED_NETHER_BRICKS)
            .define('C', Items.CAMPFIRE)
            .define('i',
                TagKey.create(
                    Registries.ITEM,
                    ResourceLocation.fromNamespaceAndPath("c", "ingots/iron")
                )
            )
            .unlockedBy(
                "has_campfire",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(Items.CAMPFIRE)
                        .build()
                )
            )
            .save(exporter)

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, HDItems.DRIFTWOOD_CABINET.get())
            .pattern("___")
            .pattern("D D")
            .pattern("___")
            .define('D', HAPlatformItems.DRIFTWOOD_PLANKS.get())
            .define('_', HAPlatformItems.DRIFTWOOD_SLAB.get())
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAPlatformItems.DRIFTWOOD_PLANKS.get())
                        .build()
                )
            )
            .save(exporter)

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, HDItems.FISHERMANS_PIE.get())
            .pattern(" C ")
            .pattern("FEF")
            .pattern(" P ")
            .define('P', ModItems.PIE_CRUST.get())
            .define('F', HAItems.RAW_FISH_STEAK.get())
            .define('C', HAItems.RAW_CRAB.get())
            .define('E', TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "eggs")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.RAW_FISH_STEAK.get())
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.FOOD, HDItems.BRINE_BOTTLE.get(), 4
        )
            .requires(HAPlatformItems.BRINE_BUCKET.get())
            .requires(Items.GLASS_BOTTLE, 4)
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAPlatformItems.BRINE_BUCKET.get())
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.FOOD,
            HDItems.TUNA_ROLL.get(),
            2
        )
            .requires(HAItems.TUNA.get())
            .requires(ModItems.COOKED_RICE.get())
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.TUNA.get())
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.FOOD,
            HDItems.CAVIAR_TOAST.get(),
            2
        )
            .requires(HDItemTags.CURED_ROE)
            .requires(Items.BREAD)
            .unlockedBy(
                "has_roe",
                has(HDItemTags.CURED_ROE)
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.FOOD,
            HDItems.JELLY_TOAST.get(),
            2
        )
            .requires(HDItems.JELLY.get())
            .requires(Items.BREAD)
            .unlockedBy(
                "has_jelly",
                has(HDItems.JELLY.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.FOOD,
            HDItems.TUNA_SALAD.get()
        )
            .requires(HAItems.TUNA.get())
            .requires(Items.BOWL)
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "salad_ingredients")))
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "eggs")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.TUNA.get())
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.FOOD,
            HDItems.TUNA_NACHOS.get()
        )
            .requires(HAItems.TUNA.get())
            .requires(Items.BOWL)
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "crops/cabbage")))
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "bread/wheat")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.TUNA.get())
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.FOOD,
            HDItems.JELLIED_CARP.get()
        )
            .requires(HAItems.CARP.get())
            .requires(HDItems.FISH_GELATIN.get(),2)
            .requires(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "vegetables/carrot")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.CARP.get())
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.TUNA_SANDWICH.get())
            .requires(HAItems.TUNA.get())
            .requires(Items.BREAD)
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "salad_ingredients")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.TUNA.get())
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.PICKLED_HERRING.get())
            .requires(HAItems.HERRING.get())
            .requires(HDItems.BRINE_BOTTLE.get())
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.HERRING.get())
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.PICKLED_BULL_KELP.get())
            .requires(HAItems.BULL_KELP.get())
            .requires(HDItems.BRINE_BOTTLE.get())
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HAItems.BULL_KELP.get())
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.SALTED_COD.get())
            .requires(Items.COD)
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.SALTED_COD_SLICE.get())
            .requires(ModItems.COD_SLICE.get())
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.SALTED_SALMON.get())
            .requires(Items.SALMON)
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.SALTED_SALMON_SLICE.get())
            .requires(ModItems.SALMON_SLICE.get())
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.SALTED_PUFFERFISH_SLICE.get())
            .requires(HDItems.PUFFERFISH_SLICE.get())
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.SALTED_RAY_WING.get())
            .requires(HDItems.RAY_WING.get())
            .requires(HDItems.SALT.get(), 2)
            .unlockedBy(
                "has_salt",
                has(HDItems.SALT.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.FISHSICLE.get())
            .requires(FFItems.FRIGID_VESSEL.get())
            .requires(Items.STICK)
            .unlockedBy(
                "has_frigid_vessel",
                has(FFItems.FRIGID_VESSEL.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.SWEET_BERRY_FISHSICLE.get())
            .requires(FFItems.FRIGID_VESSEL.get())
            .requires(Items.STICK)
            .requires(Items.SWEET_BERRIES)
            .unlockedBy(
                "has_frigid_vessel",
                has(FFItems.FRIGID_VESSEL.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.GLOW_BERRY_FISHSICLE.get())
            .requires(FFItems.FRIGID_VESSEL.get())
            .requires(Items.STICK)
            .requires(Items.GLOW_BERRIES)
            .unlockedBy(
                "has_frigid_vessel",
                has(FFItems.FRIGID_VESSEL.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.MELON_FISHSICLE.get())
            .requires(FFItems.FRIGID_VESSEL.get())
            .requires(Items.STICK)
            .requires(Items.MELON_SLICE)
            .unlockedBy(
                "has_frigid_vessel",
                has(FFItems.FRIGID_VESSEL.get())
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.PUMPKIN_FISHSICLE.get())
            .requires(FFItems.FRIGID_VESSEL.get())
            .requires(Items.STICK)
            .requires(ModItems.PUMPKIN_SLICE.get())
            .unlockedBy(
                "has_frigid_vessel",
                has(FFItems.FRIGID_VESSEL.get())
            )
            .save(exporter)
    }

    private fun smeltingRecipes(exporter: RecipeOutput) {

        offerSmeltingRecipes(
            exporter,
            HDItems.RAY_WING.get(),
            HDItems.COOKED_RAY_WING.get(),
            0.35f
        )

        offerSmeltingRecipes(
            exporter,
            HDItems.PUFFERFISH_SLICE.get(),
            HDItems.COOKED_PUFFERFISH_SLICE.get(),
            0.35f
        )
    }

    private fun offerSmeltingRecipes(exporter: RecipeOutput, input: Item, output: Item, experience: Float) {
        simpleCookingRecipe(
            exporter,
            "smelting",
            RecipeSerializer.SMELTING_RECIPE,
            ::SmeltingRecipe,
            200,
            input,
            output,
            experience
        )
        simpleCookingRecipe(
            exporter,
            "smoking",
            RecipeSerializer.SMOKING_RECIPE,
            ::SmokingRecipe,
            100,
            input,
            output,
            experience
        )
        simpleCookingRecipe(
            exporter,
            "campfire_cooking",
            RecipeSerializer.CAMPFIRE_COOKING_RECIPE,
            ::CampfireCookingRecipe,
            600,
            input,
            output,
            experience
        )
    }

    private fun coloredStoveRecipe(
        output: ItemLike,
        bricks: ItemLike,
    ): ShapedRecipeBuilder {
        return ShapedRecipeBuilder.shaped(RecipeCategory.MISC, output)
            .pattern("iii")
            .pattern("B B")
            .pattern("BCB")
            .define('B', bricks)
            .define('C', Items.CAMPFIRE)
            .define('i', TagKey.create(
                Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "ingots/iron")))
            .unlockedBy(
                "has_campfire",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(Items.CAMPFIRE)
                        .build()
                )
            )
    }

    private fun matchesTool(toolAction: ItemAbility, fallbackTag: TagKey<Item?>): Ingredient {
        return DefaultCustomIngredients.any(ItemAbilityIngredient(toolAction).toVanilla(), Ingredient.of(fallbackTag))
    }
}
