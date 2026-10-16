package net.esquizomods.desafioeclipse;

import net.esquizomods.desafioeclipse.block.ModBlocks;
import net.esquizomods.desafioeclipse.item.ModItem;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DesafioEclipse implements ModInitializer {
	public static final String MOD_ID = "desafioeclipse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItem.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
