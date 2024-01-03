package me.zircta.modtemplate;

import me.zircta.modtemplate.command.TestCommand;
import me.zircta.modtemplate.listener.RenderHandListener;
import net.weavemc.loader.api.ModInitializer;
import net.weavemc.loader.api.command.CommandBus;
import net.weavemc.loader.api.event.EventBus;

public class Main implements ModInitializer {
    @Override
    public void preInit() {
        CommandBus.register(new TestCommand());
        EventBus.subscribe(new RenderHandListener());
    }
}