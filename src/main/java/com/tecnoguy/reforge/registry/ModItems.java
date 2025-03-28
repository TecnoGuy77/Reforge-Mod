package com.tecnoguy.reforge.registry;

import com.tecnoguy.reforge.Reforge;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static Item registry(String itemID, Function<Item.Settings, Item> itemFactory, Item.Settings settings){
        RegistryKey<Item> itemRegistryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Reforge.MOD_ID,itemID));
        Item item = itemFactory.apply(settings.registryKey(itemRegistryKey));
        Registry.register(Registries.ITEM,itemID,item);

        return item;
    }
}
