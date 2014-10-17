package com.ash6390.jarcraft.proxy;

import com.ash6390.jarcraft.init.ModBlocks;
import com.ash6390.jarcraft.renderer.ItemRenderGlassLamp;
import com.ash6390.jarcraft.renderer.ItemRenderIlluminatingOrb;
import com.ash6390.jarcraft.renderer.RenderGlassLamp;
import com.ash6390.jarcraft.tileentity.TileEntityGlassLamp;
import com.ash6390.jarcraft.tileentity.TileEntityIlluminatingOrb;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends ServerProxy
{
    public void registerRenderThings()
    {
        //GlassLamp
        TileEntitySpecialRenderer renderGlassLamp = new RenderGlassLamp();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGlassLamp.class, renderGlassLamp);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.glassLamp), new ItemRenderGlassLamp(renderGlassLamp, new TileEntityGlassLamp()));
        //IlluminatingOrb
        TileEntitySpecialRenderer renderIllOrb = new RenderGlassLamp();
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIlluminatingOrb.class, renderIllOrb);
        MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(ModBlocks.illuminatingOrbBlock), new ItemRenderIlluminatingOrb(renderIllOrb, new TileEntityGlassLamp()));

    }

    public void registerTileEntitySpecialRenderer()
    {

    }

    public int addArmor(String armor){
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }
}
