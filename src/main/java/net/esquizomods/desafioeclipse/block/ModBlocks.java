package net.esquizomods.desafioeclipse.block;

import net.esquizomods.desafioeclipse.DesafioEclipse;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import javax.naming.Name;
import javax.xml.namespace.QName;

public class ModBlocks {
    public static final Block FIBRA_DE_CARBONO_COMPACTADA = registerBlock("fibra_de_carbono_compactada",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.BASALT)));

    public static final Block BLOQUE_ANCESTRAL = registerBlock("bloque_ancestral",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool()));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(DesafioEclipse.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(DesafioEclipse.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        DesafioEclipse.LOGGER.info("Registrando ModBlocks para " + DesafioEclipse.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.FIBRA_DE_CARBONO_COMPACTADA);
            entries.add(ModBlocks.BLOQUE_ANCESTRAL);
        });
    }
}
