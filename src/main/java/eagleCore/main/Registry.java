package eagleCore.main;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Registry extends GameRegistry{
	static Item naturepowder;
	
	public static void addItem(){
			naturepowder = new Item().setCreativeTab(CreativeTabs.MATERIALS).setMaxStackSize(64).setUnlocalizedName("naturepowder");
		
		GameRegistry.registerItem(naturepowder, naturepowder.getUnlocalizedName().substring(5));
		
	
	}

	public static void DoItemClientRegistry(String modID){
		Item item = naturepowder;
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modID + item.getUnlocalizedName().substring(5), "inventory"));
	}
}