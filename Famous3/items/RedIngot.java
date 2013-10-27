package mods.Famous3.items;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import mods.Famous3.lib.MainHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.event.Event;

public class RedIngot extends Item {

        public RedIngot(int id) {
                super(id);
                
                setMaxStackSize(64);
                setCreativeTab(CreativeTabs.tabMisc);
                
                name = "Red";
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