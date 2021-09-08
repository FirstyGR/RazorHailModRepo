package net.mcreator.therazorhailmod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.therazorhailmod.TherazorhailModModVariables;
import net.mcreator.therazorhailmod.TherazorhailModMod;

import java.util.Map;

public class BeerFoodEatenProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency entity for procedure BeerFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TherazorhailModModVariables.PlayerVariables())).HowDruckIsThePlayer) >= 3)) {
			{
				double _setval = (double) 0;
				entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HowDruckIsThePlayer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 1300, (int) 1, (false), (true)));
		} else {
			{
				double _setval = (double) (((entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TherazorhailModModVariables.PlayerVariables())).HowDruckIsThePlayer) + 1);
				entity.getCapability(TherazorhailModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.HowDruckIsThePlayer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
