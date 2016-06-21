package org.pinecone.Notchcraft;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	public final Logger log = Logger.getLogger("Carter-Plugin");
	public static String VERSION = "0.0.1";
	public static Main plugin;
	 public static final String COMMAND_PATH = "org.Pinecone.Notchcraft.Commands";
	  public static final String COMMAND_PREFIX = "Command_";
	  
	  @Override
		public void onDisable() {
		log.info("Notchcraft has been disabled");
		}
     @Override
       public void onEnable()
       {
    	 log.info("Notchcraft Version " + VERSION + " has been enabled");
       }
     
}
