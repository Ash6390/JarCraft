package com.ash6390.jarcraft.items;

import com.ash6390.jarcraft.reference.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;


public class JarCraftItem
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
    public static Item glassFishingRod;

    //ToolMaterials
    public static ToolMaterial GlassMaterial = EnumHelper.addToolMaterial("Glass Material", 2, 200, 7.0F, 2.3F, 15);

    public static void ItemInit()
    {
        initializeItems();
        registerItems();
    }

    public static void initializeItems()
    {
        //Crafting Materials
        glassIngot = new Item().setUnlocalizedName("glassIngot").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(References.MODID + ":glass_ingot");
        glassStick = new Item().setUnlocalizedName("glassStick").setCreativeTab(CreativeTabs.tabMaterials).setTextureName(References.MODID + ":glass_stick");

        //Tools
        glassSword = new ItemGlassSword(GlassMaterial);
        glassPick = new ItemGlassPickaxe(GlassMaterial);
        glassShovel = new ItemGlassShovel(GlassMaterial);
        glassAxe = new ItemGlassAxe(GlassMaterial);
        glassHoe = new ItemGlassHoe(GlassMaterial);
        glassFishingRod = new ItemGlassFishingRod();


    }

    public static void registerItems()
    {
        GameRegistry.registerItem(glassSword, "Glass Sword", References.MODID);
        GameRegistry.registerItem(glassPick, "Glass Pickaxe", References.MODID);
        GameRegistry.registerItem(glassAxe, "Glass Axe", References.MODID);
        GameRegistry.registerItem(glassHoe, "Glass Hoe", References.MODID);
        GameRegistry.registerItem(glassShovel, "Glass Shovel", References.MODID);
        GameRegistry.registerItem(glassIngot, "Glass Ingot", References.MODID);
        GameRegistry.registerItem(glassStick, "Glass Stick", References.MODID);
        GameRegistry.registerItem(glassFishingRod, "Glass Fishing Rod", References.MODID);
    }

}
