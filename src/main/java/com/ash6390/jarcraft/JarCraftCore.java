package com.ash6390.jarcraft;

import com.ash6390.jarcraft.handler.ConfigurationHandler;
import com.ash6390.jarcraft.init.ModBlocks;
import com.ash6390.jarcraft.init.ModItems;
import com.ash6390.jarcraft.items.JarCraftItem;
import com.ash6390.jarcraft.proxy.ServerProxy;
import com.ash6390.jarcraft.reference.Configs;
import com.ash6390.jarcraft.reference.References;
import com.ash6390.jarcraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

@Mod(modid=References.MODID, name=References.NAME, version = References.VERSION, guiFactory = References.GUI_FACTORY_CLASS)
public class JarCraftCore
{

    @Mod.Instance("JarCraft")
    public static JarCraftCore instance;



    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
    public static ServerProxy proxy;

    public static CreativeTabs JarCraftTab = new CreativeTabs("JarCraftTab")
    {
        public Item getTabIconItem()
        {
            if (Configs.itemsOn)
            {
                return ModItems.glassIngot;

            } else {

                return Items.glass_bottle;

            }

        }
    };


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        if (Configs.itemsOn)
        {

            JarCraftItem.ItemInit();


            ModItems.init();
            ModBlocks.init();

            Recipes.registerRecipes();

        }
        else
        {
            LogHelper.info("Items are turned off! Skipping!");
        }

        LogHelper.info("Pre Initialization Complete!");

        //Will be removed
        proxy.registerRenderThings();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Post Initialization Complete!");
        LogHelper.warn("This is a Work in Progress version! Expect bugs!");
    }

}
