package me.zircta.modtemplate.listener;

import net.weavemc.loader.api.event.RenderHandEvent;
import net.weavemc.loader.api.event.SubscribeEvent;

public class RenderHandListener {
    @SubscribeEvent
    public void onRender(RenderHandEvent event) {
        event.setCancelled(true);
    }
}
