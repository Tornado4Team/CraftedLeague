package net.tornado.kaijumod.recipe;


import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tornado.kaijumod.KaijuMod;

public class ModRecipe {
    public static void register() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(KaijuMod.ModID, BoxRecipe.Serializer.ID),
                BoxRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(KaijuMod.ModID, BoxRecipe.Type.ID),
                BoxRecipe.Type.INSTANCE);
    }
}