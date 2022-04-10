package net.tornado.extinctionmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tornado.extinctionmod.block.BlockInit;
import net.tornado.extinctionmod.item.ItemInit;
import net.tornado.extinctionmod.registry.*;
import net.tornado.extinctionmod.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

import static net.tornado.extinctionmod.item.ItemInit.DODO_SPAWN_EGG;


public class ExtinctionMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String ModID = "extinctionmod";

	@Override
	public void onInitialize() {

		ModWorldGen.generateModWorldGen();

		ItemInit.registerModItems();
		Registry.register(Registry.ITEM, new Identifier(ExtinctionMod.ModID, "dodo_spawn_egg"), DODO_SPAWN_EGG);
		BlockInit.registerModBlocks();

		GeckoLib.initialize();
		new EntityInit();
		FabricDefaultAttributeRegistry.register(EntityInit.DODO_ENTITY, EntityUtils.createMobAttributes(0.25D, 4.0D));
		LOGGER.info("Hello Fabric world!");
	}


}
