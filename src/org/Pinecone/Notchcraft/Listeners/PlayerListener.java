package org.pinecone.Notchcraft.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.pinecone.Notchcraft.Ranks.Ranks;

import net.md_5.bungee.api.ChatColor;

public class PlayerListener implements Listener
{
	@EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerLogin(PlayerLoginEvent event)
    {
		Player player = event.getPlayer();
		if(Ranks.executive.contains(player.getName()))
		{
			 Bukkit.broadcastMessage(ChatColor.AQUA + player.getName() + " is an " + ChatColor.RED + "System Admin");
		}
		if(Ranks.admins.contains(player.getName()))
				{
			     Bukkit.broadcastMessage(ChatColor.AQUA + player.getName() + " is an " + ChatColor.GOLD + "Admin");
				}
		if(player.getName().equalsIgnoreCase("buildcarter8"))
		{
			 Bukkit.broadcastMessage(ChatColor.AQUA + player.getName() + " is the " + ChatColor.DARK_RED + "Owner");
		}
    }
}
