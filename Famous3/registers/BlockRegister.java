package mods.Famous3.registers;

import mods.Famous3.blocks.BlueBrick;
import mods.Famous3.blocks.RedBrick;
import mods.Famous3.items.BlueIngot;
import mods.Famous3.items.BudderIngot;
import mods.Famous3.items.RedIngot;
import mods.Famous3.items.SquidIngot;
import mods.Famous3.lib.MainHelper;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegister {
	
	public static void register()
	{
		blueBrick = new BlueBrick(MainHelper.blockId + 3);
		redBrick = new RedBrick(MainHelper.blockId + 2);

	}
	
	public static void renders()
	{
		
	}
	
	public static void recipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(redBrick), new Object[]{
			Block.stoneBrick, new ItemStack(Item.dyePowder, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(blueBrick), new Object[]{
			Block.stoneBrick, new ItemStack(Item.dyePowder, 1, 4)});
	}
	public static Block redBrick;
    public static Block blueBrick;
}

