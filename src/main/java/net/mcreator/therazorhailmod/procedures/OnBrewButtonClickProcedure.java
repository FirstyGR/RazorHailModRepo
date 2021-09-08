package net.mcreator.therazorhailmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.therazorhailmod.item.BeerItem;
import net.mcreator.therazorhailmod.TherazorhailModModVariables;
import net.mcreator.therazorhailmod.TherazorhailModMod;

import java.util.function.Supplier;
import java.util.Map;

public class OnBrewButtonClickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency entity for procedure OnBrewButtonClick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency world for procedure OnBrewButtonClick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		boolean craftcheck = false;
		if ((TherazorhailModModVariables.MapVariables.get(world).craftCheck == (true))) {
			if (entity instanceof PlayerEntity) {
				Container _current = ((PlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						ItemStack _setstack = new ItemStack(BeerItem.block);
						_setstack.setCount((int) 1);
						((Slot) ((Map) invobj).get((int) (1))).putStack(_setstack);
						_current.detectAndSendChanges();
					}
				}
			}
			if (entity instanceof ServerPlayerEntity) {
				Container _current = ((ServerPlayerEntity) entity).openContainer;
				if (_current instanceof Supplier) {
					Object invobj = ((Supplier) _current).get();
					if (invobj instanceof Map) {
						((Slot) ((Map) invobj).get((int) (0))).putStack(ItemStack.EMPTY);
						_current.detectAndSendChanges();
					}
				}
			}
			TherazorhailModModVariables.MapVariables.get(world).craftCheck = (boolean) (false);
			TherazorhailModModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
