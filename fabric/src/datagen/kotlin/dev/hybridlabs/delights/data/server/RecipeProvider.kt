package dev.hybridlabs.delights.data.server

import dev.hybridlabs.delights.item.HDItems
import dev.hybridlabs.delights.tag.HDItemTags
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider
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
import net.minecraft.world.item.crafting.CampfireCookingRecipe
import net.minecraft.world.item.crafting.Ingredient
import net.minecraft.world.item.crafting.RecipeSerializer
import net.minecraft.world.item.crafting.SmeltingRecipe
import net.minecraft.world.item.crafting.SmokingRecipe
import net.minecraft.world.level.ItemLike
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab
import vectorwing.farmersdelight.common.registry.ModItems
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder
import java.util.concurrent.CompletableFuture

class RecipeProvider(output: FabricDataOutput, lookupProvider: CompletableFuture<HolderLookup.Provider>) :
    FabricRecipeProvider(output, lookupProvider) {
    val KNIVES: Ingredient =
        Ingredient.of(
            TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "tools/knives"))
        )

    override fun buildRecipes(exporter: RecipeOutput) {
        cuttingRecipes(exporter)
        knifeRecipes(exporter)
        craftingRecipes(exporter)
        smeltingRecipes(exporter)
        cookingRecipes(exporter)

        coloredStoveRecipe(HDItems.WHITE_STOVE.get(), HDItemTags.WHITE_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.ORANGE_STOVE.get(), HDItemTags.ORANGE_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.MAGENTA_STOVE.get(), HDItemTags.MAGENTA_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.LIGHT_BLUE_STOVE.get(), HDItemTags.LIGHT_BLUE_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.YELLOW_STOVE.get(), HDItemTags.YELLOW_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.LIME_STOVE.get(), HDItemTags.LIME_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.PINK_STOVE.get(), HDItemTags.PINK_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.GRAY_STOVE.get(), HDItemTags.GRAY_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.LIGHT_GRAY_STOVE.get(), HDItemTags.LIGHT_GRAY_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.CYAN_STOVE.get(), HDItemTags.CYAN_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.PURPLE_STOVE.get(), HDItemTags.PURPLE_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.BLUE_STOVE.get(), HDItemTags.BLUE_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.BROWN_STOVE.get(), HDItemTags.BROWN_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.GREEN_STOVE.get(), HDItemTags.GREEN_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.RED_STOVE.get(), HDItemTags.RED_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.BLACK_STOVE.get(), HDItemTags.BLACK_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.CALCITE_STOVE.get(), HDItemTags.CALCITE_BRICKS)
            .save(exporter)

        coloredStoveRecipe(HDItems.SCHIST_STOVE.get(), HDItemTags.SCHIST)
            .save(exporter)

        coloredStoveRecipe(HDItems.CHIMNEYSTONE_STOVE.get(), HDItemTags.CHIMNEYSTONE)
            .save(exporter)

        coloredStoveRecipe(HDItems.RED_BRINESTONE_STOVE.get(), HDItemTags.RED_BRINESTONE)
            .save(exporter)

        coloredStoveRecipe(HDItems.ORANGE_BRINESTONE_STOVE.get(), HDItemTags.ORANGE_BRINESTONE)
            .save(exporter)

        coloredStoveRecipe(HDItems.YELLOW_BRINESTONE_STOVE.get(), HDItemTags.YELLOW_BRINESTONE)
            .save(exporter)
    }

    private fun cookingRecipes(exporter: RecipeOutput) {
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
            .addIngredient(HDItemTags.LOBSTER_CLAW)
            .addIngredient(HDItemTags.LOBSTER_TAIL)
            .addIngredient(HDItemTags.CRAB_MEAT)
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/onion")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.LOBSTER_MEAT)
                        .of(HDItemTags.CRAB_MEAT)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.LOBSTER_STEW.get(), 1, 400, 1.0f, Items.BOWL)
            .addIngredient(HDItemTags.LOBSTER_CLAW)
            .addIngredient(HDItemTags.LOBSTER_TAIL)
            .addIngredient(Items.BREAD)
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/onion")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.LOBSTER_MEAT)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.BISQUE.get(), 1, 300, 1.0f, Items.BOWL)
            .addIngredient(HDItemTags.TENTACLE)
            .addIngredient(HDItemTags.SHRIMP)
            .addIngredient(HDItemTags.UNI)
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.TENTACLE)
                        .of(HDItemTags.SHRIMP)
                        .of(HDItemTags.UNI)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CHOWDER.get(), 1, 300, 1.0f, Items.BOWL)
            .addIngredient(HDItemTags.CRAB_MEAT)
            .addIngredient(ModItems.MILK_BOTTLE.get())
            .addIngredient(Items.POTATO)
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.CRAB_MEAT)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CRAB_CAKE.get(), 1, 300, 1.0f)
            .addIngredient(HDItemTags.CRAB_MEAT)
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "grains/wheat")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "eggs")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.CRAB_MEAT)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.CRAB_RANGOON.get(), 1, 200, 1.0f)
            .addIngredient(HDItemTags.CRAB_MEAT)
            .addIngredient(ModItems.MILK_BOTTLE.get())
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "dough")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "onion")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.CRAB_MEAT)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.TUNA_CASSEROLE.get(), 1, 400, 1.0f, Items.BOWL)
            .addIngredient(HDItemTags.TUNA)
            .addIngredient(ModItems.RAW_PASTA.get())
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "eggs")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.TUNA)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.MASGOUF.get(), 1, 400, 1.0f)
            .addIngredient(HDItemTags.CARP)
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/onion")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.CARP)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.FISHERMANS_SOUP.get(), 1, 200, 1.0f, Items.BOWL)
            .addIngredient(HDItemTags.FISH_MEAT)
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/onion")))
            .addIngredient(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.FISH_MEAT)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.EEL_NOODLES.get(), 1, 400, 1.0f, Items.BOWL)
            .addIngredient(HDItemTags.EEL)
            .addIngredient(ModItems.RAW_PASTA.get())
            .addIngredient(Items.SUGAR)
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.EEL)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.FISH_KEBAB.get(), 1, 200, 1.0f, Items.STICK)
            .addIngredient(HDItemTags.FISH_MEAT)
            .addIngredient(ModItems.COD_SLICE.get())
            .addIngredient(ModItems.SALMON_SLICE.get())
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.FISH_MEAT)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.FISH_N_CHIPS.get(), 1, 200, 1.0f, Items.STICK)
            .addIngredient(HDItemTags.FISH_MEAT)
            .addIngredient(Items.POTATO)
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.FISH_MEAT)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)

        CookingPotRecipeBuilder.cookingPotRecipe(
            HDItems.SHRIMP_FRIED_RICE.get(), 1, 200, 1.0f, Items.BOWL)
            .addIngredient(HDItemTags.SHRIMP)
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
                        .of(HDItemTags.SHRIMP)
                        .build()
                )
            )
            .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
            .save(exporter)
    }

    private fun cuttingRecipes(exporter: RecipeOutput) {

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItemTags.PLUNDERERS_HOOP),
            KNIVES,
            HDItems.FISH_CUTLET.get(), 2
        )
            .addResultWithChance(HDItems.PLUNDERERS_ROE.get(), 0.5f)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "hybrid_delights",
                    "cutting/plunderers_hoop"
                )
            )

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItemTags.CARP),
            KNIVES,
            HDItems.FISH_CUTLET.get(), 2
        )
            .addResultWithChance(HDItems.CARP_ROE.get(), 0.5f)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "hybrid_delights",
                    "cutting/carp"
                )
            )

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItemTags.TUNA),
            KNIVES,
            HDItems.FISH_CUTLET.get(), 4)
            .addResultWithChance(HDItems.FISH_GELATIN.get(), 0.66f)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "hybrid_delights",
                    "cutting/fish_gelatin"
                )
            )

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItemTags.RAY),
            KNIVES,
            HDItems.RAY_WING.get(), 2)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "hybrid_delights",
                    "cutting/ray"
                )
            )

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
            HDItems.FISH_CUTLET.get(), 2
        )
            .addResult(Items.BONE_MEAL)
            .addResultWithChance(HDItems.TROPICAL_FISH_ROE.get(), 0.5f)
            .save(exporter)

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItemTags.PUFFERFISH),
            KNIVES,
            HDItems.PUFFERFISH_SLICE.get(), 2)
            .addResult(Items.BONE_MEAL)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "hybrid_delights",
                    "cutting/pufferfish"
                )
            )

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItemTags.FISH_MEAT),
            KNIVES,
            HDItems.FISH_CUTLET.get(), 2)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "hybrid_delights",
                    "cutting/fish_cutlet_from_fish_meat"
                )
            )

        CuttingBoardRecipeBuilder.cuttingRecipe(
            Ingredient.of(HDItemTags.FISH_STEAK),
            KNIVES,
            HDItems.FISH_CUTLET.get(), 4)
            .save(
                exporter,
                ResourceLocation.fromNamespaceAndPath(
                    "hybrid_delights",
                    "cutting/fish_cutlet_from_fish_steak"
                )
            )

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
    }

    private fun knifeRecipes(exporter: RecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, HDItems.CORAL_KNIFE.get())
            .pattern("C")
            .pattern("S")
            .define('C', HDItemTags.CORAL_CHUNK)
            .define('S', Items.STICK)
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.CORAL_CHUNK)
                        .build()
                )
            )
            .save(exporter)

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, HDItems.SHARK_TOOTH_KNIFE.get())
            .pattern("C")
            .pattern("S")
            .define('C', HDItemTags.SHARK_TOOTH)
            .define('S', Items.STICK)
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.SHARK_TOOTH)
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
            .define('D', HDItemTags.DRIFTWOOD_PLANKS)
            .define('_', HDItemTags.DRIFTWOOD_SLAB)
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.DRIFTWOOD_PLANKS)
                        .build()
                )
            )
            .save(exporter)

        ShapedRecipeBuilder.shaped(RecipeCategory.FOOD, HDItems.FISHERMANS_PIE.get())
            .pattern(" C ")
            .pattern("FEF")
            .pattern(" P ")
            .define('P', ModItems.PIE_CRUST.get())
            .define('F', HDItemTags.FISH_STEAK)
            .define('C', HDItemTags.CRAB_MEAT)
            .define('E', TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "eggs")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.FISH_STEAK)
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.FOOD, HDItems.BRINE_BOTTLE.get(), 4
        )
            .requires(HDItemTags.BRINE_BUCKET)
            .requires(Items.GLASS_BOTTLE, 4)
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.BRINE_BUCKET)
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.FOOD,
            HDItems.TUNA_ROLL.get(),
            2
        )
            .requires(HDItemTags.TUNA)
            .requires(ModItems.COOKED_RICE.get())
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.TUNA)
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
            HDItems.TUNA_SALAD.get()
        )
            .requires(HDItemTags.TUNA)
            .requires(Items.BOWL)
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "salad_ingredients")))
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "eggs")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.TUNA)
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.FOOD,
            HDItems.TUNA_NACHOS.get()
        )
            .requires(HDItemTags.TUNA)
            .requires(Items.BOWL)
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "crops/cabbage")))
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "bread/wheat")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.TUNA)
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(
            RecipeCategory.FOOD,
            HDItems.JELLIED_CARP.get()
        )
            .requires(HDItemTags.CARP)
            .requires(HDItems.FISH_GELATIN.get(),2)
            .requires(TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", "vegetables/carrot")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.CARP)
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.TUNA_SANDWICH.get())
            .requires(HDItemTags.TUNA)
            .requires(Items.BREAD)
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "crops/tomato")))
            .requires(TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "salad_ingredients")))
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.TUNA)
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.PICKLED_HERRING.get())
            .requires(HDItemTags.HERRING)
            .requires(HDItems.BRINE_BOTTLE.get())
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.HERRING)
                        .build()
                )
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.PICKLED_BULL_KELP.get())
            .requires(HDItemTags.BULL_KELP)
            .requires(HDItems.BRINE_BOTTLE.get())
            .unlockedBy(
                "has_any_ingredient",
                InventoryChangeTrigger.TriggerInstance.hasItems(
                    ItemPredicate.Builder.item()
                        .of(HDItemTags.BULL_KELP)
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
            .requires(HDItemTags.FRIGID_VESSEL)
            .requires(Items.STICK)
            .unlockedBy(
                "has_frigid_vessel",
                has(HDItemTags.FRIGID_VESSEL)
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.SWEET_BERRY_FISHSICLE.get())
            .requires(HDItemTags.FRIGID_VESSEL)
            .requires(Items.STICK)
            .requires(Items.SWEET_BERRIES)
            .unlockedBy(
                "has_frigid_vessel",
                has(HDItemTags.FRIGID_VESSEL)
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.GLOW_BERRY_FISHSICLE.get())
            .requires(HDItemTags.FRIGID_VESSEL)
            .requires(Items.STICK)
            .requires(Items.GLOW_BERRIES)
            .unlockedBy(
                "has_frigid_vessel",
                has(HDItemTags.FRIGID_VESSEL)
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.MELON_FISHSICLE.get())
            .requires(HDItemTags.FRIGID_VESSEL)
            .requires(Items.STICK)
            .requires(Items.MELON_SLICE)
            .unlockedBy(
                "has_frigid_vessel",
                has(HDItemTags.FRIGID_VESSEL)
            )
            .save(exporter)

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, HDItems.PUMPKIN_FISHSICLE.get())
            .requires(HDItemTags.FRIGID_VESSEL)
            .requires(Items.STICK)
            .requires(ModItems.PUMPKIN_SLICE.get())
            .unlockedBy(
                "has_frigid_vessel",
                has(HDItemTags.FRIGID_VESSEL)
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

        offerSmeltingRecipes(
            exporter,
            HDItems.FISH_CUTLET.get(),
            HDItems.COOKED_FISH_CUTLET.get(),
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
        bricks: TagKey<Item>
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
}
