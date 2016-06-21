package org.pinecone.Notchcraft.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import net.md_5.bungee.api.ChatColor;

public class ServerListener implements Listener
{
	@EventHandler(priority = EventPriority.HIGHEST)
	 public void onServerPing(ServerListPingEvent event)
	    {
		 event.setMotd(ChatColor.GOLD + "[Notchcraft]" + ChatColor.WHITE + " -" + ChatColor.DARK_RED + "REAL ROLEPLAY");
		 return;
	    }
}
