package net.esquizomods.desafioeclipse.item;

import net.esquizomods.desafioeclipse.DesafioEclipse;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItem {
    public static final Item CHIP = registerItem("chip", new Item(new Item.Settings()));
    public static final Item FRUTA_ANCESTRAL = registerItem("fruta_ancestral", new Item(new Item.Settings()));
    public static final Item FIBRA_CARBONO = registerItem("fibra_carbono", new Item(new Item.Settings()));
    public static final Item MATE = registerItem("mate", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DesafioEclipse.MOD_ID, name), item);
    }

    public static void registerModItems() {
        DesafioEclipse.LOGGER.info("Registrando Items del mod para " + DesafioEclipse.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(CHIP);
            entries.add(FRUTA_ANCESTRAL);
            entries.add(FIBRA_CARBONO);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(MATE);
        });
    }
}
