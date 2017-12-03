
package borealis.woodcutterstools.proxy;

import borealis.woodcutterstools.Config;
import borealis.woodcutterstools.ModBlocks;
import borealis.woodcutterstools.ModItems;

import borealis.woodcutterstools.WoodcuttersTools;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import java.io.File;

public class CommonProxy {

    // Config instance
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "woodcutterstools.cfg"));
        Config.readConfig();


        ModBlocks.init();
        ModItems.init();


    }

    public void init(FMLInitializationEvent e) {
        //NetworkRegistry.INSTANCE.registerGuiHandler(WoodcuttersTools.instance, new GuiProxy());
    }

    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }
}