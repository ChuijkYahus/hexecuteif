package ru.n08i40k.hexecuteif.fabric;

import net.fabricmc.loader.api.FabricLoader;
import ru.n08i40k.hexecuteif.HexecuteIfAbstractions;

import java.nio.file.Path;

public class HexecuteIfAbstractionsImpl {
    /**
     * This is the actual implementation of {@link HexecuteIfAbstractions#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
	
    public static void initPlatformSpecific() {
        HexecuteIfConfigFabric.init();
    }
}
