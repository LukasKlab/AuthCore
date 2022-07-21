package net.labindustries.authcore.events;


import net.labindustries.authcore.AuthCore;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMove implements Listener {
    private final AuthCore authCore;

    public PlayerMove(AuthCore authCore) {
        this.authCore = authCore;
    }


    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        //if (authCore.getAuthlocked().contains(player.getUniqueId())) {
        //    event.setCancelled(true);
        //}


    }



}
