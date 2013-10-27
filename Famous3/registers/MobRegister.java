package mods.Famous3.registers;

import mods.Famous3.lib.ColorHelper;
import mods.Famous3.lib.EntityHelper;
import mods.Famous3.lib.MainHelper;
import mods.Famous3.main.Main;
import mods.Famous3.mobs.SkyDoesMinecraft;
import mods.Famous3.models.ModelFamous;
import mods.Famous3.renders.RenderSkyDoesMinecraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MobRegister {
	
	public static void register()
	{
		EntityRegistry.registerModEntity(SkyDoesMinecraft.class, "SkyDoesMinecraft", MainHelper.entityId,
				Main.instance, 70, 3, true);
		EntityRegistry.addSpawn(SkyDoesMinecraft.class, 10, 2, 4, EnumCreatureType.monster,
						BiomeGenBase.beach, BiomeGenBase.extremeHills,
						BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest,
						BiomeGenBase.forestHills, BiomeGenBase.jungle,
						BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
						BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean,
						BiomeGenBase.plains, BiomeGenBase.river,
						BiomeGenBase.swampland);
	}
	
	public static void renders()
	{
        RenderingRegistry.registerEntityRenderingHandler(SkyDoesMinecraft.class, new RenderSkyDoesMinecraft(new ModelFamous(), 0.5F));    
	}
	
	public static void localization()
	{
		LanguageRegistry.instance().addStringLocalization(
			"entity." + MainHelper.modName + ".SkyDoesMinecraft." + "name", "SkyDoesMinecraft");
	}
	
	public static void spawnEgg()
	{
		EntityHelper.registerEntityEgg(SkyDoesMinecraft.class, ColorHelper.white, ColorHelper.black);
	}
	
}
