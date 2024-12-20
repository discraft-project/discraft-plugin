package io.github.discraftproject.discraftPlugin

import org.bukkit.plugin.java.JavaPlugin

class DiscraftPlugin : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        logger.info("Discraft Plugin Enabled")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
