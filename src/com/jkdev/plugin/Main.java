package com.jkdev.plugin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	PluginDescriptionFile pluginyml = getDescription();
	public String version = pluginyml.getVersion();
	public String nombre = ChatColor.GREEN+"["+ChatColor.AQUA+pluginyml.getName()+ChatColor.GREEN+"]";
	
	
	@Override
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.WHITE+"  Ha sido activado (version: "+ChatColor.RED+version+ChatColor.WHITE+")");
		getServer().getPluginManager().registerEvents(new BlockBreak(), this);
		
	}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(nombre+ChatColor.RED+" Ha sido desactivado");
	}
}