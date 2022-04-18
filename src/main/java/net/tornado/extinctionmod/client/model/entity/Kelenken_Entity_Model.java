package net.tornado.extinctionmod.client.model.entity;


import net.minecraft.util.Identifier;
import net.tornado.extinctionmod.ExtinctionMod;
import net.tornado.extinctionmod.entity.Dodo_Entity;
import net.tornado.extinctionmod.entity.Kelenken_Entity;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class Kelenken_Entity_Model extends AnimatedTickingGeoModel<Kelenken_Entity> {

    @Override
    public Identifier getModelLocation(Kelenken_Entity object) {
        return new Identifier(ExtinctionMod.ModID, "geo/kelenken.geo.json");
    }

    @Override
    public Identifier getTextureLocation(Kelenken_Entity object) {
        return new Identifier(ExtinctionMod.ModID, "textures/entity/kelenken_entity.png");
    }

    @Override
    public Identifier getAnimationFileLocation(Kelenken_Entity animatable) {
        return new Identifier(ExtinctionMod.ModID, "animations/kelenken.animation.json");
    }

}