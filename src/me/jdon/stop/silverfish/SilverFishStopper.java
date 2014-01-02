package me.jdon.stop.silverfish;

import java.util.logging.Logger;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class SilverFishStopper extends JavaPlugin implements Listener{
	
	Logger log = Logger.getLogger("Minecraft.silverfishstopper");
	
	public void onEnable() {
		// register events in this class
		getServer().getPluginManager().registerEvents(this, this);
		// print to the console that the plugin in enabled
		log.info("[SilverFishStopper] has been Enabled!");
	}
	
	@EventHandler
	public void Silverfishstop (CreatureSpawnEvent ev){
		if(ev.getEntityType().name().equalsIgnoreCase(EntityType.SILVERFISH.name())){
			//No More silver Fish!!
			ev.setCancelled(true);
		}
	}

}
