package net.tornado.extinctionmod.registry;


import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityType.EntityFactory;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntityRegistryBuilder<E extends Entity> {
    private static Identifier name;
    private EntityFactory<E> entityFactory;
    private SpawnGroup category;
    private int trackingDistance;
    private int updateIntervalTicks;
    private boolean alwaysUpdateVelocity;
    private int primaryColor;
    private int secondaryColor;
    private boolean hasEgg;
    private boolean fireImmune;
    private EntityDimensions dimensions;

    public ModEntityRegistryBuilder() {
    }

    public static <E extends Entity> ModEntityRegistryBuilder<E> createBuilder(Identifier nameIn) {
        name = nameIn;
        return new ModEntityRegistryBuilder<>();
    }

    public ModEntityRegistryBuilder<E> entity(EntityFactory<E> entityFactory) {
        this.entityFactory = entityFactory;
        return this;
    }

    public ModEntityRegistryBuilder<E> category(SpawnGroup category) {
        this.category = category;
        return this;
    }

    public ModEntityRegistryBuilder<E> tracker(int trackingDistance, int updateIntervalTicks,
                                            boolean alwaysUpdateVelocity) {
        this.trackingDistance = trackingDistance;
        this.updateIntervalTicks = updateIntervalTicks;
        this.alwaysUpdateVelocity = alwaysUpdateVelocity;
        return this;
    }

    public ModEntityRegistryBuilder<E> egg(int primaryColor, int secondaryColor) {
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        return this;
    }

    public ModEntityRegistryBuilder<E> hasEgg(boolean hasEgg) {
        this.hasEgg = hasEgg;
        return this;
    }

    public ModEntityRegistryBuilder<E> makeFireImmune() {
        this.fireImmune = true;
        return this;
    }

    public ModEntityRegistryBuilder<E> dimensions(EntityDimensions size) {
        this.dimensions = size;
        return this;
    }

    @SuppressWarnings({ "unchecked" })
    public EntityType<E> build() {
        EntityType.Builder<E> entityBuilder = EntityType.Builder.create(this.entityFactory, this.category)
                .setDimensions(this.dimensions.width, this.dimensions.height);
        if (fireImmune) {
            entityBuilder.makeFireImmune();
        }
        if (this.alwaysUpdateVelocity && this.updateIntervalTicks != 0 & this.trackingDistance != 0) {
            FabricEntityTypeBuilder.create(this.category, this.entityFactory).dimensions(this.dimensions)
                    .trackRangeBlocks(this.trackingDistance).trackedUpdateRate(this.updateIntervalTicks)
                    .forceTrackedVelocityUpdates(this.alwaysUpdateVelocity).build();
        }

        EntityType<E> entityType = Registry.register(Registry.ENTITY_TYPE, name, entityBuilder.build(name.getPath()));



        return entityType;
    }
}