package net.tornado.extinctionmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.tornado.extinctionmod.ExtinctionMod;

public class ModItemGroup {
    public static final ItemGroup EXTINCTION = FabricItemGroupBuilder.build(new Identifier(ExtinctionMod.ModID, "extinction"),
            ()-> new ItemStack(ItemInit.FOSSIL_CLEAN));
}
