package com.br.riccskn.game;

import org.bukkit.entity.Player;

public interface IMatch {

    void addPlayer(Player player);

    void removePlayer(Player player);

    void start();

    void stop();

    void tick();

}
