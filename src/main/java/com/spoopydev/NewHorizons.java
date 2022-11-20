package com.spoopydev;
import com.spoopydev.commands.TestCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class NewHorizons extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("test").setExecutor(new TestCommand());
        getLogger().info("Loaded NewHorizons Core");
    }
    @Override
    public void onDisable() {
        getLogger().info("Unloaded NewHorizons Core");
    }
}
