package com.mrz.swordmod.items;

import com.mrz.swordmod.SwordMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(SwordMod.TAB));
    }
}
