package com.ash6390.jarcraft;

import com.ash6390.jarcraft.init.ModBlocks;
import com.ash6390.jarcraft.init.ModItems;
import com.ash6390.jarcraft.items.JarCraftItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void registerRecipes()
    {
        //Glass Ingot
        GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 2), new Object[]{
                "IG ",
                "GI ",
                "   ", 'I', Item.itemRegistry.getObject("iron_ingot"), 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 2), new Object[]{
                " IG",
                " GI",
                "   ", 'I', Item.itemRegistry.getObject("iron_ingot"), 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 2), new Object[]{
                "   ",
                "IG ",
                "GI ", 'I', Item.itemRegistry.getObject("iron_ingot"), 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 2), new Object[]{
                "   ",
                " IG",
                " GI", 'I', Item.itemRegistry.getObject("iron_ingot"), 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 9), new Object[]{
                    "B  ",
                    "   ",
                    "   ", 'B', ModBlocks.glassIngotBlock});

            GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 9), new Object[]{
                    " B ",
                    "   ",
                    "   ", 'B', ModBlocks.glassIngotBlock});

            GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 9), new Object[]{
                    "  B",
                    "   ",
                    "   ", 'B', ModBlocks.glassIngotBlock});

            GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 9), new Object[]{
                    "   ",
                    "B  ",
                    "   ", 'B', ModBlocks.glassIngotBlock});

            GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 9), new Object[]{
                    "   ",
                    " B ",
                    "   ", 'B', ModBlocks.glassIngotBlock});

            GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 9), new Object[]{
                    "   ",
                    "  B",
                    "   ", 'B', ModBlocks.glassIngotBlock});

            GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 9), new Object[]{
                    "   ",
                    "   ",
                    "B  ", 'B', ModBlocks.glassIngotBlock});

            GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 9), new Object[]{
                    "   ",
                    "   ",
                    " B ", 'B', ModBlocks.glassIngotBlock});

            GameRegistry.addRecipe(new ItemStack(ModItems.glassIngot, 9), new Object[]{
                    "   ",
                    "   ",
                    "  B", 'B', ModBlocks.glassIngotBlock});

        //Glass Stick
        GameRegistry.addRecipe(new ItemStack(ModItems.glassStick, 4), new Object[]{
                "G  ",
                "G  ",
                "   ", 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(ModItems.glassStick, 4), new Object[]{
                " G ",
                " G ",
                "   ", 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(ModItems.glassStick, 4), new Object[]{
                "  G",
                "  G",
                "   ", 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(ModItems.glassStick, 4), new Object[]{
                "   ",
                "G  ",
                "G  ", 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(ModItems.glassStick, 4), new Object[]{
                "   ",
                " G ",
                " G ", 'G', Block.blockRegistry.getObject("glass")});

        GameRegistry.addRecipe(new ItemStack(ModItems.glassStick, 4), new Object[]{
                "   ",
                "  G",
                "  G", 'G', Block.blockRegistry.getObject("glass")});

        //Glass Sword
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassSword, 1), new Object[]{
                " I ",
                " I ",
                " S ", 'I', ModItems.glassIngot, 'S', ModItems.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassSword, 1), new Object[]{
                "I  ",
                "I  ",
                "S  ", 'I', ModItems.glassIngot, 'S', ModItems.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassSword, 1), new Object[]{
                "  I",
                "  I",
                "  S", 'I', ModItems.glassIngot, 'S', ModItems.glassStick});

        //Glass Pickaxe
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassPick, 1), new Object[]{
                "III",
                " S ",
                " S ", 'I', ModItems.glassIngot, 'S', ModItems.glassStick});

        //Glass Shovel
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassShovel, 1), new Object[]{
                " I ",
                " S ",
                " S ", 'I', ModItems.glassIngot, 'S', ModItems.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassShovel, 1), new Object[]{
                "I  ",
                "S  ",
                "S  ", 'I', ModItems.glassIngot, 'S', ModItems.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassShovel, 1), new Object[]{
                "  I",
                "  S",
                "  S", 'I', ModItems.glassIngot, 'S', ModItems.glassStick});

        //Glass Axe
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassAxe, 1), new Object[]{
                "II ",
                "IS ",
                " S ", 'I', ModItems.glassIngot, 'S', ModItems.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassAxe, 1), new Object[]{
                " II",
                " SI",
                " S ", 'I', ModItems.glassIngot, 'S', ModItems.glassStick});

        //Glass Hoe
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassHoe, 1), new Object[]{
                "II ",
                " S ",
                " S ", 'I', ModItems.glassIngot, 'S', ModItems.glassStick});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassHoe, 1), new Object[]{
                " II",
                " S ",
                " S ", 'I', ModItems.glassIngot, 'S', ModItems.glassStick});

        //Glass Helmet
        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassHelmet, 1), new Object[]{
                "III",
                "I I",
                "   ", 'I', ModItems.glassIngot});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassHelmet, 1), new Object[]{
                "   ",
                "III",
                "I I", 'I', ModItems.glassIngot});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassChestplate, 1), new Object[]{
                "I I",
                "III",
                "III", 'I', ModItems.glassIngot});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassLeggings, 1), new Object[]{
                "III",
                "I I",
                "I I", 'I', ModItems.glassIngot});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassBoots, 1), new Object[]{
                "   ",
                "I I",
                "I I", 'I', ModItems.glassIngot});

        GameRegistry.addRecipe(new ItemStack(JarCraftItem.glassBoots, 1), new Object[]{
                "I I",
                "I I",
                "   ", 'I', ModItems.glassIngot});

        //Illuminating Orb
        GameRegistry.addRecipe(new ItemStack(ModItems.illuminatingOrb, 8), new Object[]{
                "GGG",
                "GIG",
                "GGG", 'G', Blocks.glowstone, 'I', ModItems.glassIngot});

        //Glass Ingot Block
        GameRegistry.addRecipe(new ItemStack(ModBlocks.glassIngotBlock, 1), new Object[]{
                "III",
                "III",
                "III", 'I', ModItems.glassIngot});

        //Glass Lamp
        GameRegistry.addRecipe(new ItemStack(ModBlocks.glassLamp, 1), new Object[] {
                "GGG",
                "GOG",
                "GGG", 'G', Blocks.glass, 'O', ModItems.illuminatingOrb});
    }
}