package borealis.woodcutterstools.crafting;

/**
 * Created by Dennis Puzak on 30.11.17.
 */


import net.minecraft.block.BlockPlanks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import borealis.woodcutterstools.ModItems;
import borealis.woodcutterstools.ModBlocks;

public class ModRecipes {




    private static void makePolsihedWoodRecipe(Block block, ItemStack logType){

        GameRegistry.addRecipe(new ItemStack(block),  new Object[] {"PI",  'P', ModItems.woodcuttersSaw, 'I',  logType });

    }





    public static void addRecipes() {
        //shaped crafting recipes




        GameRegistry.addRecipe(new ItemStack(ModItems.woodcuttersSaw), new Object[] {"PII",  'P', Blocks.PLANKS, 'I',  Items.IRON_INGOT });

        GameRegistry.addRecipe(new ItemStack(ModBlocks.polishedOakStairs, 4),  new Object[] {"#  ", "## ", "###", '#',  ModBlocks.polishedOak });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.polishedAcaciaStairs, 4),  new Object[] {"#  ", "## ", "###", '#',  ModBlocks.polishedAcacia });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.polishedDarkOakStairs, 4),  new Object[] {"#  ", "## ", "###", '#',  ModBlocks.polishedDarkOak });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.polishedJungleStairs, 4),  new Object[] {"#  ", "## ", "###", '#',  ModBlocks.polishedJungle });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.polishedBirchStairs, 4),  new Object[] {"#  ", "## ", "###", '#',  ModBlocks.polishedBirch });
        GameRegistry.addRecipe(new ItemStack(ModBlocks.polishedSpruceStairs, 4),  new Object[] {"#  ", "## ", "###", '#',  ModBlocks.polishedSpruce });

        makePolsihedWoodRecipe(ModBlocks.polishedOak, new ItemStack(Blocks.LOG, 1, 0) );
        makePolsihedWoodRecipe(ModBlocks.polishedSpruce, new ItemStack(Blocks.LOG, 1, 1)  );
        makePolsihedWoodRecipe(ModBlocks.polishedBirch, new ItemStack(Blocks.LOG, 1, 2) );
        makePolsihedWoodRecipe(ModBlocks.polishedJungle, new ItemStack(Blocks.LOG, 1, 3) );

        makePolsihedWoodRecipe(ModBlocks.polishedAcacia, new ItemStack(Blocks.LOG2, 1, 0) );
        makePolsihedWoodRecipe(ModBlocks.polishedDarkOak, new ItemStack(Blocks.LOG2, 1, 1) );







    }
}