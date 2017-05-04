package eagle.backtoEco.main;

import eagle.backtoEco.items.Items;
import eagle.backtoEco.proxy.ClientP;
import eagle.backtoEco.proxy.ServerP;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Vars.MOD_ID, name = Vars.MOD_NAME, version = Vars.MOD_VERSION)
public class Main {
	@SidedProxy(clientSide = eagle.backtoEco.main.Vars.CProxy, serverSide = Vars.SProxy)
	public static ServerP proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event){
		Items.init();
		Items.register();
		
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event){
		proxy.registerrenders();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event){
		
	}
}
