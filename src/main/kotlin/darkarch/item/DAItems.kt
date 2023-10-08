package darkarch.item

import darkarch.DarkArch
import io.wispforest.owo.itemgroup.OwoItemSettings
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item

class DAItems {
	companion object {
		val THE_ENCHIRIDION: Item = register("the_enchiridion", Item(OwoItemSettings().group(DarkArch.ITEM_GROUP)))
		val GUMMY_PEARL: Item = register("gummy_pearl", Item(OwoItemSettings().group(DarkArch.ITEM_GROUP)))
		val FIRE_PEARL: Item = register("fire_pearl", Item(OwoItemSettings().group(DarkArch.ITEM_GROUP)))
		val ICE_PEARL: Item = register("ice_pearl", Item(OwoItemSettings().group(DarkArch.ITEM_GROUP)))
		val SLIME_PEARL: Item = register("slime_pearl", Item(OwoItemSettings().group(DarkArch.ITEM_GROUP)))

		private fun register(
			name: String,
			item: Item,
		): Item {
			return Registry.register(BuiltInRegistries.ITEM, ResourceLocation(DarkArch.MOD_ID, name), item)
		}

		fun registerItems() {}
	}
}