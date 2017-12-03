package borealis.woodcutterstools.blocks;



        import borealis.woodcutterstools.WoodcuttersTools;
        import net.minecraft.block.Block;
        import net.minecraft.block.material.Material;
        import net.minecraft.client.renderer.block.model.ModelResourceLocation;
        import net.minecraft.creativetab.CreativeTabs;
        import net.minecraft.item.Item;
        import net.minecraft.item.ItemBlock;
        import net.minecraftforge.client.model.ModelLoader;
        import net.minecraftforge.fml.common.registry.GameRegistry;
        import net.minecraftforge.fml.relauncher.Side;
        import net.minecraftforge.fml.relauncher.SideOnly;


public class PolishedWoodBlock extends Block  {



    public PolishedWoodBlock(String name) {
        super(Material.WOOD);
        setUnlocalizedName(WoodcuttersTools.MODID + "." + name);     // Used for localization (en_US.lang)
        setRegistryName(name);        // The unique name (within your mod) that identifies this block
        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this), getRegistryName());
        //setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
    }


    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
