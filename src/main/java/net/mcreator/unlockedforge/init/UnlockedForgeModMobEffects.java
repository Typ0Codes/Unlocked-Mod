
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unlockedforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.unlockedforge.potion.ElectricityMobEffect;
import net.mcreator.unlockedforge.UnlockedForgeMod;

public class UnlockedForgeModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, UnlockedForgeMod.MODID);
	public static final RegistryObject<MobEffect> ELECTRICITY = REGISTRY.register("electricity", () -> new ElectricityMobEffect());
}
