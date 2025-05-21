package emeraldplus.modid.datagen;

import emeraldplus.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // no blocks
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.NETHER_EMERALD, Models.GENERATED);

        itemModelGenerator.register(ModItems.NETHERALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERALD_AXE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NETHERALD_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NETHERALD_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NETHERALD_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.NETHERALD_BOOTS));
    }

}
