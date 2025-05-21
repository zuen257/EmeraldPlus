package emeraldplus.modid.item;

import emeraldplus.modid.EmeraldPlus;
//import emeraldplus.modid.item.tools.NetheraldAxe;
//import emeraldplus.modid.item.tools.NetheraldPickaxe;
//import emeraldplus.modid.item.tools.NetheraldSword;
//import emeraldplus.modid.item.tools.NetheraldShovel;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // netherald ore
    public static final Item NETHER_EMERALD = registerItem("nether_emerald", new Item(new Item.Settings()));
    // sword
    public static final Item NETHERALD_SWORD = registerItem("netherald_sword", new SwordItem(ModToolMaterials.NETHERALD, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.NETHERALD, 4, -2.4F))));
    // axe
    public static final Item NETHERALD_AXE = registerItem("netherald_axe", new AxeItem(ModToolMaterials.NETHERALD, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.NETHERALD, 7, -3.2F))));

    // pickaxe
    public static final Item NETHERALD_PICKAXE = registerItem("netherald_pickaxe", new PickaxeItem(ModToolMaterials.NETHERALD, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.NETHERALD, 2, -2.8F))));

    // shovel
    public static final Item NETHERALD_SHOVEL = registerItem("netherald_shovel", new ShovelItem(ModToolMaterials.NETHERALD, new Item.Settings()
            .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.NETHERALD, 2, -3.0F))));

    // armor

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EmeraldPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EmeraldPlus.LOGGER.info("Registering Mod Items for " + EmeraldPlus.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(NETHER_EMERALD);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(NETHERALD_AXE);
            entries.add(NETHERALD_PICKAXE);
            entries.add(NETHERALD_SHOVEL);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register( entries -> {
            entries.add(NETHERALD_SWORD);
            entries.add(NETHERALD_AXE);
        });

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.)
    }
}
