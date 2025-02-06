package com.br.riccskn;

import com.br.riccskn.game.Match;
import com.br.riccskn.game.MatchManager;
import com.br.riccskn.game.listener.MatchEventListener;
import com.br.riccskn.game.task.MatchTask;
import lombok.Getter;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.Set;

@Getter
public class Main extends JavaPlugin {

    private MatchManager matchManager;

    @Override
    public void onEnable() {
      getLogger().info("Enabling plugin...");

       getLogger().info("Registering listeners...");
       getServer().getPluginManager().registerEvents(new MatchEventListener(), this);

       getLogger().info("Registering commands...");
       registerCommands();

       this.matchManager = new MatchManager();

       initArenas();
    }

    private void registerCommands() {

    }

    private void initArenas() {
        File customConfigFile = new File(getDataFolder(), "arena.yml");
        FileConfiguration config = YamlConfiguration.loadConfiguration(customConfigFile);

        ConfigurationSection arenasSection = config.getConfigurationSection("arenas");

        if (arenasSection != null) {
            Set<String> arenaKeys = arenasSection.getKeys(false);

            for (String key : arenaKeys) {
                getLogger().info(String.format("Found arena: %s", key));

                int minimumPlayers = arenasSection.getInt(key + ".min_players");
                int maximumPlayers = arenasSection.getInt(key + ".max_players");

                this.matchManager.addMatch(new Match(key, minimumPlayers, maximumPlayers));
                MatchTask task = new MatchTask(this);
                task.runTaskTimer(this, 0L, 20L);

            }
        } else {
            getLogger().info("No arenas found.");
        }
    }
}
