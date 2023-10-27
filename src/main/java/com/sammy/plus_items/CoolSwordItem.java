package com.sammy.plus_items;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.*;
import net.minecraftforge.common.*;

public class CoolSwordItem extends SwordItem {
    public CoolSwordItem(Properties properties) {
        super(ItemTierEnum.COOL_FKIN_SWORD, 29, 11f, properties);
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return false;
    }
}
