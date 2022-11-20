package com.spoopydev.commands;

import com.spoopydev.models.races.dark.Drow;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Drow drow = new Drow();
            player.sendMessage(drow.getName() + ": " + drow.getPower() + " Power and Starts with $" + drow.getStartingMoney());
        }

        return true;
    }
}
