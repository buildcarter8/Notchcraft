package org.pinecone.Notchcraft.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.pinecone.Notchcraft.Main;
import org.pinecone.Notchcraft.Ranks.Ranks;

public class Command_ban extends NC_Command
{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) {
		if(!Ranks.staff.contains(sender.getName()))
		{
			sender.sendMessage(Main.NOPE);
			sender.setOp(false);
		}
		else
		{
			if(args.length == 0)
			{
				sender.sendMessage(ChatColor.RED + "PLEASE INSERT PLAYER NAME");
			}
			  if (args.length == 1)
		        {

		        	Player target = Bukkit.getServer().getPlayer(args[0]);
		        	if(Ranks.staff.contains(target.getName()))
		        	{
		        		sender.sendMessage(Main.NOPE);
		        		target.sendMessage(ChatColor.RED + sender.getName() + " Tried banning you");
		        	}
		        	else
		        	{
		        	Bukkit.broadcastMessage(ChatColor.RED + sender.getName()+ " - Banning " + target.getName());
		        	target.setBanned(true);
		        	target.kickPlayer(ChatColor.RED + "BANNED" + " Banned By: " + sender.getName());

		        	}
		            return true;
		        }
		}
		
		return true;
	}

}
