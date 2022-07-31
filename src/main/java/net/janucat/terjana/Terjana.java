package net.janucat.terjana;

import net.fabricmc.api.ModInitializer;
import net.janucat.terjana.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Terjana implements ModInitializer {

	public static final String MOD_ID = "terjana";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
	}
}
