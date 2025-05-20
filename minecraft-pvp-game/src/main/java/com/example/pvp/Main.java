package com.example.pvp;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("PvP Game Plugin Enabled!");
        
        // Register commands
        getCommand("pvp").setExecutor(new commands.PvPCommand());
        
        // Register event listeners
        getServer().getPluginManager().registerEvents(new listeners.PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("PvP Game Plugin Disabled!");
    }
}