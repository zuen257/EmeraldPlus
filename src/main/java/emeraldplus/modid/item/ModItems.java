package emeraldplus.modid.item;

import emeraldplus.modid.EmeraldPlus;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item NETHER_EMERALD = registerItem("nether_emerald", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(EmeraldPlus.MOD_ID, name), item);
   }

    public static void registerModItems() {
        EmeraldPlus.LOGGER.info("Registering Mod Items for " + EmeraldPlus.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {entries.add(NETHER_EMERALD);});
    }
}
