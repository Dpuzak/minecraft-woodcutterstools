package borealis.woodcutterstools.proxy;

import borealis.woodcutterstools.ModBlocks;
import borealis.woodcutterstools.ModItems;
import borealis.woodcutterstools.WoodcuttersTools;
import borealis.woodcutterstools.crafting.ModRecipes;

import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;


public class ServerProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);

      //  OBJLoader.INSTANCE.addDomain(WoodcuttersTools.MODID);
        //ModelLoaderRegistry.registerLoader(new BakedModelLoader());

        // Typically initialization of models and such goes here:
     //   ModBlocks.initModels();
       ModRecipes.addRecipes();
      //  ModItems.initModels();

        //ModEntities.initModels();
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);

        // Initialize our input handler so we can listen to keys
        // MinecraftForge.EVENT_BUS.register(new InputHandler());
        //KeyBindings.init();

        //ModBlocks.initItemModels();
    }
}
