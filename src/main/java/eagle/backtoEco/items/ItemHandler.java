package eagle.backtoEco.items;

import eagle.backtoEco.main.Vars;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemHandler {
	
	public static Item naturepowder;
	
	public static void init(){
		naturepowder = new Item().setCreativeTab(CreativeTabs.MATERIALS).setMaxStackSize(64).setUnlocalizedName("naturepowder");
	}
	
	public static void register(){
		GameRegistry.registerItem(naturepowder, naturepowder.getUnlocalizedName().substring(5));
	}
	public static void registerrenders(){
		registerrender(naturepowder);
	}
	
	
	public static void registerrender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Vars.MOD_ID + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
