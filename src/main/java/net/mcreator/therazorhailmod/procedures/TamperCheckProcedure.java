package net.mcreator.therazorhailmod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.therazorhailmod.TherazorhailModModVariables;
import net.mcreator.therazorhailmod.TherazorhailModMod;

import java.util.function.Supplier;
import java.util.Map;

public class TamperCheckProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency entity for procedure TamperCheck!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency world for procedure TamperCheck!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (0))) == 3)) {
			TherazorhailModModVariables.MapVariables.get(world).craftCheck = (boolean) (true);
			TherazorhailModModVariables.MapVariables.get(world).syncData(world);
		} else {
			TherazorhailModModVariables.MapVariables.get(world).craftCheck = (boolean) (false);
			TherazorhailModModVariables.MapVariables.get(world).syncData(world);
		}
		if (((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (0))) > 3)) {
			TherazorhailModModVariables.MapVariables.get(world).craftCheck = (boolean) (false);
			TherazorhailModModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
