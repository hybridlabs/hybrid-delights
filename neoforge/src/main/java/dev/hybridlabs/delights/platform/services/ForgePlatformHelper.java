package dev.hybridlabs.delights.platform.services;

import dev.hybridlabs.delights.Constants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.fml.loading.FMLPaths;

import java.nio.file.Path;

public class ForgePlatformHelper implements PlatformHelper {

    public static IEventBus getEventBus() {
        final ModContainer cont = ModList.get().getModContainerById(Constants.MOD_ID).orElseThrow();
        return cont.getEventBus();
    }

    @Override
    public String getPlatformName() {
        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {
        return !FMLEnvironment.isProduction();
    }

    @Override
    public Path getConfigDir() {
        return FMLPaths.CONFIGDIR.get();
    }
}
