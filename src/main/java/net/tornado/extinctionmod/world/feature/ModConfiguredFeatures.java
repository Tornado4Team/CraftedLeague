package net.tornado.extinctionmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.tornado.extinctionmod.block.BlockInit;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_FOSSIL_BLOCK = List.of(
            OreFeatureConfig.createTarget((OreConfiguredFeatures.STONE_ORE_REPLACEABLES), BlockInit.FOSSIL_CENOZOIC_BLOCK.getDefaultState()),
            OreFeatureConfig.createTarget((OreConfiguredFeatures.STONE_ORE_REPLACEABLES), BlockInit.FOSSIL_MESOZOIC_BLOCK.getDefaultState()),
            OreFeatureConfig.createTarget((OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES), BlockInit.FOSSIL_PALEOZOIC_BLOCK.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> FOSSIL_BLOCK =
    ConfiguredFeatures.register("fossil_block", Feature.ORE, new OreFeatureConfig(OVERWORLD_FOSSIL_BLOCK, 9));

}
