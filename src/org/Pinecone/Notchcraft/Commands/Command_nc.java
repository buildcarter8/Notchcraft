package org.pinecone.Notchcraft.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.pinecone.Notchcraft.Main;

import net.md_5.bungee.api.ChatColor;

public class Command_nc extends NC_Command
{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) {
		sender.sendMessage(ChatColor.GOLD + "Notchcraft The Plugin Version " + Main.VERSION);
		
		
		return true;
	}

}
