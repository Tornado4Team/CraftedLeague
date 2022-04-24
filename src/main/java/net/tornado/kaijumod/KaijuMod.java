package net.tornado.kaijumod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tornado.kaijumod.block.BlockInit;
import net.tornado.kaijumod.block.blockentity.BoxBlockEntity;
import net.tornado.kaijumod.block.machines.BoxBlock;
import net.tornado.kaijumod.item.ItemInit;
import net.tornado.kaijumod.item.ModItemGroup;
import net.tornado.kaijumod.recipe.ModRecipe;
import net.tornado.kaijumod.registry.EntityInit;
import net.tornado.kaijumod.screen.BoxScreenHandler;
import net.tornado.kaijumod.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

import static net.tornado.kaijumod.item.ItemInit.DODO_SPAWN_EGG;


public class KaijuMod implements ModInitializer {

	public static final String ModID = "kaijumod";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static final Block BOX_BLOCK;
	public static final BlockItem BOX_BLOCK_ITEM;
	public static final BlockEntityType<BoxBlockEntity> BOX_BLOCK_ENTITY;
	public static final Identifier BOX = new Identifier(ModID, "box_block");
	public static final ScreenHandlerType<BoxScreenHandler> BOX_SCREEN_HANDLER;


	static {
		BOX_BLOCK = Registry.register(Registry.BLOCK, BOX, new BoxBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
		BOX_BLOCK_ITEM = Registry.register(Registry.ITEM, BOX, new BlockItem(BOX_BLOCK, new Item.Settings().group(ModItemGroup.JAEGER)));
		BOX_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, BOX, FabricBlockEntityTypeBuilder.create(BoxBlockEntity::new, BOX_BLOCK).build(null));
		BOX_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(BOX, BoxScreenHandler::new);

	}


	@Override
	public void onInitialize() {

		ModWorldGen.generateModWorldGen();
		ItemInit.registerModItems();
		BlockInit.registerModBlocks();
		ModRecipe.register();


		Registry.register(Registry.ITEM, new Identifier(KaijuMod.ModID, "dodo_spawn_egg"), DODO_SPAWN_EGG);

		GeckoLib.initialize();
		new EntityInit();
		FabricDefaultAttributeRegistry.register(EntityInit.DODO_ENTITY, EntityUtils.createMobAttributes(0.25D, 4.0D));
		LOGGER.info("Hello Fabric world!");
	}



}
