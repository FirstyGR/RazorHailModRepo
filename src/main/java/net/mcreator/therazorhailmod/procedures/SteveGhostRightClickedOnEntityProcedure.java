package net.mcreator.therazorhailmod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.therazorhailmod.TherazorhailModMod;

import java.util.Map;

public class SteveGhostRightClickedOnEntityProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TherazorhailModMod.LOGGER.warn("Failed to load dependency entity for procedure SteveGhostRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"say Oh traveller, have you come to explore this miserable world or be trapped within it? (this and following conversations will be in a custom gui, this is an early version.)");
			}
		}
	}
}
