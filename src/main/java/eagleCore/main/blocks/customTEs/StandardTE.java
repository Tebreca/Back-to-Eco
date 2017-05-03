package eagleCore.main.blocks.customTEs;

import eagleCore.main.blocks.customTEs.tileentities.TileEnityBlockStandard;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class StandardTE extends Block implements ITileEntityProvider{

	public StandardTE(Material material, String unlocalizedName, float hardness, int harvestlevel, String harvesttool){
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setHarvestLevel(harvesttool, harvestlevel);
		this.setResistance(10.0f);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEnityBlockStandard();
	}
}
