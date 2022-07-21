package net.labindustries.authcore;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import net.labindustries.authcore.commands.VerifyCommand;
import net.labindustries.authcore.events.PlayerJoin;
import net.labindustries.authcore.events.PlayerMove;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.UUID;

public final class AuthCore extends JavaPlugin {
    private ArrayList<UUID> authLock;
    // private String DiscordWebhook = "https://discord.com/api/webhooks/999652232712687636/gHjLpbmnGR4pAw1iJQK_T4QNCnA1G4ZrItZ8AyxiGPF0vNTubx2G0yTyMHRO_IQAp1Jp";
    private AuthCore authCore;

    @Override
    public void onEnable() {
    // Plugin startup logic
        authCore = this;



        getCommand("verify").setExecutor(new VerifyCommand(this));
        getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
        getServer().getPluginManager().registerEvents(new PlayerMove(this), this);


        authLock = new ArrayList<UUID>();

        authCore.getConfig().options().copyDefaults(true);
        authCore.saveConfig();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

/*
    public boolean playerAuth(Player player, int code) {
        String authKey = authCore.getConfig().getString("authcodes." + player.getUniqueId());

        GoogleAuthenticator gAuth = new GoogleAuthenticator();
        boolean authVerified = gAuth.authorize(authKey, code);


        if (authVerified) {
            authCore.getAuthlocked().remove(player.getUniqueId());
            return authVerified;
        }

        return authVerified;
    }


 */




}
