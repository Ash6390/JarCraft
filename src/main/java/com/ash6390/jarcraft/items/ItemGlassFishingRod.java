package com.ash6390.jarcraft.items;

import com.ash6390.jarcraft.reference.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFishingRod;

public class ItemGlassFishingRod extends ItemFishingRod
{
    public ItemGlassFishingRod()
    {
        setMaxDamage(300);
        setUnlocalizedName("glassFishingRod");
        setTextureName(References.MODID + ":glass_fishing_rod");
        setCreativeTab(CreativeTabs.tabTools);
    }
}
