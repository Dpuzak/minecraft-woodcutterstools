package borealis.woodcutterstools;

import borealis.woodcutterstools.proxy.CommonProxy;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = WoodcuttersTools.MODID, version = WoodcuttersTools.VERSION, name = WoodcuttersTools.MODNAME)
public class WoodcuttersTools
{
    public static final String MODID = "woodcutterstools";
    public static final String VERSION = "0.1";
    public static final String MODNAME = "Woodcuters Tools";


    @SidedProxy(clientSide = "borealis.woodcutterstools.proxy.ClientProxy", serverSide = "borealis.woodcutterstools.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static WoodcuttersTools instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {



        proxy.init(e);

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }

    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        //event.registerServerCommand(new TeleportCommand());
    }




}
