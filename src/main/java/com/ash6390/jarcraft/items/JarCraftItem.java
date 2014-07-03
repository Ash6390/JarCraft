package com.ash6390.jarcraft.items;

import com.ash6390.jarcraft.JarCraftCore;
import com.ash6390.jarcraft.reference.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
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

    //Armor
    public static Item glassHelmet;
    public static Item glassChestplate;
    public static Item glassLeggings;
    public static Item glassBoots;

    //ToolMaterials
    public static ToolMaterial GlassToolMaterial = EnumHelper.addToolMaterial("Glass Tool Material", 2, 200, 7.0F, 2.1F, 15);

    //ArmorMaterials
    public static ItemArmor.ArmorMaterial GlassArmorMaterial = EnumHelper.addArmorMaterial("Glass Armor Material", 13, new int[]{2, 6, 6, 2}, 15);

    public static void ItemInit()
    {
        initializeItems();
        registerItems();
    }

    public static void initializeItems()
    {
        //Crafting Materials
        glassIngot = new Item().setUnlocalizedName("glassIngot").setCreativeTab(JarCraftCore.JarCraftTab).setTextureName(References.MODID + ":glass_ingot");
        glassStick = new Item().setUnlocalizedName("glassStick").setCreativeTab(JarCraftCore.JarCraftTab).setTextureName(References.MODID + ":glass_stick");

        //Tools
        glassSword = new ItemGlassSword(GlassToolMaterial);
        glassPick = new ItemGlassPickaxe(GlassToolMaterial);
        glassShovel = new ItemGlassShovel(GlassToolMaterial);
        glassAxe = new ItemGlassAxe(GlassToolMaterial);
        glassHoe = new ItemGlassHoe(GlassToolMaterial);

        //Armor
        glassHelmet = new ItemGlassArmor(GlassArmorMaterial, JarCraftCore.proxy.addArmor("glassArmor"), 0).setUnlocalizedName("glassHelmet").setCreativeTab(JarCraftCore.JarCraftTab).setTextureName(References.MODID + ":glass_helmet");
        glassChestplate = new ItemGlassArmor(GlassArmorMaterial, JarCraftCore.proxy.addArmor("glassArmor"), 1).setUnlocalizedName("glassChestplate").setCreativeTab(JarCraftCore.JarCraftTab).setTextureName(References.MODID + ":glass_chestplate");
        glassLeggings = new ItemGlassArmor(GlassArmorMaterial, JarCraftCore.proxy.addArmor("glassArmor"), 2).setUnlocalizedName("glassLeggings").setCreativeTab(JarCraftCore.JarCraftTab).setTextureName(References.MODID + ":glass_leggings");
        glassBoots = new ItemGlassArmor(GlassArmorMaterial, JarCraftCore.proxy.addArmor("glassArmor"), 3).setUnlocalizedName("glassBoots").setCreativeTab(JarCraftCore.JarCraftTab).setTextureName(References.MODID + ":glass_boots");

    }

    public static void registerItems()
    {
        GameRegistry.registerItem(glassSword, "glassSword", References.MODID);
        GameRegistry.registerItem(glassPick, "glassPickaxe", References.MODID);
        GameRegistry.registerItem(glassAxe, "glassAxe", References.MODID);
        GameRegistry.registerItem(glassHoe, "glassHoe", References.MODID);
        GameRegistry.registerItem(glassShovel, "glassShovel", References.MODID);
        GameRegistry.registerItem(glassIngot, "glassIngot", References.MODID);
        GameRegistry.registerItem(glassStick, "glassStick", References.MODID);
        GameRegistry.registerItem(glassHelmet, "glassHelmet", References.MODID);
        GameRegistry.registerItem(glassChestplate, "glassChestplate", References.MODID);
        GameRegistry.registerItem(glassLeggings, "glassLeggings", References.MODID);
        GameRegistry.registerItem(glassBoots, "glassBoots", References.MODID);
    }

}
