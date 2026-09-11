package dev.hybridlabs.delights.platform;

import dev.hybridlabs.delights.platform.services.ClientPlatformHelper;

import static dev.hybridlabs.delights.platform.Services.load;

public class ClientServices {
    public static final ClientPlatformHelper PLATFORM = load(ClientPlatformHelper.class);
}
