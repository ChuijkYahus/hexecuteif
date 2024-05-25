package ru.n08i40k.hexecuteif.forge;

import dev.architectury.platform.forge.EventBuses;
import ru.n08i40k.hexecuteif.HexecuteIf;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * This is your loading entrypoint on forge, in case you need to initialize
 * something platform-specific.
 */
@Mod(HexecuteIf.MOD_ID)
public class HexecuteIfForge {
    public HexecuteIfForge() {
        // Submit our event bus to let architectury register our content on the right time
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(HexecuteIf.MOD_ID, bus);
        bus.addListener(HexecuteIfClientForge::init);
        HexecuteIf.init();
    }
}
