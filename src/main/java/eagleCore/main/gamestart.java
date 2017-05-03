package eagleCore.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;

@Mod(modid = "EaglCore")

public class gamestart {
	public static void Serverstart(FMLServerStartedEvent event){
		System.out.println("Eaglecore Eventlog ServerStarted");
	}

}
