package ru.n08i40k.hexecuteif.fabric;

import net.fabricmc.api.ClientModInitializer;
import ru.n08i40k.hexecuteif.HexecuteIfClient;

/**
 * Fabric client loading entrypoint.
 */
public class HexecuteIfClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HexecuteIfClient.init();
    }
}
