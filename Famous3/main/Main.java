package mods.Famous3.main;

import mods.Famous3.registers.BlockRegister;
import mods.Famous3.registers.ItemRegister;
import mods.Famous3.registers.MobRegister;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Famous3", name = "Famous3", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Main {

    @SidedProxy(clientSide = "mods.Famous3.client.ClientProxy", serverSide = "mods.Famous3.main.CommonProxy")
    public static CommonProxy proxy;
 
    @Instance("Famous3")
    public static Main instance;    
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @Init
    public void load(FMLInitializationEvent evt)
    {
    	proxy.registerParticles();
        proxy.registerRenderInformation();
        MinecraftForge.EVENT_BUS.register(this);
        
        ItemRegister.register();
        ItemRegister.recipe();
        MobRegister.register();
        MobRegister.renders();
        MobRegister.localization();
        MobRegister.spawnEgg();
        BlockRegister.register();
        BlockRegister.renders();
        BlockRegister.recipe();
    }

    @PostInit
    public void modsLoaded(FMLPostInitializationEvent evt)
    {
    }
    
}
