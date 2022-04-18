package net.tornado.extinctionmod.client.renderer.entity;


import net.minecraft.client.render.entity.EntityRendererFactory;
import net.tornado.extinctionmod.client.model.entity.Dodo_Entity_Model;
import net.tornado.extinctionmod.client.model.entity.Kelenken_Entity_Model;
import net.tornado.extinctionmod.entity.Dodo_Entity;
import net.tornado.extinctionmod.entity.Kelenken_Entity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class Kelenken_Entity_Renderer extends GeoEntityRenderer<Kelenken_Entity> {

    @SuppressWarnings("unchecked")
    public Kelenken_Entity_Renderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new Kelenken_Entity_Model());
        this.shadowRadius = 0.25f;
    }

}