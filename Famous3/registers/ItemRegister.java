package mods.Famous3.registers;

import mods.Famous3.items.BlueIngot;
import mods.Famous3.items.BudderIngot;
import mods.Famous3.items.RedIngot;
import mods.Famous3.items.SquidIngot;
import mods.Famous3.lib.MainHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegister {

	public static void register()
	{
		budderIngot = new BudderIngot(MainHelper.itemId);
		squidIngot = new SquidIngot(MainHelper.itemId + 1);
		redIngot = new RedIngot(MainHelper.itemId + 2);
		blueIngot = new BlueIngot(MainHelper.itemId + 3);
	}
	
	public static void recipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(squidIngot), new Object[]{
			Item.ingotIron, new ItemStack(Item.dyePowder)});

		GameRegistry.addShapelessRecipe(new ItemStack(redIngot), new Object[]{
			Item.ingotIron, new ItemStack(Item.dyePowder, 1, 1)});
		
		GameRegistry.addShapelessRecipe(new ItemStack(blueIngot), new Object[]{
			Item.ingotIron, new ItemStack(Item.dyePowder, 1, 4)});
	}
	
    public static Item budderIngot;
    public static Item squidIngot;
    public static Item redIngot;
    public static Item blueIngot;
}
