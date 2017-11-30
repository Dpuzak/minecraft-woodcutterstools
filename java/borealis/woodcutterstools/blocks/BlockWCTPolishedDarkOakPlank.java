package borealis.woodcutterstools.blocks;

import borealis.woodcutterstools.WoodcuttersTools;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Dennis Puzak on 29.11.17.
 */
public class BlockWCTPolishedDarkOakPlank extends Block  {


    public BlockWCTPolishedDarkOakPlank() {
        super(Material.WOOD);
        setUnlocalizedName(WoodcuttersTools.MODID + ".polished_dark_oak_plank");     // Used for localization (en_US.lang)
        setRegistryName("polished_dark_oak_plank");        // The unique name (within your mod) that identifies this block
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
    }


    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
