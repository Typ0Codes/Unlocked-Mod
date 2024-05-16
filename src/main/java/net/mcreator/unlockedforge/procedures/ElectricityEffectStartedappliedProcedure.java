package net.mcreator.unlockedforge.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.unlockedforge.init.UnlockedForgeModParticleTypes;

public class ElectricityEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (UnlockedForgeModParticleTypes.ELECTRICITYPART.get()), x, y, z, 1, 3, 3, 3, 0.5);
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(30);
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 4));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, false, false));
		entity.setNoGravity(false);
	}
}
