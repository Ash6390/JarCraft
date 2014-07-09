package com.ash6390.jarcraft.blocks;

import com.ash6390.jarcraft.JarCraftCore;
import net.minecraft.block.material.Material;

public class GlassIngotBlock extends BlockJC
{

    public GlassIngotBlock()
    {
        super(Material.iron);
        this.setBlockName("glassIngotBlock");
        this.setStepSound(soundTypeMetal);
        this.setHardness(5.0F);
        this.setResistance(10.0F);
        this.setCreativeTab(JarCraftCore.JarCraftTab);

    }

}
