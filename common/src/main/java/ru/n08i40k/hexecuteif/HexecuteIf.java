package ru.n08i40k.hexecuteif;

import ru.n08i40k.hexecuteif.registry.HexecuteIfIotaTypeRegistry;
import ru.n08i40k.hexecuteif.registry.HexecuteIfItemRegistry;
import ru.n08i40k.hexecuteif.registry.HexecuteIfPatternRegistry;
import ru.n08i40k.hexecuteif.networking.HexecuteIfNetworking;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is effectively the loading entrypoint for most of your code, at least
 * if you are using Architectury as intended.
 */
public class HexecuteIf {
    public static final String MOD_ID = "hexecuteif";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


    public static void init() {
        LOGGER.info("Hex Execute If says hello!");

        HexecuteIfAbstractions.initPlatformSpecific();
        HexecuteIfItemRegistry.init();
        HexecuteIfIotaTypeRegistry.init();
        HexecuteIfPatternRegistry.init();
		HexecuteIfNetworking.init();

        LOGGER.info(HexecuteIfAbstractions.getConfigDirectory().toAbsolutePath().normalize().toString());
    }

    /**
     * Shortcut for identifiers specific to this mod.
     */
    public static ResourceLocation id(String string) {
        return new ResourceLocation(MOD_ID, string);
    }
}
