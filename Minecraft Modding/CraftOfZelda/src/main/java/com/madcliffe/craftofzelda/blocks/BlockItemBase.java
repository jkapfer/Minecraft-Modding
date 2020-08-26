package com.madcliffe.craftofzelda.blocks;

import com.madcliffe.craftofzelda.CraftOfZelda;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(CraftOfZelda.TAB));
    }
}
