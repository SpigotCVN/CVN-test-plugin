package io.github.cvn.testplugin;

import net.minecraft.server.MinecraftServer;
import org.bukkit.craftbukkit.v1_19_R3.CraftServer;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestProject extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        CraftServer server = (CraftServer) getServer();
        MinecraftServer mcserver = server.getServer();

        mcserver.setMotd("eee");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
