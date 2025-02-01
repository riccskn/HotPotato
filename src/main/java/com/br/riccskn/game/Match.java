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

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void tick() {

    }
}
