package com.br.riccskn.game.events;

import com.br.riccskn.game.Match;
import org.bukkit.entity.Player;

public class LeaveMatchEvent extends MatchEvent {

    public LeaveMatchEvent(Match match, Player player) {
        super(match, player);
    }
}
