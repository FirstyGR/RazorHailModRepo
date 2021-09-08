
package net.mcreator.therazorhailmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.therazorhailmod.procedures.SandvichFoodEatenProcedure;
import net.mcreator.therazorhailmod.itemgroup.TheRazorHailModStuffItemGroup;
import net.mcreator.therazorhailmod.TherazorhailModModElements;

import java.util.Map;
import java.util.HashMap;

@TherazorhailModModElements.ModElement.Tag
public class SandvichItem extends TherazorhailModModElements.ModElement {
	@ObjectHolder("therazorhail_mod:sandvich")
	public static final Item block = null;
	public SandvichItem(TherazorhailModModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(TheRazorHailModStuffItemGroup.tab).maxStackSize(1).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(20).saturation(5f).meat().build()));
			setRegistryName("sandvich");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 86;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("x", x);
				$_dependencies.put("y", y);
				$_dependencies.put("z", z);
				$_dependencies.put("world", world);
				SandvichFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
