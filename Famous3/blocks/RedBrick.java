package mods.Famous3.blocks;

import java.util.Random;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import mods.Famous3.lib.MainHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class RedBrick extends Block
{
    public RedBrick(int par1)
    {
        super(par1, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        name = "Red";
        type = "Brick";
        texture = MainHelper.modName.toLowerCase() + ":" + name.toLowerCase() + type.toLowerCase();
        
        setUnlocalizedName(name + type);
        GameRegistry.registerBlock(this, name.toLowerCase() + type.toLowerCase());
        LanguageRegistry.addName(this, name + " " + type);
    }
    public String name;
    public String type;
    public String texture;

    public void registerIcons(IconRegister par1IconRegister) {
    	this.blockIcon = par1IconRegister.registerIcon(texture);
    }

    public void updateIcons(IconRegister par1IconRegister) {
    	this.blockIcon = par1IconRegister.registerIcon(texture);
    }    
}