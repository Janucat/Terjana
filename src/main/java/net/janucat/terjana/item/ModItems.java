package net.janucat.terjana.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.janucat.terjana.Terjana;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {

    public static final Item FLOUR = registerItem("flour", new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Terjana.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for" + Terjana.MOD_ID);
    }
}
