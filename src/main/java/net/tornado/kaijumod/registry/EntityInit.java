package net.tornado.kaijumod.registry;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.tornado.kaijumod.KaijuMod;
import net.tornado.kaijumod.entity.Dodo_Entity;

public class EntityInit {
    public static final EntityType<Dodo_Entity> DODO_ENTITY = buildEntity(Dodo_Entity::new, Dodo_Entity.class, 0.45F, 1.0F,
            SpawnGroup.CREATURE);

    public static <T extends Entity> EntityType<T> buildEntity(EntityType.EntityFactory<T> entity, Class<T> entityClass,
                                                               float width, float height, SpawnGroup group) {

            String name = entityClass.getSimpleName().toLowerCase();
            return ModEntityRegistryBuilder.<T>createBuilder(new Identifier(KaijuMod.ModID, name)).entity(entity).category(group).dimensions(EntityDimensions.changing(width, height)).build();


    }

}