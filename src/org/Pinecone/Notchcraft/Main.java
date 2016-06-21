package org.pinecone.Notchcraft;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.pinecone.Notchcraft.Commands.NC_Command;
import org.pinecone.Notchcraft.Listeners.PlayerListener;
import org.pinecone.Notchcraft.Listeners.ServerListener;

public class Main extends JavaPlugin
{
	public final Logger log = Logger.getLogger("Carter-Plugin");
	public static String VERSION = "1.0.0";
	public static Main plugin;
	public static String NOPE = ChatColor.RED + "You do not have the correct rank to use this command";
	 public static final String COMMAND_PATH = "org.pinecone.Notchcraft.Commands";
	  public static final String COMMAND_PREFIX = "Command_";
	  
	  @Override
		public void onDisable() {
		log.info("Notchcraft has been disabled");
		}
     @Override
       public void onEnable()
       {
    	 log.info("Notchcraft Version " + VERSION + " has been enabled");
    	 final PluginManager pm = Bukkit.getServer().getPluginManager();
         pm.registerEvents(new PlayerListener(), this);
         pm.registerEvents(new ServerListener(), this);
       }
     public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
	    {
	        try
	        {
	            Player sender_p = null;
	            boolean senderIsConsole = false;
	            if (sender instanceof Player)
	            {
	                sender_p = (Player) sender;
	                log.info(String.format("[PLAYER_COMMAND] %s(%s): /%s %s",
	                        sender_p.getName(),
	                        ChatColor.stripColor(sender_p.getDisplayName()),
	                        commandLabel,
	                        NC_Util.implodeStringList(" ", Arrays.asList(args))));
	            }
	            else
	            {
	                senderIsConsole = true;
	                log.info(String.format("[CONSOLE_COMMAND] %s: /%s %s",
	                        sender.getName(),
	                        commandLabel,
	                        NC_Util.implodeStringList(" ", Arrays.asList(args))));
	            }

	            NC_Command dispatcher;
	            try
	            {
	                ClassLoader classLoader = Main.class.getClassLoader();
	                dispatcher = (NC_Command) classLoader.loadClass(String.format("%s.%s%s", COMMAND_PATH, COMMAND_PREFIX, cmd.getName().toLowerCase())).newInstance();
	                dispatcher.setPlugin(this);
	            }
	            catch (Throwable ex)
	            {
	                log.log(Level.SEVERE, "[" + getDescription().getName() + "] Command not loaded: " + cmd.getName(), ex);
	                sender.sendMessage(ChatColor.RED + "Command Error: Command not loaded: " + cmd.getName());
	                return true;
	            }

	            try
	            {
	                return dispatcher.run(sender, sender_p, cmd, commandLabel, args, senderIsConsole);
	            }
	            catch (Throwable ex)
	            {
	                sender.sendMessage(ChatColor.RED + "Command Error: " + ex.getMessage());
	            }

	            dispatcher = null;
	        }
	        catch (Throwable ex)
	        {
	            log.log(Level.SEVERE, "[" + getDescription().getName() + "] Command Error: " + commandLabel, ex);
	            sender.sendMessage(ChatColor.RED + "Unknown Command Error.");
	        }

	        return true;
	    }
}
