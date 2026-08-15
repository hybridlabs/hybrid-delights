package dev.hybridlabs.delights.block

import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.platform.registration.RegistryObject
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.state.BlockBehaviour
import net.minecraft.world.level.block.state.BlockState
import net.minecraft.world.level.block.state.properties.BlockStateProperties
import net.minecraft.world.level.material.MapColor
import vectorwing.farmersdelight.common.block.StoveBlock
import java.util.function.Supplier
import java.util.function.ToIntFunction

object HDBlocks {

    val SCHIST_STOVE = register("schist_stove") {
        SchistStoveBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.TERRACOTTA_BLACK)
                .lightLevel(litBlockEmission(13))
        )
    }

    val CHIMNEYSTONE_STOVE = register("chimneystone_stove") {
        ChimneystoneStoveBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.TERRACOTTA_BROWN)
                .lightLevel(litBlockEmission(13))
        )
    }

    val RED_BRINESTONE_STOVE = register("red_brinestone_stove") {
        RedBrinestoneStoveBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.TERRACOTTA_RED)
                .lightLevel(litBlockEmission(13))
        )
    }

    val ORANGE_BRINESTONE_STOVE = register("orange_brinestone_stove") {
        OrangeBrinestoneStoveBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.TERRACOTTA_ORANGE)
                .lightLevel(litBlockEmission(13))
        )
    }

    val YELLOW_BRINESTONE_STOVE = register("yellow_brinestone_stove") {
        YellowBrinestoneStoveBlock(
            BlockBehaviour.Properties.of()
                .mapColor(MapColor.TERRACOTTA_YELLOW)
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