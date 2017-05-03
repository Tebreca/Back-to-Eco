package eagleCore.main.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class StandardBlock extends Block{

	public StandardBlock(Material materialIn, String unlocalizedName, float hardness, int harvestlevel, String Harvesttool) {
		super(materialIn);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setHarvestLevel(Harvesttool,harvestlevel);
	}

}
