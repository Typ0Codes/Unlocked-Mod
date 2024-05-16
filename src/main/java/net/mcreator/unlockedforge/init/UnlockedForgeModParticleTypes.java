
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unlockedforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.unlockedforge.UnlockedForgeMod;

public class UnlockedForgeModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, UnlockedForgeMod.MODID);
	public static final RegistryObject<SimpleParticleType> ELECTRICITYPART = REGISTRY.register("electricitypart", () -> new SimpleParticleType(false));
}
