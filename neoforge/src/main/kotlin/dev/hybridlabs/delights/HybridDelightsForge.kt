package dev.hybridlabs.delights

import dev.hybridlabs.delights.item.HDItemGroups
import dev.hybridlabs.delights.item.HDItems
import net.neoforged.fml.common.Mod

/**
 * Main mod class. Should be an `object` declaration annotated with `@Mod`.
 * The modid should be declared in this object and should match the modId entry
 * in neoforge.mods.toml.
 */
@Suppress("UnusedExpression")
@Mod(Constants.MOD_ID)
object HybridDelightsForge {
    private val LOGGER = Constants.LOG

    init {
        HybridDelightsCommon.init()

        HDItems
        HDItemGroups
    }
}
