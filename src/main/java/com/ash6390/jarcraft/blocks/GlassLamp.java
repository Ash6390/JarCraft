package com.ash6390.jarcraft.blocks;

import com.ash6390.jarcraft.creativetab.CreativeTabJC;
import com.ash6390.jarcraft.init.ModItems;
import com.ash6390.jarcraft.items.IlluminatingOrb;
import com.ash6390.jarcraft.reference.References;
import com.ash6390.jarcraft.tileentity.TileEntityGlassLamp;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import java.util.Random;

public class GlassLamp extends BlockContainer
{
    public GlassLamp(Material material)
    {
        super(material);

        this.setLightLevel(1.0F);
        this.setHardness(0.3F);
        this.setResistance(0.3F);
        this.setCreativeTab(CreativeTabJC.JC_TAB);
        this.setBlockTextureName("glassLamp");
        this.setStepSound(soundTypeGlass);
    }

    public int getRenderType()
    {
        return -1;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean canSilkHarvest()
    {
        return true;
    }

    public Item getItemDropped(int par1, Random par2, int par3)
    {
        return ModItems.illuminatingOrb;
    }

    public int quantityDropped(Random r)
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        this.blockIcon = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5));
    }

    @Override
    public TileEntity createNewTileEntity(World var1, int var2)
    {
        return new TileEntityGlassLamp();
    }

}
