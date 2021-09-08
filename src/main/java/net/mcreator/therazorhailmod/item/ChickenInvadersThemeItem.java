
package net.mcreator.therazorhailmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.therazorhailmod.itemgroup.TheRazorHailModStuffItemGroup;
import net.mcreator.therazorhailmod.TherazorhailModModElements;

@TherazorhailModModElements.ModElement.Tag
public class ChickenInvadersThemeItem extends TherazorhailModModElements.ModElement {
	@ObjectHolder("therazorhail_mod:chicken_invaders_theme")
	public static final Item block = null;
	public ChickenInvadersThemeItem(TherazorhailModModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, TherazorhailModModElements.sounds.get(new ResourceLocation("therazorhail_mod:chicken_invaders_theme")),
					new Item.Properties().group(TheRazorHailModStuffItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("chicken_invaders_theme");
		}
	}
}
