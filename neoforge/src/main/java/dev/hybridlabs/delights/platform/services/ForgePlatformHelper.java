package dev.hybridlabs.delights.platform.services;

import dev.hybridlabs.delights.Constants;
import net.minecraft.world.entity.*;

import java.nio.file.Path;

public class ForgePlatformHelper implements PlatformHelper {

    public static net.neoforged.bus.api.IEventBus getEventBus() {
        final net.neoforged.fml.ModContainer cont =
                net.neoforged.fml.ModList.get().getModContainerById(Constants.MOD_ID).orElseThrow();
        return cont.getEventBus();
    }

    @Override
    public String getPlatformName() {

        return "Forge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return net.neoforged.fml.ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !net.neoforged.fml.loading.FMLLoader.isProduction();
    }

    @Override
    public Path getConfigDir() {
        return net.neoforged.fml.loading.FMLPaths.CONFIGDIR.get();
    }

}