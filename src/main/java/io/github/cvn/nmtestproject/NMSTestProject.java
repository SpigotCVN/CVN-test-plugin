package io.github.cvn.nmtestproject;

import net.minecraft.server.MinecraftServer;
import org.bukkit.craftbukkit.v1_19_R3.CraftServer;
import org.bukkit.plugin.java.JavaPlugin;

public final class NMSTestProject extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        CraftServer server = (CraftServer) getServer();
        MinecraftServer mcserver = server.getServer();

        mcserver.setPort(25565);
        mcserver.setUsesAuthentication(true);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
