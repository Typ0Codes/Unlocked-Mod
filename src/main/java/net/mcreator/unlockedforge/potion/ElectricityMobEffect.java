
package net.mcreator.unlockedforge.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.unlockedforge.procedures.ElectricityEffectStartedappliedProcedure;

public class ElectricityMobEffect extends MobEffect {
	public ElectricityMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711681);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ElectricityEffectStartedappliedProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
