package emeraldplus.modid.item.tools;

import emeraldplus.modid.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public class NetheraldShovel implements ToolMaterial {

    @Override
    public int getDurability() {
        return 4500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 1000.0F;
    }

    @Override
    public float getAttackDamage() {
        return 4.0F;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
    }

    @Override
    public int getEnchantability() {
        return 100;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.NETHER_EMERALD);
    }

}