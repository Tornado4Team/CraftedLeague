package net.tornado.kaijumod;

import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.passive.AnimalEntity;

public class EntityUtils {

    public static DefaultAttributeContainer.Builder createGenericEntityAttributes() {
        return PathAwareEntity.createMobAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.8D)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0D);
    }


    public static DefaultAttributeContainer.Builder createMobAttributes(double speed, double health) {
        return AnimalEntity.createMobAttributes().add(EntityAttributes.GENERIC_MOVEMENT_SPEED, speed)
            .add(EntityAttributes.GENERIC_MAX_HEALTH, health);
    }
}