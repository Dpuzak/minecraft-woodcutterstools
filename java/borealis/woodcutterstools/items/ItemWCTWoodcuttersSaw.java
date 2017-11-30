package borealis.woodcutterstools.items;

import borealis.woodcutterstools.WoodcuttersTools;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.logging.log4j.Level;

public class ItemWCTWoodcuttersSaw extends Item {

    public ItemWCTWoodcuttersSaw(){
        setRegistryName("woodcutters_saw");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(WoodcuttersTools.MODID + ".woodcutters_saw");     // Used for localization (en_US.lang)
        GameRegistry.register(this);
        setContainerItem(this);

    }


    @SideOnly(Side.CLIENT)
    public void initModel() {


        WoodcuttersTools.logger.log(Level.ERROR, "YO: " + getRegistryName());
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));


    }

}
