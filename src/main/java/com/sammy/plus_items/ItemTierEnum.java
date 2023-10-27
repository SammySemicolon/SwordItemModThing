package com.sammy.plus_items;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.*;

import java.util.function.*;

public enum ItemTierEnum implements Tier
    {
        COOL_FKIN_SWORD(-1, 10f, 0, 4, 25, ()->Items.OBSIDIAN);
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int harvestLevel;
        private final int enchantability;
        private final Supplier<Item> repairItem;
        
        ItemTierEnum(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Supplier<Item> repairItem)
        {
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.harvestLevel = harvestLevel;
            this.enchantability = enchantability;
            this.repairItem = repairItem;
        }
        
        @Override
        public int getUses()
        {
            return maxUses;
        }
        
        @Override
        public float getSpeed()
        {
            return efficiency;
        }
        
        @Override
        public float getAttackDamageBonus()
        {
            return attackDamage;
        }
        
        @Override
        public int getLevel()
        {
            return harvestLevel;
        }
        
        @Override
        public int getEnchantmentValue()
        {
            return enchantability;
        }
        
        @Override
        public Ingredient getRepairIngredient()
        {
            return Ingredient.of(repairItem.get());
        }
    }