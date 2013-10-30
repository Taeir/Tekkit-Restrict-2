package nl.taico.tr2;

import org.bukkit.plugin.java.JavaPlugin;

public class TR2 extends JavaPlugin {
	public static String version;
	public void onLoad(){
		version = getDescription().getVersion();
	}
	
	public void onEnable(){
		getLogger().info("TekkitRestrict 2 v" + version + " Enabled!");
	}
	
	public void onDisable(){
		getLogger().info("TekkitRestrict 2 v" + version + " Disabled!");
	}

}
