package eagleCore.main;

import eagleCore.main.blocks.LanternBlock;
import eagleCore.main.blocks.StandardBlock;
import eagleCore.main.blocks.customTEs.StandardTE;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockRegistryHandler extends GameRegistry{

	
	public BlockRegistryHandler(int blocktype,Block block, String UnlocalizedName, Material material, String modid, float hardness, int harvestlevel, String harvesttool){
		//checking for which type block the person wants to add:
		/* 1= StandardBlock
		 * 2= TileEntity with no function
		 * 3= Lamp block
		 */
		if(blocktype == 1){
			GameRegistry.registerBlock(block = new StandardBlock(material, UnlocalizedName, hardness, harvestlevel, harvesttool), block.getUnlocalizedName().substring(5));
		} else if(blocktype == 2){
			GameRegistry.registerBlock(block = new StandardTE(material, UnlocalizedName, hardness, harvestlevel, harvesttool), block.getUnlocalizedName().substring(5));
		} else if(blocktype == 3){
			GameRegistry.registerBlock(block = new LanternBlock(material, UnlocalizedName, hardness, harvestlevel, harvesttool), block.getUnlocalizedName().substring(5));
		} else {
			throw new IllegalArgumentException("The blocktype of block " + block + " is not supported");
		}
		

	}
	
	public static void DoBlockClientRegistry(Block block, String modid){
			Item item = Item.getItemFromBlock(block);
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
