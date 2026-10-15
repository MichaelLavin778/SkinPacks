package com.skinpacks;

import com.google.inject.Provides;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Skin Packs"
)
public class SkinPacksPlugin extends Plugin
{
	@Override
	protected void startUp() throws Exception
	{
		log.debug("Skin Packs started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.debug("Skin Packs stopped!");
	}

	@Provides
	SkinPacksConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(SkinPacksConfig.class);
	}
}
