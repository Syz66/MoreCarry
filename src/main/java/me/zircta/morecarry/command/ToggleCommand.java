package me.zircta.morecarry.command;

import me.zircta.morecarry.Main;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.weavemc.loader.api.command.Command;
import org.jetbrains.annotations.NotNull;

public class ToggleCommand extends Command {
    public ToggleCommand() {
        super("morecarry");
    }

    @Override
    public void handle(@NotNull String[] args) {
        Main.enabled = !Main.enabled;
        Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText("More Carry: " + Main.enabled));
    }
}
