package com.ash6390.jarcraft;

import com.ash6390.jarcraft.blocks.JarCraftBlocks;
import com.ash6390.jarcraft.items.JarCraftItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void registerRecipes()
    {
        //Glass Ingot
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 2), new Object[] {
                "IG ",
                "GI ",
                "   ", 'I', Item.itemRegistry.getObject("iron_ingot"), 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 2), new Object[] {
                " IG",
                " GI",
                "   ", 'I', Item.itemRegistry.getObject("iron_ingot"), 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 2), new Object[] {
                "   ",
                "IG ",
                "GI ", 'I', Item.itemRegistry.getObject("iron_ingot"), 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 2), new Object[] {
                "   ",
                " IG",
                " GI", 'I', Item.itemRegistry.getObject("iron_ingot"), 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 9), new Object[] {
                "B  ",
                "   ",
                "   ", 'B', JarCraftBlocks.GlassIngotBlock});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 9), new Object[] {
                " B ",
                "   ",
                "   ", 'B', JarCraftBlocks.GlassIngotBlock});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 9), new Object[] {
                "  B",
                "   ",
                "   ",'B', JarCraftBlocks.GlassIngotBlock});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 9), new Object[] {
                "   ",
                "B  ",
                "   ", 'B', JarCraftBlocks.GlassIngotBlock});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 9), new Object[] {
                "   ",
                " B ",
                "   ", 'B', JarCraftBlocks.GlassIngotBlock});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 9), new Object[] {
                "   ",
                "  B",
                "   ", 'B', JarCraftBlocks.GlassIngotBlock});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 9), new Object[] {
                "   ",
                "   ",
                "B  ", 'B', JarCraftBlocks.GlassIngotBlock});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 9), new Object[] {
                "   ",
                "   ",
                " B ", 'B', JarCraftBlocks.GlassIngotBlock});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassIngot, 9), new Object[] {
                "   ",
                "   ",
                "  B", 'B', JarCraftBlocks.GlassIngotBlock});

        //Glass Ingot Block
        GameRegistry.addRecipe(new ItemStack(JarCraftBlocks.GlassIngotBlock, 1), new Object[] {
                "III",
                "III",
                "III", 'I', JarCraftItem.glassIngot});

        //Glass Stick
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassStick, 4), new Object[] {
                "G  ",
                "G  ",
                "   ", 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassStick, 4), new Object[] {
                " G ",
                " G ",
                "   ", 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassStick, 4), new Object[] {
                "  G",
                "  G",
                "   ", 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassStick, 4), new Object[] {
                "   ",
                "G  ",
                "G  ", 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassStick, 4), new Object[] {
                "   ",
                " G ",
                " G ", 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassStick, 4), new Object[] {
                "   ",
                "  G",
                "  G", 'G', Block.blockRegistry.getObject("glass")});

        //Glass Sword
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassSword, 1), new Object[] {
                " I ",
                " I ",
                " S ", 'I', JarCraftItem.glassIngot, 'S', JarCraftItem.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassSword, 1), new Object[] {
                "I  ",
                "I  ",
                "S  ", 'I', JarCraftItem.glassIngot, 'S', JarCraftItem.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassSword, 1), new Object[] {
                "  I",
                "  I",
                "  S", 'I', JarCraftItem.glassIngot, 'S', JarCraftItem.glassStick});

        //Glass Pickaxe
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassPick, 1), new Object[] {
                "III",
                " S ",
                " S ", 'I', JarCraftItem.glassIngot, 'S', JarCraftItem.glassStick});

        //Glass Shovel
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassShovel, 1), new Object[] {
                " I ",
                " S ",
                " S ", 'I', JarCraftItem.glassIngot, 'S', JarCraftItem.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassShovel, 1), new Object[] {
                "I  ",
                "S  ",
                "S  ", 'I', JarCraftItem.glassIngot, 'S', JarCraftItem.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassShovel, 1), new Object[] {
                "  I",
                "  S",
                "  S", 'I', JarCraftItem.glassIngot, 'S', JarCraftItem.glassStick});

        //Glass Axe
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassAxe, 1), new Object[] {
                "II ",
                "IS ",
                " S ", 'I', JarCraftItem.glassIngot, 'S', JarCraftItem.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassAxe, 1), new Object[] {
                " II",
                " SI",
                " S ", 'I', JarCraftItem.glassIngot, 'S', JarCraftItem.glassStick});

        //Glass Hoe
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassHoe, 1), new Object[] {
                "II ",
                " S ",
                " S ", 'I', JarCraftItem.glassIngot, 'S', JarCraftItem.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassHoe, 1), new Object[] {
                " II",
                " S ",
                " S ", 'I', JarCraftItem.glassIngot, 'S', JarCraftItem.glassStick});

        //Glass Helmet
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassHelmet, 1), new Object[] {
                "III",
                "I I",
                "   ", 'I', JarCraftItem.glassIngot});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassHelmet, 1), new Object[] {
                "   ",
                "III",
                "I I", 'I', JarCraftItem.glassIngot});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassChestplate, 1), new Object[] {
                "I I",
                "III",
                "III", 'I', JarCraftItem.glassIngot});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassLeggings, 1), new Object[] {
                "III",
                "I I",
                "I I", 'I', JarCraftItem.glassIngot});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassBoots, 1), new Object[] {
                "   ",
                "I I",
                "I I", 'I', JarCraftItem.glassIngot});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassBoots, 1), new Object[] {
                "I I",
                "I I",
                "   ", 'I', JarCraftItem.glassIngot});
    }
}