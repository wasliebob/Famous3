package mods.Famous3.mobs;

import mods.Famous3.lib.MainHelper;
import mods.Famous3.registers.ItemRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SkyDoesMinecraft extends EntityMob
{

public SkyDoesMinecraft(World par1World) 
{
super(par1World);
experienceValue = xp;

attackDamage = 1;
health = 10000;
moveSpeed = 0.4F;
xp = 5;
isAIEnabled = true;
dropName = Item.appleRed;
dropID = dropName.itemID;
nothing = 0;
attribute = EnumCreatureAttribute.UNDEAD;
amountGet = 1;
itemGet = "Budder Ingot";
amountGive = 1;
itemGive = "Squid Ingot";
itemBuying = ItemRegister.squidIngot;
itemSelling = ItemRegister.budderIngot;
requiredLevel = 10;
objectName = "SkyDoesMinecraft";
texture = MainHelper.modName.toLowerCase() + ":" + objectName.toLowerCase();

tasks.addTask(0, new EntityAISwimming(this));
tasks.addTask(1, new EntityAIBreakDoor(this));
tasks.addTask(4, new EntityAIWander(this, moveSpeed));
tasks.addTask(5, new EntityAIOpenDoor(this, hasAttacked));
tasks.addTask(6, new EntityAIAttackOnCollide(this, EntitySquid.class, moveSpeed, false));
targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySquid.class, 0, true));

}

public int health;
public int attackDamage;
public float moveSpeed;
public int xp;
public boolean isAIEnabled;
public String modName;
public String objectName;
public String texture;
public int damage;
public Item dropName;
public int dropID;
public int nothing;
public EnumCreatureAttribute attribute;

public int amountGet;
public String itemGet;
public int amountGive;
public String itemGive;

public Item itemBuying;
public Item itemSelling;
public int requiredLevel;

public int getAttackStrength(Entity entity)
{
return attackDamage;
}

public boolean isAIEnabled()
{
	return isAIEnabled;
}

public EnumCreatureAttribute getCreatureAttribute()
{
	return attribute;
}

public void dropFewItems(boolean par1, boolean par2)
{
	dropItem(nothing, 1);
}

public String getTextures()
{
	return texture;
}

public boolean interact(EntityPlayer player)
{
    ItemStack itemstack = player.getCurrentEquippedItem();

    if (itemstack != null && itemstack.getItem() == itemBuying && itemstack.getItemDamage() == 0)
    {
    	if(player.experienceLevel > requiredLevel)
    	{
    		
        if(player.capabilities.isCreativeMode)
        {
        	if(!worldObj.isRemote)
        	{
        		player.addChatMessage("\u00A74" + "You cannot trade in creative!");
        	}
        }
        
        if (!player.capabilities.isCreativeMode)
        {
        	if(!worldObj.isRemote)
        	{        			
            --itemstack.stackSize;
            player.inventory.addItemStackToInventory(new ItemStack(itemSelling));
    		player.addChatMessage("\u00A7b" + "Thank you for trading with me!");
        	}
        }
        
        if (itemstack.stackSize <= 0)
        {
            player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
        }

        return true;
    	}
    	else
    	{
    		player.addChatMessage("\u00A74" + "You dont have the required " + requiredLevel + " " + "levels");
    		return false;
    	}
    }
    else
    {
    	if(!worldObj.isRemote){
    	player.addChatMessage("\u00A7b" + "I will give you" + " " + amountGet + " " + itemGet + " " + "if you give me" + " " + amountGive + " " + itemGive);
		player.addChatMessage("\u00A74" + "Hold the Item in your hand and click on me to finish the trade"); 
		player.addChatMessage("\u00A74" + "Requires " + requiredLevel + " " + "levels to complete");
    	}
		return false;
    }
}
}