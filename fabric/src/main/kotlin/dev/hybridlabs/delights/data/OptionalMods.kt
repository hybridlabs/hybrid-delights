package dev.hybridlabs.delights.data

import com.google.gson.JsonElement

/**
 * Mods Hybrid Delights integrates with but does not require. Data that references any of them has
 * to carry a load condition, or it fails to parse whenever that mod is absent.
 */
object OptionalMods {
    val IDS = setOf(
        "hybrid_aquatic",
        "hybrid_blocks",
        "hybrid_birds",
        "fantastic_fishery",
        "farm_and_charm",
    )

    private val NAMESPACE = Regex("^#?([a-z0-9_.-]+):")

    /** Every optional mod whose namespace appears in a string value or key anywhere in [json]. */
    fun referencedBy(json: JsonElement): Set<String> {
        val found = sortedSetOf<String>()
        fun check(string: String) {
            NAMESPACE.find(string)?.groupValues?.get(1)?.takeIf { it in IDS }?.let(found::add)
        }
        fun walk(element: JsonElement) {
            when {
                element.isJsonObject -> element.asJsonObject.entrySet().forEach { (key, value) ->
                    check(key)
                    walk(value)
                }
                element.isJsonArray -> element.asJsonArray.forEach(::walk)
                element.isJsonPrimitive && element.asJsonPrimitive.isString -> check(element.asString)
            }
        }
        walk(json)
        return found
    }
}
