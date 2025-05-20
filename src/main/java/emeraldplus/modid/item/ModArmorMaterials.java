//package emeraldplus.modid.item;
//
//import emeraldplus.modid.EmeraldPlus;
//import net.minecraft.item.ArmorItem;
//import net.minecraft.item.ArmorMaterial;
//import net.minecraft.item.ArmorMaterials;
//import net.minecraft.network.packet.CustomPayload;
//import net.minecraft.recipe.Ingredient;
//import net.minecraft.registry.Registries;
//import net.minecraft.registry.Registry;
//import net.minecraft.registry.entry.RegistryEntry;
//import net.minecraft.sound.SoundEvent;
//import net.minecraft.sound.SoundEvents;
//import net.minecraft.util.Identifier;
//
//import java.util.List;
//import java.util.Map;
//import java.util.function.Supplier;
//
//import static emeraldplus.modid.item.ModItems.NETHER_EMERALD;
//
//public class ModArmorMaterials {
//
//    public static final int NETHERALD_DURABILITY_MULTIPLIER = 15;
//    public static final RegistryEntry<ArmorMaterial> NETHERALD = registerMaterial("netherald",
//            // Defense (protection) point values for each armor piece.
//            Map.of(
//                    ArmorItem.Type.HELMET, 4,
//                    ArmorItem.Type.CHESTPLATE, 8,
//                    ArmorItem.Type.LEGGINGS, 5,
//                    ArmorItem.Type.BOOTS, 3
//            ),
//            // Enchantability. For reference, leather has 15, iron has 9, and diamond has 10.
//            13,
//            // The sound played when the armor is equipped.
//            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
//            // The ingredient(s) used to repair the armor.
//            () -> Ingredient.ofItems(NETHER_EMERALD),
//            // List of Armor ID
//            List.of(new ArmorMaterial.Layer(Identifier.of(EmeraldPlus.MOD_ID, "netherald"))), 0, 0));
//
//    public static RegistryEntry<ArmorMaterial> registerMaterial(String name, Supplier<Ingredient> material) {
//        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(EmeraldPlus.MOD_ID, name), material.get());
//    }
//
//}
//
