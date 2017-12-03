package borealis.woodcutterstools;
import borealis.woodcutterstools.blocks.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Dennis Puzak on 29.11.17.
 */
public class ModBlocks {

    public static PolishedWoodBlock polishedDarkOak;

    public static PolishedWoodBlock polishedOak;
    public static PolishedWoodBlock polishedSpruce;

    public static PolishedWoodBlock polishedAcacia;
    public static PolishedWoodBlock polishedBirch;
    public static PolishedWoodBlock polishedJungle;

    public static PolishedWoodStairs polishedAcaciaStairs;
    public static PolishedWoodStairs polishedOakStairs;
    public static PolishedWoodStairs polishedDarkOakStairs;
    public static PolishedWoodStairs polishedBirchStairs;
    public static PolishedWoodStairs polishedJungleStairs;
    public static PolishedWoodStairs polishedSpruceStairs;

    public static void init() {
        
        polishedOak = new PolishedWoodBlock("polished_oak_plank");
        polishedJungle = new PolishedWoodBlock("polished_jungle_plank");
        polishedSpruce = new PolishedWoodBlock("polished_spruce_plank");
        polishedDarkOak = new PolishedWoodBlock("polished_dark_oak_plank");
        polishedAcacia = new PolishedWoodBlock("polished_acacia_plank");
        polishedBirch = new  PolishedWoodBlock("polished_birch_plank");

        polishedAcaciaStairs = new PolishedWoodStairs("polished_acacia_plank_stairs", polishedAcacia);
        polishedOakStairs = new PolishedWoodStairs("polished_oak_plank_stairs", polishedOak);
        polishedDarkOakStairs = new PolishedWoodStairs("polished_dark_oak_plank_stairs", polishedDarkOak);
        polishedBirchStairs = new PolishedWoodStairs("polished_birch_plank_stairs", polishedBirch);
        polishedJungleStairs = new PolishedWoodStairs("polished_jungle_plank_stairs", polishedJungle);
        polishedSpruceStairs = new PolishedWoodStairs("polished_spruce_plank_stairs", polishedSpruce);

    }







    @SideOnly(Side.CLIENT)
    public static void initModels() {

        polishedAcaciaStairs.initModel();
        polishedOakStairs.initModel();
        polishedDarkOakStairs.initModel();
        polishedBirchStairs.initModel();
        polishedJungleStairs.initModel();
        polishedSpruceStairs.initModel();




        polishedJungle.initModel();
        polishedBirch.initModel();
        polishedAcacia.initModel();
        polishedOak.initModel();
        polishedSpruce.initModel();
        polishedDarkOak.initModel();
    }


}