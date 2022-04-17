package net.tornado.extinctionmod;

import com.eliotlash.mclib.math.functions.classic.Mod;
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
import net.minecraft.item.ItemGroup;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tornado.extinctionmod.block.BlockInit;
import net.tornado.extinctionmod.block.blockentity.BoxBlockEntity;
import net.tornado.extinctionmod.block.machines.BoxBlock;
import net.tornado.extinctionmod.item.ItemInit;
import net.tornado.extinctionmod.item.ModItemGroup;
import net.tornado.extinctionmod.recipe.ModRecipe;
import net.tornado.extinctionmod.registry.EntityInit;
import net.tornado.extinctionmod.screen.BoxScreenHandler;
import net.tornado.extinctionmod.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

import static net.tornado.extinctionmod.item.ItemInit.DODO_SPAWN_EGG;


public class ExtinctionMod implements ModInitializer {

	public static final String ModID = "extinctionmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static final Block BOX_BLOCK;
	public static final BlockItem BOX_BLOCK_ITEM;
	public static final BlockEntityType<BoxBlockEntity> BOX_BLOCK_ENTITY;
	public static final Identifier BOX = new Identifier(ModID, "box_block");
	public static final ScreenHandlerType<BoxScreenHandler> BOX_SCREEN_HANDLER;


	static {
		BOX_BLOCK = Registry.register(Registry.BLOCK, BOX, new BoxBlock(FabricBlockSettings.copyOf(Blocks.CHEST)));
		BOX_BLOCK_ITEM = Registry.register(Registry.ITEM, BOX, new BlockItem(BOX_BLOCK, new Item.Settings().group(ModItemGroup.EXTINCTION)));
		BOX_BLOCK_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, BOX, FabricBlockEntityTypeBuilder.create(BoxBlockEntity::new, BOX_BLOCK).build(null));
		BOX_SCREEN_HANDLER = ScreenHandlerRegistry.registerSimple(BOX, BoxScreenHandler::new);

	}


	@Override
	public void onInitialize() {

		ModWorldGen.generateModWorldGen();
		ItemInit.registerModItems();
		BlockInit.registerModBlocks();
		ModRecipe.register();


		Registry.register(Registry.ITEM, new Identifier(ExtinctionMod.ModID, "dodo_spawn_egg"), DODO_SPAWN_EGG);

		GeckoLib.initialize();
		new EntityInit();
		FabricDefaultAttributeRegistry.register(EntityInit.DODO_ENTITY, EntityUtils.createMobAttributes(0.25D, 4.0D));
		LOGGER.info("Hello Fabric world!");
	}



}
