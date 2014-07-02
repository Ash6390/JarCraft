package com.ash6390.jarcraft.items;

import com.ash6390.jarcraft.reference.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;


public class ItemHandler
{

    //Crafting Materials
    public static Item glassStick;
    public static Item glassIngot;

    //Tools
    public static Item glassSword;
    public static Item glassPick;
    public static Item glassShovel;
    public static Item glassHoe;
    public static Item glassAxe;

    //ToolMaterials
    public static ToolMaterial GlassMaterial = EnumHelper.addToolMaterial("Glass Material", 2, 200, 7.0F, 2.3F, 15);

    public static void ItemInit()
    {
        initializeItems();
        registerItems();
    }

    public static void initializeItems()
    {

        //Tools
        glassSword = new ItemGlassSword(GlassMaterial);
        glassPick = new ItemGlassPickaxe(GlassMaterial);

    }

    public static void registerItems()
    {
        GameRegistry.registerItem(glassSword, "Glass Sword", References.MODID);
        GameRegistry.registerItem(glassPick, "Glass Pickaxe", References.MODID);
    }

}
