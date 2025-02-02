package com.br.riccskn;

import com.br.riccskn.listener.EventListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
      getLogger().info("Enabling plugin...");

       getLogger().info("Registering listeners...");
       registerListeners();

       getLogger().info("Registering commands...");
       registerCommands();
    }


    private void registerListeners() {
      getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    private void registerCommands() {

    }

    private void registerTasks() {

    }
}
