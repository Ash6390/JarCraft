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
    public static boolean uselessValue = false;

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
        uselessValue = configuration.getBoolean("Useless Value", "Useless Things", false, "This is an useless value");
        Configs.uselessValue = uselessValue;

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }
}
