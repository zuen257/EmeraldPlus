package emeraldplus.modid.item;

import emeraldplus.modid.EmeraldPlus;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NETHERALD_ITEMS_GROUPS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(EmeraldPlus.MOD_ID, "netherald_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.NETHER_EMERALD))
                    .displayName(Text.translatable("itemgroup.emerald-plus.netherald_items"))
                    .entries((displayContext, entries) -> {

                        // remember to add entry (new items) here
                        entries.add(ModItems.NETHER_EMERALD);
                        entries.add(ModItems.NETHERALD_SWORD);
                        entries.add(ModItems.NETHERALD_AXE);
                        entries.add(ModItems.NETHERALD_PICKAXE);
                        entries.add(ModItems.NETHERALD_SHOVEL);
                    })
                    .build());

    public static void registerItemGroups() {
        EmeraldPlus.LOGGER.info("Registering Nether_Emerald Item Group");
    }
}
