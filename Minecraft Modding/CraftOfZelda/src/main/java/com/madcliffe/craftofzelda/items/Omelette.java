package com.madcliffe.craftofzelda.items;

import com.madcliffe.craftofzelda.CraftOfZelda;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Omelette extends Item {

    public Omelette() {
        super(new Item.Properties()
                .group(CraftOfZelda.TAB)
                .food(new Food.Builder()
                        .hunger(6)
                        .saturation(1)
                        .effect(()->new EffectInstance(Effects.INSTANT_HEALTH, 1,1),1)
                        .effect(()->new EffectInstance(Effects.STRENGTH, 1200,0),1)
                        .setAlwaysEdible()
                        .meat()
                        .build())
        );
    }
}
