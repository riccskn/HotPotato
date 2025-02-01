package com.br.riccskn.game.events;

import com.br.riccskn.game.Match;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.event.Event;

@AllArgsConstructor
@Getter
@Setter
public abstract class MatchEvent extends Event {

    private Match match;

}
