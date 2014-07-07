package com.ash6390.jarcraft.init;

import com.ash6390.jarcraft.items.ItemJC;
import com.ash6390.jarcraft.items.testItem;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemJC testItem = new testItem();

    public static void init()
    {
        GameRegistry.registerItem(testItem, "testItem");
    }
}
