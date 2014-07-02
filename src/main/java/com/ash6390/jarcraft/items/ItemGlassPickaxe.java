package com.ash6390.jarcraft.items;

import com.ash6390.jarcraft.reference.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class ItemGlassPickaxe extends ItemPickaxe
{
    public ItemGlassPickaxe(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("glassPickaxe");
        setTextureName(References.MODID + ":glass_pick");
        setCreativeTab(CreativeTabs.tabTools);
    }
}