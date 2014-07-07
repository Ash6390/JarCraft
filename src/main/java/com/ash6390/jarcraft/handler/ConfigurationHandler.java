package com.ash6390.jarcraft.handler;

import com.ash6390.jarcraft.reference.Configs;
import com.ash6390.jarcraft.reference.References;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean itemsOn;

    public static void init(File configFile)
    {
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(References.MODID))
        {
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        itemsOn = configuration.getBoolean("Enable JarCraft Items (and Blocks)", "general", true, "Are JarCraft items (and Blocks) enabled?");
        Configs.itemsOn = itemsOn;

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
