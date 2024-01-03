package me.zircta.morecarry.listener;

import me.zircta.morecarry.Main;
import net.minecraft.network.play.client.C0DPacketCloseWindow;
import net.weavemc.loader.api.event.PacketEvent;
import net.weavemc.loader.api.event.SubscribeEvent;

public class PacketListener {
    @SubscribeEvent
    public void onRender(PacketEvent event) {
        if (event.getPacket() instanceof C0DPacketCloseWindow) {
            if (Main.enabled) {
                event.setCancelled(true);
            }
        }
    }
}
