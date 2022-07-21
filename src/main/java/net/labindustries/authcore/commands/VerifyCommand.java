package net.labindustries.authcore.commands;

import net.labindustries.authcore.AuthCore;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class VerifyCommand implements CommandExecutor {

  private final AuthCore authCore;

  public VerifyCommand(AuthCore authCore) {
    this.authCore = authCore;
  }

  @Override
  public boolean onCommand(
      @NotNull CommandSender sender,
      @NotNull Command command,
      @NotNull String label,
      @NotNull String[] args) {
    Player player = (Player) sender;



      return true;
    }

}