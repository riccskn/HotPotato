package com.br.riccskn.game.task;

import com.br.riccskn.Main;
import org.bukkit.scheduler.BukkitRunnable;

public class MatchTask extends BukkitRunnable {

    private Main plugin;

    public MatchTask(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public void run() {
      this.plugin.getMatchManager().getMatches().forEach(match -> {
         match.tick();
      });
    }
}
