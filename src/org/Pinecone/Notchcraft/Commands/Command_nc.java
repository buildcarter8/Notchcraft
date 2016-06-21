package org.pinecone.Notchcraft.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.pinecone.Notchcraft.Main;

public class Command_nc extends NC_Command
{

	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) {
		
		
		sender.sendMessage(ChatColor.GOLD + "Notchcraft The Plugin Version " + Main.VERSION);
		sender.sendMessage(ChatColor.AQUA + "By buildcarter8");
		
		
		return true;
	}

}
