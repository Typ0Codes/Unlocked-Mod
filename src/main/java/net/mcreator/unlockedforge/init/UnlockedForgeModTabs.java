
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.unlockedforge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.unlockedforge.UnlockedForgeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UnlockedForgeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UnlockedForgeMod.MODID);
	public static final RegistryObject<CreativeModeTab> UNLOCKED = REGISTRY.register("unlocked",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.unlocked_forge.unlocked")).icon(() -> new ItemStack(Items.TOTEM_OF_UNDYING)).displayItems((parameters, tabData) -> {
				tabData.accept(UnlockedForgeModItems.WARDEN_BOW.get());
				tabData.accept(UnlockedForgeModItems.BORDER_EXPANSION_RUNE.get());
				tabData.accept(UnlockedForgeModItems.PLAYERHEART.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(UnlockedForgeModItems.BEE_HAMMER.get());
			tabData.accept(UnlockedForgeModItems.HASTE_SWORD.get());
			tabData.accept(UnlockedForgeModItems.LIGHTNING_SWORD.get());
			tabData.accept(UnlockedForgeModItems.SHADOW_AXE.get());
			tabData.accept(UnlockedForgeModItems.REINFORCED_SHIELD.get());
			tabData.accept(UnlockedForgeModItems.SCYTHE.get());
		}
	}
}
