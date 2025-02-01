package com.br.riccskn.game.events;

import com.br.riccskn.game.Match;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class JoinMatchEvent extends MatchEvent{

    public JoinMatchEvent(Match match) {
        super(match);
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return null;
    }
}
