package com.jkdev.plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		System.out.println("Plugin Iniciado correctamente");
		getServer().getPluginManager().registerEvents(new BlockBreak(), this);
		
	}
	
	@Override
	public void onDisable() {
		System.out.println("Plugin Desactivado Bye bye!");
	}
}
