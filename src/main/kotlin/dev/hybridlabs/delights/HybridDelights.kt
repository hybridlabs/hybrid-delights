package dev.hybridlabs.delights

import dev.hybridlabs.delights.item.HybridDelightsItemGroups
import dev.hybridlabs.delights.item.HybridDelightsItems
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object HybridDelights : ModInitializer {
	const val MOD_ID: String = "hybrid_delights"
	const val MOD_NAME: String = "Hybrid Delights"

	private val logger: Logger = LoggerFactory.getLogger(MOD_NAME)

	override fun onInitialize() {
		logger.info("Initializing $MOD_NAME")

		HybridDelightsItems
		HybridDelightsItemGroups
	}
}
