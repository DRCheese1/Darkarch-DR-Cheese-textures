package darkarch.item

import darkarch.DarkArch
import darkarch.item.pearl.FirePearl
import darkarch.item.pearl.GummyPearl
import darkarch.item.pearl.IcePearl
import darkarch.item.pearl.SlimePearl
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item

class DAItems {
	companion object {
		val THE_ENCHIRIDION: Item = register("the_enchiridion", TheEnchiridion())
		val GUMMY_PEARL: Item = register("gummy_pearl", GummyPearl())
		val FIRE_PEARL: Item = register("fire_pearl", FirePearl())
		val ICE_PEARL: Item = register("ice_pearl", IcePearl())
		val SLIME_PEARL: Item = register("slime_pearl", SlimePearl())

		private fun register(
			name: String,
			item: Item,
		): Item {
			return Registry.register(BuiltInRegistries.ITEM, ResourceLocation(DarkArch.MOD_ID, name), item)
		}

		fun registerItems() {}
	}
}
