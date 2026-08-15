package dev.hybridlabs.delights.block

import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.platform.registration.RegistryObject
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.material.MapColor
import java.util.function.Supplier
import java.util.function.ToIntFunction

object HDBlocks {

    val DRIFTWOOD_CABINET = register("driftwood_cabinet") {
        HybridCabinetBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BARREL)
                .mapColor(MapColor.COLOR_LIGHT_GRAY)
        )
    }

    val SCHIST_STOVE = register("schist_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_BLACK)
                .lightLevel(litBlockEmission(13))
        )
    }

    val CHIMNEYSTONE_STOVE = register("chimneystone_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_BROWN)
                .lightLevel(litBlockEmission(13))
        )
    }

    val RED_BRINESTONE_STOVE = register("red_brinestone_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_RED)
                .lightLevel(litBlockEmission(13))
        )
    }

    val ORANGE_BRINESTONE_STOVE = register("orange_brinestone_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_ORANGE)
                .lightLevel(litBlockEmission(13))
        )
    }

    val YELLOW_BRINESTONE_STOVE = register("yellow_brinestone_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_YELLOW)
                .lightLevel(litBlockEmission(13))
        )
    }

    val CALCITE_STOVE = register("calcite_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.CALCITE)
                .mapColor(MapColor.TERRACOTTA_WHITE)
                .lightLevel(litBlockEmission(13))
        )
    }

    val MUD_STOVE = register("mud_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.MUD_BRICKS)
                .mapColor(MapColor.TERRACOTTA_BROWN)
                .lightLevel(litBlockEmission(13))
        )
    }

    val NETHER_BRICK_STOVE = register("nether_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS)
                .mapColor(MapColor.TERRACOTTA_BROWN)
                .lightLevel(litBlockEmission(13))
        )
    }

    val RED_NETHER_BRICK_STOVE = register("red_nether_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS)
                .mapColor(MapColor.TERRACOTTA_RED)
                .lightLevel(litBlockEmission(13))
        )
    }

    val WHITE_STOVE = register("white_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_WHITE)
                .lightLevel(litBlockEmission(13))
        )
    }

    val ORANGE_STOVE = register("orange_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_ORANGE)
                .lightLevel(litBlockEmission(13))
        )
    }

    val MAGENTA_STOVE = register("magenta_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_MAGENTA)
                .lightLevel(litBlockEmission(13))
        )
    }

    val LIGHT_BLUE_STOVE = register("light_blue_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)
                .lightLevel(litBlockEmission(13))
        )
    }

    val YELLOW_STOVE = register("yellow_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_YELLOW)
                .lightLevel(litBlockEmission(13))
        )
    }

    val LIME_STOVE = register("lime_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.COLOR_LIGHT_GREEN)
                .lightLevel(litBlockEmission(13))
        )
    }

    val PINK_STOVE = register("pink_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_PINK)
                .lightLevel(litBlockEmission(13))
        )
    }

    val GRAY_STOVE = register("gray_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_GRAY)
                .lightLevel(litBlockEmission(13))
        )
    }

    val LIGHT_GRAY_STOVE = register("light_gray_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)
                .lightLevel(litBlockEmission(13))
        )
    }

    val CYAN_STOVE = register("cyan_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_CYAN)
                .lightLevel(litBlockEmission(13))
        )
    }

    val PURPLE_STOVE = register("purple_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_PURPLE)
                .lightLevel(litBlockEmission(13))
        )
    }

    val BLUE_STOVE = register("blue_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_BLUE)
                .lightLevel(litBlockEmission(13))
        )
    }

    val BROWN_STOVE = register("brown_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_BROWN)
                .lightLevel(litBlockEmission(13))
        )
    }

    val GREEN_STOVE = register("green_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_GREEN)
                .lightLevel(litBlockEmission(13))
        )
    }

    val RED_STOVE = register("red_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_RED)
                .lightLevel(litBlockEmission(13))
        )
    }

    val BLACK_STOVE = register("black_brick_stove") {
        HybridStoveBlock(
            BlockBehaviour.Properties.ofFullCopy(Blocks.BRICKS)
                .mapColor(MapColor.TERRACOTTA_BLACK)
                .lightLevel(litBlockEmission(13))
        )
    }

    private fun litBlockEmission(lightValue: Int): ToIntFunction<BlockState?> {
            return ToIntFunction { state: BlockState? -> if (state!!.getValue(BlockStateProperties.LIT)) lightValue else 0 }
        }

        fun <T : Block> register(id: String, block: Supplier<T>): RegistryObject<Block> {
            return HybridDelightsCommon.BLOCKS.register(id, block)
        }
}