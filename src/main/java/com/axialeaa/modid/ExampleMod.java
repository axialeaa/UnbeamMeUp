package com.axialeaa.modid;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {

	public static final String MOD_ID = "mod-id";
	public static final String MOD_NAME = "Example Mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

	@Override
	public void onInitialize() {
		LOGGER.info("{} initialized! Insert funny joke here.", MOD_NAME);
	}

	public static Identifier id(String name) {
		return Identifier.of(MOD_ID, name);
	}

}