package fr.mxlily.just2craft.spawnmobs;

import fr.mxlily.just2craft.spawnmobs.config.ConfigController;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {
    public void onEnable() {
        (new ConfigController(this)).init();
        log("Load Config files");
        getServer().getPluginManager().registerEvents( new Event(), this);
    }

    @Override
    public void onDisable() {
    }

    /**
     * Log functions
     */

    public void log(String message) {
        this.getLogger().info("[SpawnMobs] " + message);
    }

    public void error(String message) {
        this.getLogger().info("Error: " + message);
    }
}
