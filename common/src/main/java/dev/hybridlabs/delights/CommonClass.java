package dev.hybridlabs.delights;

import dev.hybridlabs.delights.platform.Services;
import dev.hybridlabs.delights.platform.registration.RegistrationProvider;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryType;

import java.nio.file.Path;

import static dev.hybridlabs.delights.Constants.MOD_ID;
import static dev.hybridlabs.delights.Constants.MOD_NAME;

// This class is part of the common project meaning it is shared between all supported loaders. Code
//  written here can only  import and access the vanilla codebase, libraries used by vanilla, and
// optionally third party  libraries that provide  common compatible binaries. This means common
// code can not directly use loader specific concepts  such as Forge events however it will be
// compatible with all supported mod loaders.
public class CommonClass {

    // Create some static RegistrationProviders for reuse elsewhere.
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(BuiltInRegistries.BLOCK, MOD_ID);
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(BuiltInRegistries.ITEM, MOD_ID);
    public static final RegistrationProvider<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            RegistrationProvider.get(BuiltInRegistries.BLOCK_ENTITY_TYPE, MOD_ID);
    public static final RegistrationProvider<CreativeModeTab> CREATIVE_MODE_TABS =
            RegistrationProvider.get(BuiltInRegistries.CREATIVE_MODE_TAB, MOD_ID);
    public static final RegistrationProvider<LootPoolEntryType> LOOT_POOL_ENTRY_TYPE =
            RegistrationProvider.get(BuiltInRegistries.LOOT_POOL_ENTRY_TYPE, MOD_ID);

    public static final Path CONFIG_FILE = Services.PLATFORM.getConfigDir().resolve(MOD_ID + ".json");

    public static ResourceLocation locate(String path) {
        return new ResourceLocation(MOD_ID, path);
    }


    public static void init() {
        if (Services.PLATFORM.isModLoaded(MOD_ID)) {
            Constants.LOG.info("{} loaded.", MOD_NAME);
        }
    }
}
