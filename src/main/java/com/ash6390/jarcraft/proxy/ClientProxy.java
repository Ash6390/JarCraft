package com.ash6390.jarcraft.proxy;

import com.ash6390.jarcraft.init.ModBlocks;
import com.ash6390.jarcraft.renderer.ItemRenderGlassLamp;
import com.ash6390.jarcraft.renderer.RenderGlassLamp;
import com.ash6390.jarcraft.tileentity.TileEntityGlassLamp;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends ServerProxy
{
    public void registerRenderThings()
    {
        //GlassLamp
        TileEntitySpecialRenderer render = new RenderGlassLamp();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGlassLamp.class, render);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.glassLamp), new ItemRenderGlassLamp(render, new TileEntityGlassLamp()));

    }

    public void registerTileEntitySpecialRenderer()
    {

    }

    public int addArmor(String armor){
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
}
