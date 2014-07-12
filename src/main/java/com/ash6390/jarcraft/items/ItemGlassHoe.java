package com.ash6390.jarcraft.items;

import com.ash6390.jarcraft.creativetab.CreativeTabJC;
import com.ash6390.jarcraft.reference.References;
import net.minecraft.item.ItemHoe;

public class ItemGlassHoe extends ItemHoe
{
    public ItemGlassHoe(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("glassHoe");
        setTextureName(References.MODID + ":glass_hoe");
        setCreativeTab(CreativeTabJC.JC_TAB);
    }
}
