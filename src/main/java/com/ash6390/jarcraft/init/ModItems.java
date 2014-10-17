package com.ash6390.jarcraft.init;

import com.ash6390.jarcraft.items.*;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemJC illuminatingOrb = new IlluminatingOrb();
    public static final ItemJC glassIngot = new GlassIngot();
    public static final ItemJC glassStick = new GlassStick();
    public static final ItemJC testItem = new TestItem();

    public static void init()
    {
        GameRegistry.registerItem(illuminatingOrb, "illuminatingOrb");
        GameRegistry.registerItem(glassIngot, "glassIngot");
        GameRegistry.registerItem(glassStick, "glassStick");
        GameRegistry.registerItem(testItem, "testItem");
    }
}
