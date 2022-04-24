package net.tornado.kaijumod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SpawnEggItem;
import net.tornado.kaijumod.KaijuMod;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tornado.kaijumod.registry.EntityInit;

public class ItemInit {
    public static final Item KAIJU_LOGO = registerItem("kaiju_logo", new Item(new FabricItemSettings()));
    public static final Item JAEGER_LOGO = registerItem("jaeger_logo", new Item(new FabricItemSettings()));

    public static final Item FOSSIL_CLEAN = registerItem("fossil_clean", new Item(new FabricItemSettings().group(ModItemGroup.KAIJU)));
    public static final Item FOSSIL_DIRTY = registerItem("fossil_dirty", new Item(new FabricItemSettings().group(ModItemGroup.KAIJU)));

    public static final Item DODO_SPAWN_EGG = new SpawnEggItem(EntityInit.DODO_ENTITY, 12895428, 11382189, new Item.Settings().group(ModItemGroup.KAIJU));

    public static final Item Brush = registerItem("brush", new Item(new FabricItemSettings().maxCount(1).maxDamage(16).group(ModItemGroup.JAEGER)));
    public static final Item PICK = registerItem("pick", new Item(new FabricItemSettings().maxCount(1).maxDamage(32).group(ModItemGroup.JAEGER)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(KaijuMod.ModID, name), item);

    }

    public static void registerModItems(){
        KaijuMod.LOGGER.info("Registering Mod Items for "+ KaijuMod.ModID);
    }

}
