package com.ash6390.jarcraft.configurations;

import com.ash6390.jarcraft.reference.Configs;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        Configuration configuration = new Configuration(configFile);
        boolean uselessValue = false;
        double uselessDouble = 0.0;
        String uselessString = "Hello!";

        try
        {
            configuration.load();

            uselessValue = configuration.get(Configuration.CATEGORY_GENERAL, "uselessValue", true, "Useless Config").getBoolean(true);
            Configs.uselessValue = uselessValue;

            uselessDouble = configuration.get(Configuration.CATEGORY_GENERAL, "uselessDouble", 0.0, "Useless Value").getDouble(0.0);
            Configs.uselessDouble = uselessDouble;

            uselessString = configuration.get(Configuration.CATEGORY_GENERAL, "uselessString", "Hello!", "Useless String").getString();
            Configs.uselessString = uselessString;
        }
        catch (Exception e)
        {
            //Log Exeption
        }
        finally
        {
            configuration.save();
        }
    }
}
