
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unlockedforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.unlockedforge.item.BeeHammerItem;
import net.mcreator.unlockedforge.UnlockedForgeMod;

public class UnlockedForgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UnlockedForgeMod.MODID);
	public static final RegistryObject<Item> BEE_HAMMER = REGISTRY.register("bee_hammer", () -> new BeeHammerItem());
	// Start of user code block custom items
	// End of user code block custom items
}
