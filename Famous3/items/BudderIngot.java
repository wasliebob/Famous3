package mods.Famous3.items;

import mods.Famous3.lib.MainHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class BudderIngot extends Item {

        public BudderIngot(int id) {
                super(id);
                
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMisc);
                
                name = "Budder";
                type = "Ingot";
                texture = MainHelper.modName.toLowerCase() + ":" + name.toLowerCase() + type.toLowerCase();

                setUnlocalizedName(name + type);
                GameRegistry.registerItem(this, name.toLowerCase() + type.toLowerCase());
                LanguageRegistry.addName(this, name + " " + type);
                
        }
        
        public String name;
        public String type;
        public String texture;
        
        public void registerIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon(texture);
        }
        
        public void updateIcons(IconRegister par1IconRegister) {
            this.itemIcon = par1IconRegister.registerIcon(texture);
        }
}