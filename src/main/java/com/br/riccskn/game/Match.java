package com.br.riccskn.game;

import com.br.riccskn.game.enums.GameStateEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class Match implements IMatch {

    private String id;

    private Set<Player> players;

    private GameStateEnum gameState;

    private Location spawnLocation;

    private int tick;

    public Match() {
        this.gameState = GameStateEnum.WAITING;
    }

    @Override
    public void addPlayer(Player player) {
        players.add(player);

        for (Player p : players) {
            p.sendMessage("New player added to game");
        }
    }

    @Override
    public void removePlayer(Player player) {
        players.remove(player);

        for (Player p : players) {
            p.sendMessage("Player removed");
        }
    }

    @Override
    public void start() {

        if (this.gameState == GameStateEnum.WAITING) {
            if(players.size() <= 2) {
              for (Player player : players) {
                  player.sendActionBar("Waiting for players");
              }
            if (players.size() >= 2) {
              this.gameState = GameStateEnum.STARTING;
              this.tick++;
            }

            }
        if (this.gameState == GameStateEnum.STARTING) {
            if (this.tick >= 6) {
                this.gameState = GameStateEnum.RUNNING;
            }
        }

        }
    }

    @Override
    public void stop() {

    }

    @Override
    public void tick() {

    }
}
