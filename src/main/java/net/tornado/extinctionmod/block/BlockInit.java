package net.tornado.extinctionmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tornado.extinctionmod.ExtinctionMod;
import net.tornado.extinctionmod.item.ModItemGroup;

public class BlockInit {

    public static final Block FOSSIL_BLOCK = registerBlock( "fossil_block", new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ModItemGroup.EXTINCTION);
    public static final Block MACHINE_BLOCK = registerBlock( "machine_block", new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.EXTINCTION);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(ExtinctionMod.ModID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(ExtinctionMod.ModID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        ExtinctionMod.LOGGER.info("Registering ModBlocks for "+ExtinctionMod.ModID);
    }
}
