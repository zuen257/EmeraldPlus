package emeraldplus.modid.item;

import emeraldplus.modid.EmeraldPlus;
import emeraldplus.modid.item.tools.NetheraldAxe;
import emeraldplus.modid.item.tools.NetheraldPickaxe;
import emeraldplus.modid.item.tools.NetheraldSword;
import emeraldplus.modid.item.tools.NetheraldShovel;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    // netherald ore
    public static final Item NETHER_EMERALD = registerItem("nether_emerald", new Item(new Item.Settings()));
    // sword
    public static final NetheraldSword netherald_sword = new NetheraldSword();
    public static final Item NETHERALD_SWORD = registerItem("netherald_sword", new SwordItem(netherald_sword, new Item.Settings()));
    // axe
    public static final NetheraldAxe netherald_axe = new NetheraldAxe();
    public static final Item NETHERALD_AXE = registerItem("netherald_axe", new AxeItem(netherald_axe, new Item.Settings()));
    // pickaxe
    public static final NetheraldPickaxe netherald_pickaxe = new NetheraldPickaxe();
    public static final Item NETHERALD_PICKAXE = registerItem("netherald_pickaxe", new PickaxeItem(netherald_pickaxe, new Item.Settings()));
    // shovel
    public static final NetheraldShovel netherald_shovel = new NetheraldShovel();
    public static final Item NETHERALD_SHOVEL = registerItem("netherald_shovel", new ShovelItem(netherald_shovel, new Item.Settings()));

    // armor
//    public static final Item NETHERALD_HELMET = registerItem("NETHERALD_helmet", new ArmorItem(ModArmorMaterials.NETHERALD, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(ModArmorMaterials.NETHERALD_DURABILITY_MULTIPLIER))));
//    public static final Item NETHERALD_CHESTPLATE = registerItem("NETHERALD_chestplate", new ArmorItem(ModArmorMaterials.NETHERALD, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(ModArmorMaterials.NETHERALD_DURABILITY_MULTIPLIER))));
//    public static final Item NETHERALD_LEGGINGS = registerItem("NETHERALD_leggings", new ArmorItem(ModArmorMaterials.NETHERALD, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(ModArmorMaterials.NETHERALD_DURABILITY_MULTIPLIER))));
//    public static final Item NETHERALD_BOOTS = registerItem("NETHERALD_boots", new ArmorItem(ModArmorMaterials.NETHERALD, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(ModArmorMaterials.NETHERALD_DURABILITY_MULTIPLIER))));

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
