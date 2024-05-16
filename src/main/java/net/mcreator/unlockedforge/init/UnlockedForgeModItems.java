
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unlockedforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

import net.mcreator.unlockedforge.item.WardenBowItem;
import net.mcreator.unlockedforge.item.ShadowAxeItem;
import net.mcreator.unlockedforge.item.ScytheItem;
import net.mcreator.unlockedforge.item.ReinforcedShieldItem;
import net.mcreator.unlockedforge.item.PlayerheartItem;
import net.mcreator.unlockedforge.item.LightningSwordItem;
import net.mcreator.unlockedforge.item.HasteSwordItem;
import net.mcreator.unlockedforge.item.BorderExpansionRuneItem;
import net.mcreator.unlockedforge.item.BeeHammerItem;
import net.mcreator.unlockedforge.UnlockedForgeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UnlockedForgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UnlockedForgeMod.MODID);
	public static final RegistryObject<Item> BEE_HAMMER = REGISTRY.register("bee_hammer", () -> new BeeHammerItem());
	public static final RegistryObject<Item> WARDEN_BOW = REGISTRY.register("warden_bow", () -> new WardenBowItem());
	public static final RegistryObject<Item> HASTE_SWORD = REGISTRY.register("haste_sword", () -> new HasteSwordItem());
	public static final RegistryObject<Item> LIGHTNING_SWORD = REGISTRY.register("lightning_sword", () -> new LightningSwordItem());
	public static final RegistryObject<Item> SHADOW_AXE = REGISTRY.register("shadow_axe", () -> new ShadowAxeItem());
	public static final RegistryObject<Item> REINFORCED_SHIELD = REGISTRY.register("reinforced_shield", () -> new ReinforcedShieldItem());
	public static final RegistryObject<Item> SCYTHE = REGISTRY.register("scythe", () -> new ScytheItem());
	public static final RegistryObject<Item> BORDER_EXPANSION_RUNE = REGISTRY.register("border_expansion_rune", () -> new BorderExpansionRuneItem());
	public static final RegistryObject<Item> PLAYERHEART = REGISTRY.register("playerheart", () -> new PlayerheartItem());

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(REINFORCED_SHIELD.get(), new ResourceLocation("blocking"), ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
		});
	}
}
