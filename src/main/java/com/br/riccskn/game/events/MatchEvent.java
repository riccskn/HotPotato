package com.br.riccskn.game.events;

import com.br.riccskn.game.Match;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

@Getter
@Setter
public abstract class MatchEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private Player player;

    private Match match;


    public MatchEvent(Match match, Player player) {
        this.match = match;
        this.player = player;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }
}
