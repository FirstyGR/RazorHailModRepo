
package net.mcreator.therazorhailmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.therazorhailmod.TherazorhailModModElements;

@TherazorhailModModElements.ModElement.Tag
public class SussyBakaSongItem extends TherazorhailModModElements.ModElement {
	@ObjectHolder("therazorhail_mod:sussy_baka_song")
	public static final Item block = null;
	public SussyBakaSongItem(TherazorhailModModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, TherazorhailModModElements.sounds.get(new ResourceLocation("therazorhail_mod:amogussussy")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("sussy_baka_song");
		}
	}
}
