package org.pinecone.Notchcraft.Commands;

import java.util.List;
import java.util.logging.Logger;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.pinecone.Notchcraft.Main;

public abstract class NC_Command {
	
	 protected Main plugin;
	    protected static final Logger log = Logger.getLogger("Minecraft-Server");
	    
	    public NC_Command()
	    {
	    }
	    
	 abstract public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole);
	    
	    public void setPlugin(Main plugin)
	    {
	        this.plugin = plugin;
	    }
	    
	    public Player getPlayer(String partialname) throws CantFindPlayerException
	    {
	        List<Player> matches = Bukkit.matchPlayer(partialname);
	        if (matches.isEmpty())
	        {
	            throw new CantFindPlayerException(partialname);
	        }
	        else
	        {
	            return matches.get(0);
	        }
	    }
	}


