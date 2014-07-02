package com.ash6390.jarcraft.items;

import com.ash6390.jarcraft.reference.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class ItemGlassAxe extends ItemAxe
{
    public ItemGlassAxe(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("glassAxe");
        setTextureName(References.MODID + ":glass_axe");
        setCreativeTab(CreativeTabs.tabTools);
    }
}
