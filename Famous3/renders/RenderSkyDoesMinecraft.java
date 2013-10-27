package mods.Famous3.renders;

import mods.Famous3.lib.MainHelper;
import mods.Famous3.models.ModelFamous;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSkyDoesMinecraft extends RenderLiving
{
    public static String mobName = "SkyDoesMinecraft";
    private static final ResourceLocation mob = new ResourceLocation(MainHelper.modName.toLowerCase() + ":" + MainHelper.mobLocation + mobName.toLowerCase() + ".png");
    
    public static  Class file;
    
    public RenderSkyDoesMinecraft(ModelFamous par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }
    
    public static ResourceLocation func_110832_a()
    {    	   
    	return mob;
    }

    protected ResourceLocation func_110775_a(Entity par1Entity)
    {
		return mob;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {

		return mob;
	}
}