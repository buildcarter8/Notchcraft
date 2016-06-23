package org.pinecone.Notchcraft.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.pinecone.Notchcraft.Main;
import org.pinecone.Notchcraft.Ranks.Ranks;
//COMMAND IS STAFF ONLY
public class Command_gobomo extends NC_Command
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
                    //Why did i decide to do this
		        	Player target = Bukkit.getServer().getPlayer(args[0]);
		        	Location TargetLocation = target.getLocation();
		        	target.setGameMode(GameMode.SURVIVAL);
		        	target.getWorld().spawnEntity(TargetLocation, EntityType.BLAZE);
		        	target.getWorld().spawnEntity(TargetLocation, EntityType.BLAZE);
		        	target.getWorld().spawnEntity(TargetLocation, EntityType.BLAZE);
		        	target.getWorld().spawnEntity(TargetLocation, EntityType.BLAZE);
		        	target.getWorld().spawnEntity(TargetLocation, EntityType.BLAZE);
		        	target.getWorld().spawnEntity(TargetLocation, EntityType.BLAZE);
		        	target.getWorld().spawnEntity(TargetLocation, EntityType.BLAZE);
		        	target.getWorld().spawnEntity(TargetLocation, EntityType.BLAZE);
		        	target.getWorld().spawnEntity(TargetLocation, EntityType.BLAZE);
		        	target.getWorld().spawnEntity(TargetLocation, EntityType.BLAZE);
		        }
		
		
		
		return true;
	}


	}
}
