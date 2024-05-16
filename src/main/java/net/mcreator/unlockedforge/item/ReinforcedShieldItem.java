
package net.mcreator.unlockedforge.item;

import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.Item;

public class ReinforcedShieldItem extends ShieldItem {
	public ReinforcedShieldItem() {
		super(new Item.Properties().durability(100).fireResistant());
	}
}
