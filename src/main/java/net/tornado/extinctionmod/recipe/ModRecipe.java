package net.tornado.extinctionmod.recipe;


import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tornado.extinctionmod.ExtinctionMod;

public class ModRecipe {
    public static void register() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(ExtinctionMod.ModID, BoxRecipe.Serializer.ID),
                BoxRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(ExtinctionMod.ModID, BoxRecipe.Type.ID),
                BoxRecipe.Type.INSTANCE);
    }
}