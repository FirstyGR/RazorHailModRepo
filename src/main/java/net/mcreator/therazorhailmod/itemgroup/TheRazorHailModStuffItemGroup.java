
package net.mcreator.therazorhailmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.therazorhailmod.block.RazorHeadBlock;
import net.mcreator.therazorhailmod.TherazorhailModModElements;

@TherazorhailModModElements.ModElement.Tag
public class TheRazorHailModStuffItemGroup extends TherazorhailModModElements.ModElement {
	public TheRazorHailModStuffItemGroup(TherazorhailModModElements instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabthe_razor_hail_mod_stuff") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RazorHeadBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
