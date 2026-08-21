package dev.hybridlabs.delights.data.builder

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import net.minecraft.advancements.Advancement
import net.minecraft.advancements.AdvancementRewards
import net.minecraft.advancements.CriterionTriggerInstance
import net.minecraft.advancements.RequirementsStrategy
import net.minecraft.advancements.critereon.InventoryChangeTrigger
import net.minecraft.advancements.critereon.ItemPredicate
import net.minecraft.advancements.critereon.RecipeUnlockedTrigger
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.data.recipes.FinishedRecipe
import net.minecraft.data.recipes.RecipeBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.item.crafting.Ingredient
import net.minecraft.world.item.crafting.RecipeSerializer
import net.minecraft.world.level.ItemLike
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab
import vectorwing.farmersdelight.common.registry.ModRecipeSerializers
import java.util.*
import java.util.function.Consumer

class HDCookingPotRecipeBuilder : RecipeBuilder {
    private var tab: CookingPotRecipeBookTab? = null
    private val ingredients: MutableList<Ingredient> = ArrayList()
    private lateinit var result: Item
    private var count = 0
    private var cookingTime = 0
    private var experience = 0f
    private var container: Item? = null
    private val advancement = Advancement.Builder.advancement()
    private var namespace: String? = null

    companion object {

        fun cookingPotRecipe(
            resultIn: ItemLike,
            count: Int,
            cookingTime: Int,
            experience: Float,
            container: ItemLike? = null
        ): HDCookingPotRecipeBuilder {
            return HDCookingPotRecipeBuilder().apply {
                this.result = resultIn.asItem()
                this.count = count
                this.cookingTime = cookingTime
                this.experience = experience
                this.container = container?.asItem()
            }
        }
    }

    fun addIngredient(tagIn: TagKey<Item?>): HDCookingPotRecipeBuilder {
        return this.addIngredient(Ingredient.of(tagIn))
    }

    fun addIngredient(itemIn: ItemLike): HDCookingPotRecipeBuilder {
        return this.addIngredient(itemIn, 1)
    }

    fun addIngredient(itemIn: ItemLike, quantity: Int): HDCookingPotRecipeBuilder {
        for (i in 0..<quantity) {
            this.addIngredient(Ingredient.of(*arrayOf(itemIn)))
        }

        return this
    }

    fun addIngredient(ingredientIn: Ingredient): HDCookingPotRecipeBuilder {
        return this.addIngredient(ingredientIn, 1)
    }

    fun addIngredient(ingredientIn: Ingredient, quantity: Int): HDCookingPotRecipeBuilder {
        for (i in 0..<quantity) {
            this.ingredients.add(ingredientIn)
        }

        return this
    }

    override fun unlockedBy(
        criterionName: String,
        criterionTrigger: CriterionTriggerInstance,
    ): HDCookingPotRecipeBuilder {
        this.advancement.addCriterion(criterionName, criterionTrigger)
        return this
    }

    fun unlockedByItems(criterionName: String, vararg items: ItemLike?): HDCookingPotRecipeBuilder {
        return this.unlockedBy(criterionName, InventoryChangeTrigger.TriggerInstance.hasItems(*items))
    }

    fun unlockedByAnyIngredient(vararg items: ItemLike?): HDCookingPotRecipeBuilder {
        this.advancement.addCriterion(
            "has_any_ingredient", InventoryChangeTrigger.TriggerInstance.hasItems(
                *arrayOf<ItemPredicate>(
                    ItemPredicate.Builder.item().of(*items).build()
                )
            )
        )
        return this
    }

    fun setRecipeBookTab(tab: CookingPotRecipeBookTab): HDCookingPotRecipeBuilder {
        this.tab = tab
        return this
    }

    fun setNamespace(namespace: String): HDCookingPotRecipeBuilder {
        this.namespace = namespace
        return this
    }

    override fun group(group: String?): HDCookingPotRecipeBuilder {
        return this
    }

    override fun getResult(): Item {
        return this.result
    }

    fun getDefaultRecipeId(itemLike: ItemLike): ResourceLocation {
        return Objects.requireNonNull(BuiltInRegistries.ITEM.getKey(itemLike.asItem())) as ResourceLocation
    }

    fun saveToHD(consumer: Consumer<FinishedRecipe>) {
        this.setNamespace("hybrid_delights").save(consumer)
    }

    override fun save(consumer: Consumer<FinishedRecipe>) {
        val defaultLocation = getDefaultRecipeId(this.result)
        val recipeId = ResourceLocation(namespace ?: "hybrid_delights", "cooking/${defaultLocation.path}")

        this.save(consumer, recipeId)
    }

    override fun save(consumerIn: Consumer<FinishedRecipe>, recipeId: ResourceLocation) {
        if (!this.advancement.criteria.isEmpty()) {
            this.advancement.parent(ResourceLocation("recipes/root"))
                .addCriterion("has_the_recipe", RecipeUnlockedTrigger.unlocked(recipeId)).rewards(
                    AdvancementRewards.Builder.recipe(recipeId)
                ).requirements(RequirementsStrategy.OR)
            val advancementId = ResourceLocation(recipeId.namespace, "recipes/" + recipeId.path)
            consumerIn.accept(
                Result(
                    recipeId,
                    this.result,
                    this.count,
                    this.ingredients,
                    this.cookingTime,
                    this.experience,
                    this.container,
                    this.tab,
                    this.advancement,
                    advancementId
                )
            )
        } else {
            consumerIn.accept(
                Result(
                    recipeId,
                    this.result,
                    this.count,
                    this.ingredients,
                    this.cookingTime,
                    this.experience,
                    this.container,
                    this.tab
                )
            )
        }
    }

    class Result @JvmOverloads constructor(
        private val id: ResourceLocation,
        private val result: Item,
        private val count: Int,
        private val ingredients: MutableList<Ingredient>,
        private val cookingTime: Int,
        private val experience: Float,
        private val container: Item?,
        private val tab: CookingPotRecipeBookTab?,
        private val advancement: Advancement.Builder? = null as Advancement.Builder?,
        private val advancementId: ResourceLocation? = null as ResourceLocation?,
    ) : FinishedRecipe {
        override fun serializeRecipeData(json: JsonObject) {
            if (this.tab != null) {
                json.addProperty("recipe_book_tab", this.tab.toString())
            }

            val arrayIngredients = JsonArray()

            for (ingredient in this.ingredients) {
                arrayIngredients.add(ingredient.toJson())
            }

            json.add("ingredients", arrayIngredients)
            val objectResult = JsonObject()
            objectResult.addProperty("item", BuiltInRegistries.ITEM.getKey(this.result).toString())
            if (this.count > 1) {
                objectResult.addProperty("count", this.count)
            }

            json.add("result", objectResult)
            if (this.container != null) {
                val objectContainer = JsonObject()
                objectContainer.addProperty("item", BuiltInRegistries.ITEM.getKey(this.container).toString())
                json.add("container", objectContainer)
            }

            if (this.experience > 0.0f) {
                json.addProperty("experience", this.experience)
            }

            json.addProperty("cookingtime", this.cookingTime)
        }

        override fun getId(): ResourceLocation {
            return this.id
        }

        override fun getType(): RecipeSerializer<*> {
            return ModRecipeSerializers.COOKING.get() as RecipeSerializer<*>
        }

        override fun serializeAdvancement(): JsonObject? {
            return this.advancement?.serializeToJson()
        }

        override fun getAdvancementId(): ResourceLocation? {
            return this.advancementId
        }
    }
}