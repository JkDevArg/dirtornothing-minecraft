package com.jkdev.plugin;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {
	
	@EventHandler
	public void blockBreak(BlockBreakEvent event) {
		Block block = event.getBlock();
		if(block.getType() == Material.DIRT || block.getType() == Material.BEDROCK || block.getType() == Material.COBBLESTONE || block.getType() == Material.STONE || block.getType() == Material.GOLD_BLOCK || block.getType() == Material.IRON_BLOCK || block.getType() == Material.DIAMOND_BLOCK || block.getType() == Material.LAPIS_BLOCK || block.getType() == Material.REDSTONE_BLOCK || block.getType() == Material.EMERALD_BLOCK || block.getType() == Material.QUARTZ_BLOCK || block.getType() == Material.AMETHYST_BLOCK || block.getType() == Material.DRIPSTONE_BLOCK || block.getType() == Material.NETHERITE_BLOCK || block.getType() == Material.RAW_IRON_BLOCK || block.getType() == Material.RAW_GOLD_BLOCK || block.getType() == Material.COAL_BLOCK || block.getType() == Material.COPPER_BLOCK || block.getType() == Material.RAW_COPPER_BLOCK || block.getType() == Material.PURPUR_BLOCK || block.getType() == Material.GRANITE || block.getType() == Material.EMERALD_ORE || block.getType() == Material.COPPER_ORE || block.getType() == Material.DIAMOND_ORE || block.getType() == Material.EMERALD_ORE || block.getType() == Material.IRON_ORE || block.getType() == Material.GOLD_ORE || block.getType() == Material.LAPIS_ORE || block.getType() == Material.REDSTONE_ORE || block.getType() == Material.NETHER_GOLD_ORE || block.getType() == Material.NETHER_QUARTZ_ORE || block.getType() == Material.COAL_ORE || block.getType() == Material.OBSIDIAN) {
			block.setType(Material.DIRT);
			event.setCancelled(false);
		}
	}
}
