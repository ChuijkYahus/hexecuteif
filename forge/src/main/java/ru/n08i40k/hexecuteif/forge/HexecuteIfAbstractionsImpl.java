package ru.n08i40k.hexecuteif.forge;

import ru.n08i40k.hexecuteif.HexecuteIfAbstractions;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class HexecuteIfAbstractionsImpl {
    /**
     * This is the actual implementation of {@link HexecuteIfAbstractions#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }
	
    public static void initPlatformSpecific() {
        HexecuteIfConfigForge.init();
    }
}
