package ru.n08i40k.hexecuteif.forge;

import ru.n08i40k.hexecuteif.HexecuteIfClient;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

/**
 * Forge client loading entrypoint.
 */
public class HexecuteIfClientForge {
    public static void init(FMLClientSetupEvent event) {
        HexecuteIfClient.init();
    }
}
