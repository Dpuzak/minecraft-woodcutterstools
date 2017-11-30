package borealis.woodcutterstools;
import borealis.woodcutterstools.blocks.BlockWCTPolishedOakPlank;
import borealis.woodcutterstools.blocks.BlockWCTPolishedDarkOakPlank;
import borealis.woodcutterstools.blocks.BlockWCTPolishedSprucePlank;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Dennis Puzak on 29.11.17.
 */
public class ModBlocks {

    public static BlockWCTPolishedDarkOakPlank polishedDarkOak;
    public static BlockWCTPolishedOakPlank polishedOak;
    public static BlockWCTPolishedSprucePlank polishedSpruce;

    public static void init() {
        polishedOak = new BlockWCTPolishedOakPlank();
        polishedSpruce = new BlockWCTPolishedSprucePlank();
        polishedDarkOak = new BlockWCTPolishedDarkOakPlank();
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        polishedOak.initModel();
        polishedSpruce.initModel();
        polishedDarkOak.initModel();
    }


}