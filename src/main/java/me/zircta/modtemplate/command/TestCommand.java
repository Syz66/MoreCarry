package me.zircta.modtemplate.command;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import net.weavemc.loader.api.command.Command;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class TestCommand extends Command {
    public TestCommand() {
        super("test", "test1", "test2");
    }

    @Override
    public void handle(@NotNull String[] args) {
        if (args.length > 0) {
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Args: " + Arrays.toString(args)));
        } else {
            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Hello " + Minecraft.getMinecraft().thePlayer.getName() + "!"));
        }
    }
}
