package net.tornado.extinctionmod.client.model.entity;


import net.minecraft.util.Identifier;
import net.tornado.extinctionmod.ExtinctionMod;
import net.tornado.extinctionmod.entity.Dodo_Entity;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class Dodo_Entity_Model extends AnimatedTickingGeoModel<Dodo_Entity> {

    @Override
    public Identifier getModelLocation(Dodo_Entity object) {
        return new Identifier(ExtinctionMod.ModID, "geo/dodo.geo.json");
    }

    @Override
    public Identifier getTextureLocation(Dodo_Entity object) {
        return new Identifier(ExtinctionMod.ModID, "textures/entity/dodo_entity.png");
    }

    @Override
    public Identifier getAnimationFileLocation(Dodo_Entity animatable) {
        return new Identifier(ExtinctionMod.ModID, "animations/dodo.animation.json");
    }

}