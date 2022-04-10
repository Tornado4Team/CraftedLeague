package net.tornado.extinctionmod.client.renderer.entity;


import net.minecraft.client.render.entity.EntityRendererFactory;
import net.tornado.extinctionmod.client.model.entity.Dodo_Entity_Model;
import net.tornado.extinctionmod.entity.Dodo_Entity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class Dodo_Entity_Renderer extends GeoEntityRenderer<Dodo_Entity> {

    @SuppressWarnings("unchecked")
    public Dodo_Entity_Renderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new Dodo_Entity_Model());
        this.shadowRadius = 0.25f;
    }

}