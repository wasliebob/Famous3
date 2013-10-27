package mods.Famous3.lib;

import java.util.ArrayList;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityHelper {
    static int startEntityId = 300;

	public static int getUniqueEntityId() {
		do {
			startEntityId++;
		} while (EntityList.getStringFromID(startEntityId) != null);

		return startEntityId;
	}

	public static int registerEntityEgg(Class<? extends Entity> entity,
			int primaryColor, int secondaryColor) {
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor,
				secondaryColor));
		return id;
	}
	
	ArrayList<BiomeGenBase> biomeList = new ArrayList<BiomeGenBase>();{
	for(int i = 0; i < BiomeGenBase.biomeList.length; i++)
	{
	if(BiomeGenBase.biomeList[i] != null && BiomeGenBase.biomeList[i].biomeID != 17)
	{
	biomeList.add(BiomeGenBase.biomeList[i]);
	}
	}
	}
}
