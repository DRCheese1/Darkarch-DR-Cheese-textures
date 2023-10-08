package darkarch

import darkarch.item.DAItems
import io.wispforest.owo.itemgroup.Icon
import io.wispforest.owo.itemgroup.OwoItemGroup
import io.wispforest.owo.itemgroup.gui.ItemGroupButton
import net.fabricmc.api.ModInitializer
import net.minecraft.resources.ResourceLocation
import software.bernie.geckolib.GeckoLib

class DarkArch : ModInitializer {
	companion object {
		const val MOD_ID: String = "darkarch"
		val ITEM_GROUP =
			OwoItemGroup.builder(ResourceLocation(MOD_ID, "darkarch")) { Icon.of(DAItems.THE_ENCHIRIDION) }
				.initializer { group ->
					run {
						group.addButton(ItemGroupButton.github(group, "https://github.com/toby7002/DarkArch"))
						group.addButton(ItemGroupButton.modrinth(group, "https://github.com/toby7002/DarkArch"))
					}
				}
				.build()
	}

	override fun onInitialize() {
		GeckoLib.initialize()
		ITEM_GROUP.initialize()
		DAItems.registerItems()
	}
}
