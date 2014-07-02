package com.ash6390.jarcraft.items;

import com.ash6390.jarcraft.reference.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemGlassSword extends ItemSword
{
    public ItemGlassSword(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("glassSword");
        setTextureName(References.MODID + ":glass_sword");
        setCreativeTab(CreativeTabs.tabCombat);
    }
}