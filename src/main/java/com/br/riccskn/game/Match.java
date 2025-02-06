package com.br.riccskn.game;

import com.br.riccskn.game.enums.GameStateEnum;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Match implements IMatch {

    private String id;

    private Set<Player> players = new HashSet<>();

    private GameStateEnum gameState;

    private Location spawnLocation;

    private int minimumPlayers;

    private int maximumPlayers;

    private int tick;

    public Match(String id, int minimumPlayers, int maximumPlayers) {
        this.id = id;
        this.gameState = GameStateEnum.WAITING;
        this.minimumPlayers = minimumPlayers;
        this.maximumPlayers = maximumPlayers;
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
    }

    @Override
    public void stop() {

    }

    @Override
    public void tick() {

        Server server = Bukkit.getServer();
        server.getLogger().info("Tick");

        if (this.gameState == GameStateEnum.WAITING) {
            if(players.size() <= 2) {
                for (Player player : players) {
                    player.sendTitle("Hold on", "waiting players");
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
}
