package net.tornado.extinctionmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SpawnEggItem;
import net.tornado.extinctionmod.ExtinctionMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tornado.extinctionmod.registry.EntityInit;

public class ItemInit {
    public static final Item PICK = registerItem("pick", new Item(new FabricItemSettings().group(ModItemGroup.EXTINCTION)));

    public static final Item DODO_SPAWN_EGG = new SpawnEggItem(EntityInit.DODO_ENTITY, 12895428, 11382189, new Item.Settings().group(ModItemGroup.EXTINCTION));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(ExtinctionMod.ModID, name), item);

    }

    public static void registerModItems(){
        ExtinctionMod.LOGGER.info("Registering Mod Items for "+ ExtinctionMod.ModID);
    }

}
