package net.tornado.kaijumod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> FOSSIL_CENOZOIC_BLOCK_PLACED = PlacedFeatures.register("fossil_cenozoic_block_placed",
            ModConfiguredFeatures.FOSSIL_CENOZOIC_BLOCK, ModOreFeatures.modifiersWithCount(20, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
   }
