package com.ash6390.jarcraft.creativetab;

import com.ash6390.jarcraft.init.ModItems;
import com.ash6390.jarcraft.reference.Configs;
import com.ash6390.jarcraft.reference.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabJC
{
    public static final CreativeTabs JC_TAB = new CreativeTabs(References.MODID)
    {
        @Override
        public Item getTabIconItem()
        {
            if (Configs.itemsOn)
            {
                return ModItems.glassIngot;
            }
            else
            {
                return Items.glass_bottle;
            }
        }
    };
}
