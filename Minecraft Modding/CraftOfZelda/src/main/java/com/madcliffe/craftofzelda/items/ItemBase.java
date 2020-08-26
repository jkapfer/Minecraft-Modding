package com.madcliffe.craftofzelda.items;

import com.madcliffe.craftofzelda.CraftOfZelda;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(CraftOfZelda.TAB));
    }
}
