package net.labindustries.authcore.events;



import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;
import net.labindustries.authcore.AuthCore;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
  private final AuthCore authCore;

  public PlayerJoin(AuthCore authCore) {
    this.authCore = authCore;
  }


  @EventHandler
  public void onPlayerJoinEvent(PlayerJoinEvent event) {
    Player player = event.getPlayer();

    if(!authCore.getConfig().contains("authcodes." + player.getUniqueId())) {
      GoogleAuthenticator gAuth = new GoogleAuthenticator();
      final GoogleAuthenticatorKey key = gAuth.createCredentials();

      player.sendMessage("Auth Code:" + key.getKey());
    }




    }
  }


