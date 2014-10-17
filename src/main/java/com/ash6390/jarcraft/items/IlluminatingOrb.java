package com.ash6390.jarcraft.items;

import com.ash6390.jarcraft.creativetab.CreativeTabJC;
import com.ash6390.jarcraft.init.ModBlocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IlluminatingOrb extends ItemJC
{
    public IlluminatingOrb()
    {
        super();
        this.setUnlocalizedName("illuminatingOrb");
        this.setCreativeTab(CreativeTabJC.JC_TAB);
    }

    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int face, float par8, float par9, float par10)
    {
        if (world.getBlock(x, y, z) == Blocks.tallgrass)
        {
            world.setBlock(x, y, z, ModBlocks.illuminatingOrbBlock);
        }
        else
        {
            switch (face)
            {
                case 0:
                    world.setBlock(x, --y, z, ModBlocks.illuminatingOrbBlock, face, 2);
                    break;
                case 1:
                    world.setBlock(x, ++y, z, ModBlocks.illuminatingOrbBlock, face, 2);
                    break;
                case 2:
                    world.setBlock(x, y, --z, ModBlocks.illuminatingOrbBlock, face, 2);
                    break;
                case 3:
                    world.setBlock(x, y, ++z, ModBlocks.illuminatingOrbBlock, face, 2);
                    break;
                case 4:
                    world.setBlock(--x, y, z, ModBlocks.illuminatingOrbBlock, face, 2);
                    break;
                case 5:
                    world.setBlock(++x, y, z, ModBlocks.illuminatingOrbBlock, face, 2);
                    break;
                default:
                    return false;
            }

        }

        return true;
    }
}
