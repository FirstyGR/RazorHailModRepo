package net.mcreator.therazorhailmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;

import net.mcreator.therazorhailmod.TherazorhailModModVariables;
import net.mcreator.therazorhailmod.TherazorhailModMod;

import java.util.Map;
import java.util.HashMap;

public class DrunkPointCodeProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityEndSleep(PlayerWakeUpEvent event) {
			Entity entity = event.getEntity();
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency entity for procedure DrunkPointCode!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TherazorhailModModVariables.PlayerVariables())).HowDruckIsThePlayer) > 0)) {
			{
				double _setval = (double) (((entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TherazorhailModModVariables.PlayerVariables())).HowDruckIsThePlayer) - 1);
				entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HowDruckIsThePlayer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((((entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TherazorhailModModVariables.PlayerVariables())).HowDruckIsThePlayer) < 0)) {
			{
				double _setval = (double) 0;
				entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HowDruckIsThePlayer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
