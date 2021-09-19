
package net.mcreator.therazorhailmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.therazorhailmod.TherazorhailModModElements;

@TherazorhailModModElements.ModElement.Tag
public class ModTutorialItem extends TherazorhailModModElements.ModElement {
	@ObjectHolder("therazorhail_mod:mod_tutorial")
	public static final Item block = null;
	public ModTutorialItem(TherazorhailModModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, TherazorhailModModElements.sounds.get(new ResourceLocation("therazorhail_mod:modtutorialdisc")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("mod_tutorial");
		}
	}
}
