package com.madcliffe.craftofzelda.util;

import com.madcliffe.craftofzelda.CraftOfZelda;
import com.madcliffe.craftofzelda.blocks.BlockItemBase;
import com.madcliffe.craftofzelda.blocks.RupeeBlock;
import com.madcliffe.craftofzelda.items.ItemBase;
import com.madcliffe.craftofzelda.items.Omelette;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.madcliffe.craftofzelda.tools.ModItemTier;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CraftOfZelda.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CraftOfZelda.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> RUPEE = ITEMS.register("rupee", ItemBase::new);
    public static final RegistryObject<Item> HYLIAN_INGOT = ITEMS.register("hylian_ingot", ItemBase::new);
    public static final RegistryObject<Omelette>  OMELETTE = ITEMS.register("omelette", Omelette::new);

    //Tools
    public static final RegistryObject<SwordItem> MASTER_SWORD = ITEMS.register("master_sword", () -> new SwordItem(ModItemTier.HYLIAN, 14, -1.8F, new Item.Properties().group(CraftOfZelda.TAB)));

    //Blocks
    public static final RegistryObject<Block> RUPEE_BLOCK = BLOCKS.register("rupee_block", RupeeBlock::new);

    //Block Items
    public static final RegistryObject<Item> RUPEE_BLOCK_ITEM = ITEMS.register("rupee_block", () -> new BlockItemBase(RUPEE_BLOCK.get()));
}
