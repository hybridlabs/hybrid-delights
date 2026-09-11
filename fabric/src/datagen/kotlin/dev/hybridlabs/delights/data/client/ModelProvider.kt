package dev.hybridlabs.delights.data.client

import com.google.gson.JsonObject
import dev.hybridlabs.delights.Constants
import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.delights.item.HDItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.core.Direction
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.blockstates.MultiVariantGenerator
import net.minecraft.data.models.blockstates.PropertyDispatch
import net.minecraft.data.models.blockstates.Variant
import net.minecraft.data.models.blockstates.VariantProperties
import net.minecraft.data.models.model.ModelTemplates
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.properties.BlockStateProperties

class ModelProvider(output: FabricDataOutput) : FabricModelProvider(output) {
    override fun generateBlockStateModels(generator: BlockModelGenerators) {

        orientableCabinet(
            generator,
            HDBlocks.DRIFTWOOD_CABINET.get(),
            "driftwood"
        )

        orientableStove(
            generator,
            HDBlocks.RED_BRINESTONE_STOVE.get(),
            "red_brinestone"
        )

        orientableStove(
            generator,
            HDBlocks.ORANGE_BRINESTONE_STOVE.get(),
            "orange_brinestone"
        )

        orientableStove(
            generator,
            HDBlocks.YELLOW_BRINESTONE_STOVE.get(),
            "yellow_brinestone"
        )

        orientableStove(
            generator,
            HDBlocks.SCHIST_STOVE.get(),
            "schist"
        )

        orientableStove(
            generator,
            HDBlocks.CHIMNEYSTONE_STOVE.get(),
            "chimneystone"
        )

        orientableStove(
            generator,
            HDBlocks.NETHER_BRICK_STOVE.get(),
            "nether_brick"
        )

        orientableStove(
            generator,
            HDBlocks.RED_NETHER_BRICK_STOVE.get(),
            "red_nether_brick"
        )

        orientableStove(
            generator,
            HDBlocks.CALCITE_STOVE.get(),
            "calcite_brick"
        )

        orientableStove(
            generator,
            HDBlocks.MUD_STOVE.get(),
            "mud_brick"
        )

        orientableStove(
            generator,
            HDBlocks.WHITE_STOVE.get(),
            "white_brick"
        )

        orientableStove(
            generator,
            HDBlocks.ORANGE_STOVE.get(),
            "orange_brick"
        )

        orientableStove(
            generator,
            HDBlocks.MAGENTA_STOVE.get(),
            "magenta_brick"
        )

        orientableStove(
            generator,
            HDBlocks.LIGHT_BLUE_STOVE.get(),
            "light_blue_brick"
        )

        orientableStove(
            generator,
            HDBlocks.YELLOW_STOVE.get(),
            "yellow_brick"
        )

        orientableStove(
            generator,
            HDBlocks.LIME_STOVE.get(),
            "lime_brick"
        )

        orientableStove(
            generator,
            HDBlocks.PINK_STOVE.get(),
            "pink_brick"
        )

        orientableStove(
            generator,
            HDBlocks.GRAY_STOVE.get(),
            "gray_brick"
        )

        orientableStove(
            generator,
            HDBlocks.LIGHT_GRAY_STOVE.get(),
            "light_gray_brick"
        )

        orientableStove(
            generator,
            HDBlocks.CYAN_STOVE.get(),
            "cyan_brick"
        )

        orientableStove(
            generator,
            HDBlocks.PURPLE_STOVE.get(),
            "purple_brick"
        )

        orientableStove(
            generator,
            HDBlocks.BLUE_STOVE.get(),
            "blue_brick"
        )

        orientableStove(
            generator,
            HDBlocks.BROWN_STOVE.get(),
            "brown_brick"
        )

        orientableStove(
            generator,
            HDBlocks.GREEN_STOVE.get(),
            "green_brick"
        )

        orientableStove(
            generator,
            HDBlocks.RED_STOVE.get(),
            "red_brick"
        )

        orientableStove(
            generator,
            HDBlocks.BLACK_STOVE.get(),
            "black_brick"
        )
    }

    override fun generateItemModels(generator: ItemModelGenerators) {
        setOf(
            HDItems.BRINE_BOTTLE.get(),
            HDItems.SALT.get(),
            HDItems.PICKLED_HERRING.get(),
            HDItems.PICKLED_BULL_KELP.get(),

            HDItems.SALTED_COD.get(),
            HDItems.SALTED_COD_SLICE.get(),

            HDItems.SALTED_SALMON.get(),
            HDItems.SALTED_SALMON_SLICE.get(),

            HDItems.RAY_WING.get(),
            HDItems.COOKED_RAY_WING.get(),
            HDItems.SALTED_RAY_WING.get(),

            HDItems.PUFFERFISH_SLICE.get(),
            HDItems.COOKED_PUFFERFISH_SLICE.get(),
            HDItems.SALTED_PUFFERFISH_SLICE.get(),

            HDItems.CARP_ROE.get(),
            HDItems.CURED_CARP_ROE.get(),
            HDItems.COD_ROE.get(),
            HDItems.PLUNDERERS_ROE.get(),
            HDItems.CURED_COD_ROE.get(),
            HDItems.SALMON_ROE.get(),
            HDItems.CURED_SALMON_ROE.get(),
            HDItems.TROPICAL_FISH_ROE.get(),
            HDItems.CURED_TROPICAL_FISH_ROE.get(),
            HDItems.CURED_PLUNDERERS_ROE.get(),

            HDItems.CAVIAR_TOAST.get(),

            HDItems.JELLY.get(),
            HDItems.JELLY_TOAST.get(),

            HDItems.FISH_GELATIN.get(),

            HDItems.BISQUE.get(),
            HDItems.CHOWDER.get(),

            HDItems.CRAB_CAKE.get(),
            HDItems.CRAB_RANGOON.get(),

            HDItems.EEL_NOODLES.get(),

            HDItems.FISHERMANS_PIE.get(),
            HDItems.FISHERMANS_SOUP.get(),

            HDItems.LOBSTER_STEW.get(),
            HDItems.BAKED_STUFFED_LOBSTER.get(),
            HDItems.SHRIMP_FRIED_RICE.get(),

            HDItems.JELLIED_CARP.get(),
            HDItems.MASGOUF.get(),
            HDItems.FISH_N_CHIPS.get(),
            HDItems.FISH_KEBAB.get(),

            HDItems.TUNA_ROLL.get(),
            HDItems.TUNA_CASSEROLE.get(),
            HDItems.TUNA_SALAD.get(),
            HDItems.TUNA_NACHOS.get(),
            HDItems.TUNA_SANDWICH.get(),

            HDItems.FISHSICLE.get(),
            HDItems.PARTIALLY_EATEN_FISHSICLE.get(),
            HDItems.MOSTLY_EATEN_FISHSICLE.get(),

            HDItems.SWEET_BERRY_FISHSICLE.get(),
            HDItems.PARTIALLY_EATEN_SWEET_BERRY_FISHSICLE.get(),
            HDItems.MOSTLY_EATEN_SWEET_BERRY_FISHSICLE.get(),

            HDItems.GLOW_BERRY_FISHSICLE.get(),
            HDItems.PARTIALLY_EATEN_GLOW_BERRY_FISHSICLE.get(),
            HDItems.MOSTLY_EATEN_GLOW_BERRY_FISHSICLE.get(),

            HDItems.MELON_FISHSICLE.get(),
            HDItems.PARTIALLY_EATEN_MELON_FISHSICLE.get(),
            HDItems.MOSTLY_EATEN_MELON_FISHSICLE.get(),

            HDItems.PUMPKIN_FISHSICLE.get(),
            HDItems.PARTIALLY_EATEN_PUMPKIN_FISHSICLE.get(),
            HDItems.MOSTLY_EATEN_PUMPKIN_FISHSICLE.get(),

            HDItems.MORSEL_OF_MORSEL.get(),

            ).forEach { item ->
            generator.generateFlatItem(item, ModelTemplates.FLAT_ITEM)
        }
        setOf(
            HDItems.CORAL_KNIFE.get(),
            HDItems.SHARK_TOOTH_KNIFE.get(),
        ).forEach { item ->
            generator.generateFlatItem(item, ModelTemplates.FLAT_HANDHELD_ITEM)
        }
    }

    fun orientableStove(
        generator: BlockModelGenerators,
        block: Block,
        name: String,
    ) {
        val onModelId = HybridDelightsCommon.locate("block/${name}_stove_on")
        val offModelId = HybridDelightsCommon.locate("block/${name}_stove")

        val itemModelId = HybridDelightsCommon.locate("item/${name}_stove")

        val offModel = HybridDelightsCommon.locate("block/${name}_stove")
        val onModel = HybridDelightsCommon.locate("block/${name}_stove_on")

        generator.modelOutput.accept(onModelId) {
            JsonObject().apply {
                addProperty(
                    "parent",
                    "minecraft:block/orientable_with_bottom"
                )

                add("textures", JsonObject().apply {
                    addProperty(
                        "bottom",
                        "${Constants.MOD_ID}:block/${name}_stove_bottom"
                    )
                    addProperty(
                        "front",
                        "${Constants.MOD_ID}:block/${name}_stove_front_on"
                    )
                    addProperty(
                        "side",
                        "${Constants.MOD_ID}:block/${name}_stove_side"
                    )
                    addProperty(
                        "top",
                        "farmersdelight:block/stove_top_on"
                    )
                })
            }
        }

        generator.modelOutput.accept(offModelId) {
            JsonObject().apply {
                addProperty(
                    "parent",
                    "minecraft:block/orientable_with_bottom"
                )

                add("textures", JsonObject().apply {
                    addProperty(
                        "bottom",
                        "${Constants.MOD_ID}:block/${name}_stove_bottom"
                    )
                    addProperty(
                        "front",
                        "${Constants.MOD_ID}:block/${name}_stove_front"
                    )
                    addProperty(
                        "side",
                        "${Constants.MOD_ID}:block/${name}_stove_side"
                    )
                    addProperty(
                        "top",
                        "farmersdelight:block/stove_top"
                    )
                })
            }
        }

        generator.modelOutput.accept(itemModelId) {
            JsonObject().apply {
                addProperty(
                    "parent",
                    "${Constants.MOD_ID}:block/${name}_stove"
                )
            }
        }

        generator.blockStateOutput.accept(
            MultiVariantGenerator.multiVariant(block)
                .with(
                    PropertyDispatch.properties(
                        BlockStateProperties.HORIZONTAL_FACING,
                        BlockStateProperties.LIT
                    )
                        .select(
                            Direction.NORTH,
                            false,
                            Variant.variant().with(VariantProperties.MODEL, offModel)
                        )
                        .select(
                            Direction.NORTH,
                            true,
                            Variant.variant().with(VariantProperties.MODEL, onModel)
                        )
                        .select(
                            Direction.EAST,
                            false,
                            Variant.variant()
                                .with(VariantProperties.MODEL, offModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)
                        )
                        .select(
                            Direction.EAST,
                            true,
                            Variant.variant()
                                .with(VariantProperties.MODEL, onModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)
                        )
                        .select(
                            Direction.SOUTH,
                            false,
                            Variant.variant()
                                .with(VariantProperties.MODEL, offModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)
                        )
                        .select(
                            Direction.SOUTH,
                            true,
                            Variant.variant()
                                .with(VariantProperties.MODEL, onModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)
                        )
                        .select(
                            Direction.WEST,
                            false,
                            Variant.variant()
                                .with(VariantProperties.MODEL, offModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)
                        )
                        .select(
                            Direction.WEST,
                            true,
                            Variant.variant()
                                .with(VariantProperties.MODEL, onModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)
                        )
                )
        )
    }

    fun orientableCabinet(
        generator: BlockModelGenerators,
        block: Block,
        name: String,
    ) {
        val closedModelId = HybridDelightsCommon.locate("block/${name}_cabinet")
        val openModelId = HybridDelightsCommon.locate("block/${name}_cabinet_open")

        val itemModelId = HybridDelightsCommon.locate("item/${name}_cabinet")

        val closedModel = HybridDelightsCommon.locate("block/${name}_cabinet")
        val openModel = HybridDelightsCommon.locate("block/${name}_cabinet_open")

        generator.modelOutput.accept(openModelId) {
            JsonObject().apply {
                addProperty(
                    "parent",
                    "minecraft:block/orientable"
                )

                add("textures", JsonObject().apply {
                    addProperty(
                        "front",
                        "${Constants.MOD_ID}:block/${name}_cabinet_front_open"
                    )
                    addProperty(
                        "side",
                        "${Constants.MOD_ID}:block/${name}_cabinet_side"
                    )
                    addProperty(
                        "top",
                        "${Constants.MOD_ID}:block/${name}_cabinet_top"
                    )
                })
            }
        }

        generator.modelOutput.accept(closedModelId) {
            JsonObject().apply {
                addProperty(
                    "parent",
                    "minecraft:block/orientable"
                )

                add("textures", JsonObject().apply {
                    addProperty(
                        "front",
                        "${Constants.MOD_ID}:block/${name}_cabinet_front"
                    )
                    addProperty(
                        "side",
                        "${Constants.MOD_ID}:block/${name}_cabinet_side"
                    )
                    addProperty(
                        "top",
                        "${Constants.MOD_ID}:block/${name}_cabinet_top"
                    )
                })
            }
        }

        generator.modelOutput.accept(itemModelId) {
            JsonObject().apply {
                addProperty(
                    "parent",
                    "${Constants.MOD_ID}:block/${name}_cabinet"
                )
            }
        }

        generator.blockStateOutput.accept(
            MultiVariantGenerator.multiVariant(block)
                .with(
                    PropertyDispatch.properties(
                        BlockStateProperties.HORIZONTAL_FACING,
                        BlockStateProperties.OPEN
                    )
                        .select(
                            Direction.NORTH,
                            false,
                            Variant.variant().with(VariantProperties.MODEL, closedModel)
                        )
                        .select(
                            Direction.NORTH,
                            true,
                            Variant.variant().with(VariantProperties.MODEL, openModel)
                        )
                        .select(
                            Direction.EAST,
                            false,
                            Variant.variant()
                                .with(VariantProperties.MODEL, closedModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)
                        )
                        .select(
                            Direction.EAST,
                            true,
                            Variant.variant()
                                .with(VariantProperties.MODEL, openModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)
                        )
                        .select(
                            Direction.SOUTH,
                            false,
                            Variant.variant()
                                .with(VariantProperties.MODEL, closedModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)
                        )
                        .select(
                            Direction.SOUTH,
                            true,
                            Variant.variant()
                                .with(VariantProperties.MODEL, openModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180)
                        )
                        .select(
                            Direction.WEST,
                            false,
                            Variant.variant()
                                .with(VariantProperties.MODEL, closedModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)
                        )
                        .select(
                            Direction.WEST,
                            true,
                            Variant.variant()
                                .with(VariantProperties.MODEL, openModel)
                                .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)
                        )
                )
        )
    }
}
