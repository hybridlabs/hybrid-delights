package dev.hybridlabs.delights

import dev.hybridlabs.delights.block.HDBlocks
import dev.hybridlabs.delights.block.entity.HDBlockEntityTypes
import dev.hybridlabs.delights.item.HDItemGroups
import dev.hybridlabs.delights.item.HDItems
import dev.hybridlabs.delights.loot.HDLootModification
import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.api.FabricLoader
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object HybridDelights : ModInitializer {
	const val MOD_ID: String = "hybrid_delights"
	const val MOD_NAME: String = "Hybrid Delights"

	private val logger: Logger = LoggerFactory.getLogger(MOD_NAME)

	val loader: FabricLoader = FabricLoader.getInstance()
	val isFarmersDelightLoaded: Boolean = loader.isModLoaded("farmersdelight")

	override fun onInitialize() {
		logger.info("Initializing $MOD_NAME")
        HybridDelightsCommon.init()

        HDBlocks
		HDItems
		HDItemGroups
        HDBlockEntityTypes

        HDLootModification.register()
	}
}
