package com.ash6390.jarcraft.items;

import com.ash6390.jarcraft.creativetab.CreativeTabJC;
import com.ash6390.jarcraft.reference.References;
import net.minecraft.item.ItemSpade;

public class ItemGlassShovel extends ItemSpade
{
    public ItemGlassShovel(ToolMaterial material)
    {
        super(material);
        setUnlocalizedName("glassShovel");
        setTextureName(References.MODID + ":glass_shovel");
        setCreativeTab(CreativeTabJC.JC_TAB);
    }
}
