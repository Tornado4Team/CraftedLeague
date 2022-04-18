package net.tornado.extinctionmod.registry;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.tornado.extinctionmod.ExtinctionMod;
import net.tornado.extinctionmod.entity.Dodo_Entity;
import net.tornado.extinctionmod.entity.Kelenken_Entity;

public class EntityInit {
    public static final EntityType<Dodo_Entity> DODO_ENTITY = buildEntity(Dodo_Entity::new, Dodo_Entity.class, 0.45F, 1.0F,
            SpawnGroup.CREATURE);
    public static final EntityType<Kelenken_Entity> KELENKEN_ENTITY = buildEntity(Kelenken_Entity::new, Kelenken_Entity.class, 1.0F, 2.0F,
            SpawnGroup.CREATURE);

    public static <T extends Entity> EntityType<T> buildEntity(EntityType.EntityFactory<T> entity, Class<T> entityClass,
                                                               float width, float height, SpawnGroup group) {

            String name = entityClass.getSimpleName().toLowerCase();
            return ModEntityRegistryBuilder.<T>createBuilder(new Identifier(ExtinctionMod.ModID, name)).entity(entity).category(group).dimensions(EntityDimensions.changing(width, height)).build();


    }

}