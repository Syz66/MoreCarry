package me.zircta.morecarry;

import me.zircta.morecarry.command.ToggleCommand;
import me.zircta.morecarry.listener.PacketListener;
import net.weavemc.loader.api.ModInitializer;
import net.weavemc.loader.api.command.CommandBus;
import net.weavemc.loader.api.event.EventBus;

public class Main implements ModInitializer {
    public static boolean enabled;

    @Override
    public void preInit() {
        CommandBus.register(new ToggleCommand());
        EventBus.subscribe(new PacketListener());
        enabled = true;
    }
}