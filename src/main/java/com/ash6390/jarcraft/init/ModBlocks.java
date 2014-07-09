package com.ash6390.jarcraft.init;

import com.ash6390.jarcraft.JarCraftCore;
import com.ash6390.jarcraft.blocks.BlockJC;
import com.ash6390.jarcraft.blocks.GlassIngotBlock;
import com.ash6390.jarcraft.blocks.GlassLamp;
import com.ash6390.jarcraft.reference.References;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@GameRegistry.ObjectHolder(References.MODID)
public class ModBlocks
{
    public static final BlockJC glassIngotBlock = new GlassIngotBlock();;
    public static final Block glassLamp = new GlassLamp(Material.glass).setLightLevel(1.0F).setBlockName("glassLamp").setHardness(0.3F).setResistance(0.3F).setCreativeTab(JarCraftCore.JarCraftTab).setBlockTextureName("glassLamp");

    public static void init()
    {
        GameRegistry.registerBlock(glassIngotBlock, "glassIngotBlock");
        GameRegistry.registerBlock(glassLamp, "glassLamp");
    }
}
