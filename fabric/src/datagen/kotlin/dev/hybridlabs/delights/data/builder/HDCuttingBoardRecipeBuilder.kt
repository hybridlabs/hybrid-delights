package dev.hybridlabs.delights.data.builder

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import net.minecraft.advancements.CriterionTriggerInstance
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.data.recipes.FinishedRecipe
import net.minecraft.data.recipes.RecipeBuilder
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.crafting.Ingredient
import net.minecraft.world.item.crafting.RecipeSerializer
import net.minecraft.world.level.ItemLike
import vectorwing.farmersdelight.common.crafting.ingredient.ChanceResult
import vectorwing.farmersdelight.common.registry.ModRecipeSerializers
import java.util.function.Consumer

class HDCuttingBoardRecipeBuilder(
    ingredient: Ingredient,
    tool: Ingredient,
    mainResult: ItemLike,
    count: Int,
    chance: Float,
) : RecipeBuilder {
    private val results: MutableList<ChanceResult> = ArrayList(4)
    private val ingredient: Ingredient
    private val tool: Ingredient
    private var soundEventID: String? = null
    private var namespace: String? = null

    init {
        this.results.add(ChanceResult(ItemStack(mainResult.asItem(), count), chance))
        this.ingredient = ingredient
        this.tool = tool
    }

    @JvmOverloads
    fun addResult(result: ItemLike, count: Int = 1): HDCuttingBoardRecipeBuilder {
        this.results.add(ChanceResult(ItemStack(result.asItem(), count), 1.0f))
        return this
    }

    @JvmOverloads
    fun addResultWithChance(result: ItemLike, chance: Float, count: Int = 1): HDCuttingBoardRecipeBuilder {
        this.results.add(ChanceResult(ItemStack(result.asItem(), count), chance))
        return this
    }

    fun addSound(soundEventID: String): HDCuttingBoardRecipeBuilder {
        this.soundEventID = soundEventID
        return this
    }

    override fun unlockedBy(
        criterionName: String,
        criterionTrigger: CriterionTriggerInstance,
    ): HDCuttingBoardRecipeBuilder {
        return this
    }

    fun setNamespace(namespace: String): HDCuttingBoardRecipeBuilder {
        this.namespace = namespace
        return this
    }

    override fun group(group: String?): HDCuttingBoardRecipeBuilder {
        return this
    }

    override fun getResult(): Item {
        return this.results[0].stack().item
    }

    fun saveToHD(consumer: Consumer<FinishedRecipe>) {
        this.setNamespace("hybrid_delights").save(consumer)
    }

    override fun save(consumer: Consumer<FinishedRecipe>) {
        val id = BuiltInRegistries.ITEM.getKey(this.ingredient.items[0].item)
        val recipeId = ResourceLocation(namespace ?: "hybrid_delights", "cutting/${id.path}")

        this.save(consumer, recipeId)
    }

    override fun save(consumer: Consumer<FinishedRecipe>, recipeId: ResourceLocation) {
        consumer.accept(
            Result(
                recipeId,
                ingredient,
                tool,
                results,
                soundEventID ?: ""
            )
        )
    }

    class Result(
        private val id: ResourceLocation,
        private val ingredient: Ingredient,
        private val tool: Ingredient,
        private val results: MutableList<ChanceResult>,
        private val soundEventID: String,
    ) : FinishedRecipe {
        override fun serializeRecipeData(json: JsonObject) {
            val arrayIngredients = JsonArray()
            arrayIngredients.add(this.ingredient.toJson())
            json.add("ingredients", arrayIngredients)
            json.add("tool", this.tool.toJson())
            val arrayResults = JsonArray()

            for (result in this.results) {
                val jsonobject = JsonObject()
                jsonobject.addProperty("item", BuiltInRegistries.ITEM.getKey(result.stack().item).toString())
                if (result.stack().count > 1) {
                    jsonobject.addProperty("count", result.stack().count)
                }

                if (result.chance() < 1.0f) {
                    jsonobject.addProperty("chance", result.chance())
                }

                arrayResults.add(jsonobject)
            }

            json.add("result", arrayResults)
            if (this.soundEventID.isNotEmpty()) {
                json.addProperty("sound", this.soundEventID)
            }
        }

        override fun getId(): ResourceLocation {
            return this.id
        }

        override fun getType(): RecipeSerializer<*> {
            return ModRecipeSerializers.CUTTING.get() as RecipeSerializer<*>
        }

        override fun serializeAdvancement(): JsonObject? {
            return null
        }

        override fun getAdvancementId(): ResourceLocation? {
            return null
        }
    }

    companion object {
        fun cuttingRecipe(
            ingredient: Ingredient,
            tool: Ingredient,
            mainResult: ItemLike,
            count: Int,
        ): HDCuttingBoardRecipeBuilder {
            return HDCuttingBoardRecipeBuilder(ingredient, tool, mainResult, count, 1.0f)
        }

        fun cuttingRecipe(
            ingredient: Ingredient,
            tool: Ingredient,
            mainResult: ItemLike,
            count: Int,
            chance: Float,
        ): HDCuttingBoardRecipeBuilder {
            return HDCuttingBoardRecipeBuilder(ingredient, tool, mainResult, count, chance)
        }

        fun cuttingRecipe(ingredient: Ingredient, tool: Ingredient, mainResult: ItemLike): HDCuttingBoardRecipeBuilder {
            return HDCuttingBoardRecipeBuilder(ingredient, tool, mainResult, 1, 1.0f)
        }

        fun getDefaultRecipeId(itemLike: ItemLike): ResourceLocation {
            return BuiltInRegistries.ITEM.getKey(itemLike.asItem())
        }
    }
}