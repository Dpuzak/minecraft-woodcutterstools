package borealis.woodcutterstools;

/**
 * Created by Dennis Puzak on 29.11.17.
 */

import borealis.woodcutterstools.items.ItemWCTWoodcuttersSaw;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class ModItems {

    public static ItemWCTWoodcuttersSaw woodcuttersSaw;


    public static void init() {
        woodcuttersSaw = new ItemWCTWoodcuttersSaw();
;
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        woodcuttersSaw.initModel();

    }

}
