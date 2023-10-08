package darkarch

import darkarch.block.Blocks
import darkarch.item.Items
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
			OwoItemGroup.builder(ResourceLocation(MOD_ID, "darkarch")) { Icon.of(Items.THE_ENCHIRIDION) }
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
		Items.registerItems()
		Blocks.registerAll()
	}
}
