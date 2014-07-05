package com.ash6390.jarcraft.client.gui;

import com.ash6390.jarcraft.handler.ConfigurationHandler;
import com.ash6390.jarcraft.reference.References;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class JarCraftGuiConfig extends GuiConfig
{
    public JarCraftGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory("uselesscategory")).getChildElements(),
                References.MODID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));

    }
}
