package net.tornado.kaijumod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.tornado.kaijumod.KaijuMod;

public class ModItemGroup {
    public static final ItemGroup KAIJU = FabricItemGroupBuilder.build(new Identifier(KaijuMod.ModID, "kaiju"), ()-> new ItemStack(ItemInit.KAIJU_LOGO));
    public static final ItemGroup JAEGER = FabricItemGroupBuilder.build(new Identifier(KaijuMod.ModID, "jaeger"), ()-> new ItemStack(ItemInit.JAEGER_LOGO));
}
