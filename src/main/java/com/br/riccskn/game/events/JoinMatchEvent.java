package com.br.riccskn.game.events;

import com.br.riccskn.game.Match;
import org.bukkit.entity.Player;

public class JoinMatchEvent extends MatchEvent{


    public JoinMatchEvent(Match match, Player player) {
        super(match, player);
    }
}
