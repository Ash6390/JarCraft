package com.ash6390.jarcraft;

import com.ash6390.jarcraft.configurations.ConfigurationHandler;
import com.ash6390.jarcraft.proxy.IProxy;
import com.ash6390.jarcraft.reference.Configs;
import com.ash6390.jarcraft.reference.References;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=References.MODID, name=References.NAME, version = References.VERSION)
public class JarCraftCore
{
    @Mod.Instance("JarCraft")
    public static JarCraftCore instance;

    @SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        System.out.println("USELESS VALUE: " + Configs.uselessValue);
        System.out.println("USELESS DOUBLE: " + Configs.uselessDouble);
        System.out.println("USELESS STRING: " + Configs.uselessString);
    }

    public void init(FMLInitializationEvent event){

    }

    public void postInit(FMLPostInitializationEvent event){

    }
}
