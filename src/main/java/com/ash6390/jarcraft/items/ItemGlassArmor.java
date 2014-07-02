package com.ash6390.jarcraft.items;

import com.ash6390.jarcraft.reference.References;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemGlassArmor extends ItemArmor
{

    public ItemGlassArmor(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_)
    {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
    }

    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(stack.getItem() == JarCraftItem.glassHelmet || stack.getItem() == JarCraftItem.glassChestplate || stack.getItem() == JarCraftItem.glassBoots)
        {
            return References.MODID + ":textures/armor/glass_armor_layer_1.png";
        }else if(stack.getItem() == JarCraftItem.glassLeggings)
        {
            return References.MODID + ":textures/armor/glass_armor_layer_2.png";
        }else{
            return null;
        }
    }
}
