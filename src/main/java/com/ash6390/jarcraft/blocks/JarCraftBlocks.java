package com.ash6390.jarcraft.blocks;

import com.ash6390.jarcraft.JarCraftCore;
import com.ash6390.jarcraft.reference.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.audio.SoundRegistry;

public class JarCraftBlocks
{
    public static Block GlassIngotBlock;

    public static void BlockInit()
    {
        initializeBlocks();
        registerBlocks();
    }

    public static void initializeBlocks()
    {
        GlassIngotBlock = new GlassIngotBlock(Material.iron).setBlockName("GlassIngotBlock").setBlockTextureName(References.MODID + ":glass_ingot_block").setCreativeTab(JarCraftCore.JarCraftTab);
    }

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(GlassIngotBlock, "GlassIngotBlock");
    }
}