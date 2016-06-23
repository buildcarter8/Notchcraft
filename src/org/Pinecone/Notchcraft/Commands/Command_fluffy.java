package org.pinecone.Notchcraft.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Command_fluffy extends NC_Command
{

	@Override
	public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole) {
		
		sender.sendMessage(ChatColor.GOLD + "Textures Made by _DrFluffy_");
	    Player p = Bukkit.getServer().getPlayer(sender.getName());
	    Location TargetLocation = p.getLocation();
	    		p.getWorld().spawnEntity(TargetLocation, EntityType.SHEEP);
	    		p.getWorld().spawnEntity(TargetLocation, EntityType.SHEEP);
	    		p.getWorld().spawnEntity(TargetLocation, EntityType.SHEEP);
	    		
		
		
		
		return true;
	}

}
