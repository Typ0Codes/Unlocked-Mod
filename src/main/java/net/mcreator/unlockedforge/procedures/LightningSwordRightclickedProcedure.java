package net.mcreator.unlockedforge.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.unlockedforge.init.UnlockedForgeModMobEffects;

public class LightningSwordRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(UnlockedForgeModMobEffects.ELECTRICITY.get(), 200, 1));
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 300);
	}
}
