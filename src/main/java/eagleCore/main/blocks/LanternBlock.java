package eagleCore.main.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LanternBlock extends Block {

	public LanternBlock(Material materialIn, String unlocalizedName, float hardness, int harvestlevel,String harvesttool) {
		super (materialIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setHarvestLevel(harvesttool,harvestlevel);
		this.setLightLevel(10.5f);
		this.setLightOpacity(0);
	}

}
