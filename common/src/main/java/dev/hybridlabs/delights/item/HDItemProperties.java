package dev.hybridlabs.delights.item;

import dev.hybridlabs.delights.HybridDelightsCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

/**
 * Item ids are assigned to {@link Item.Properties} before the item is constructed. Registration
 * exposes the id being registered here so item factories can build their properties without
 * threading the id through every call site.
 */
public final class HDItemProperties {

    private static final ThreadLocal<ResourceKey<Item>> CURRENT_ID = new ThreadLocal<>();

    private HDItemProperties() {
    }

    public static <T> T withId(String id, Supplier<T> factory) {
        ResourceKey<Item> previous = CURRENT_ID.get();
        CURRENT_ID.set(ResourceKey.create(Registries.ITEM, HybridDelightsCommon.locate(id)));
        try {
            return factory.get();
        } finally {
            CURRENT_ID.set(previous);
        }
    }

    public static Item.Properties props() {
        ResourceKey<Item> id = CURRENT_ID.get();
        if (id == null) {
            throw new IllegalStateException("Item properties must be created during item registration");
        }
        return new Item.Properties().setId(id);
    }
}
