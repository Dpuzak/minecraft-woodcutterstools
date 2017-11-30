package borealis.woodcutterstools.crafting;

/**
 * Created by Dennis Puzak on 30.11.17.
 */


import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


import borealis.woodcutterstools.ModItems;
import borealis.woodcutterstools.ModBlocks;

public class ModRecipes {





    public static void addRecipes() {
        //shaped crafting recipes



        GameRegistry.addRecipe(new ItemStack(ModItems.woodcuttersSaw),


                new Object[] {"PII",  'P', Blocks.PLANKS, 'I',  Items.IRON_INGOT }
                );


        GameRegistry.addRecipe(new ItemStack(ModBlocks.polishedOak),


                new Object[] {"PI",  'P', ModItems.woodcuttersSaw, 'I',  new ItemStack(Blocks.LOG, 1, 0) }
        );


        GameRegistry.addRecipe(new ItemStack(ModBlocks.polishedSpruce),


                new Object[] {"PI",  'P', ModItems.woodcuttersSaw, 'I',  new ItemStack(Blocks.LOG, 1, 1) }
        );

        GameRegistry.addRecipe(new ItemStack(ModBlocks.polishedDarkOak),


                new Object[] {"PI",  'P', ModItems.woodcuttersSaw, 'I',  new ItemStack(Blocks.LOG2, 1, 2) }
        );

        //shapeless crafting recipes
        //GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cornSeed), new ItemStack(ModItems.corn));

        //smelting recipes


    }
}