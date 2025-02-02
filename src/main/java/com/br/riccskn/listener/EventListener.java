package com.br.riccskn.listener;

import com.br.riccskn.Main;
import com.br.riccskn.game.Match;
import com.br.riccskn.game.events.JoinMatchEvent;
import lombok.AllArgsConstructor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;

@AllArgsConstructor
public class EventListener implements Listener {

    public EventListener(Main plugin) {

    }


    @EventHandler
    public void onPlayerJoinMatchEvent(JoinMatchEvent event) {
        Player player = event.getPlayer();
        Match match = event.getMatch();

    }

    @EventHandler
    public void onPlayerHitEvent(PlayerItemDamageEvent event) {
    }

}
