package net.tornado.kaijumod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.tornado.kaijumod.block.BlockInit;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_FOSSIL_CENOZOIC_BLOCK = List.of(
            OreFeatureConfig.createTarget((OreConfiguredFeatures.BASE_STONE_OVERWORLD), BlockInit.FOSSIL_CENOZOIC_BLOCK.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> FOSSIL_CENOZOIC_BLOCK =
    ConfiguredFeatures.register("fossil_cenozoic_block", Feature.ORE, new OreFeatureConfig(OVERWORLD_FOSSIL_CENOZOIC_BLOCK, 9));

}
