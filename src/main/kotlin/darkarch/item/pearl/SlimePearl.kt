package darkarch.item.pearl

import darkarch.DarkArch
import io.wispforest.owo.itemgroup.OwoItemSettings
import net.minecraft.network.chat.Component
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemStack
import net.minecraft.world.item.TooltipFlag
import net.minecraft.world.level.Level

class SlimePearl : Item(OwoItemSettings().group(DarkArch.ITEM_GROUP)) {
	override fun appendHoverText(
		itemStack: ItemStack,
		level: Level?,
		list: MutableList<Component>,
		tooltipFlag: TooltipFlag,
	) {
		list.add(Component.translatable("item.darkarch.slime_pearl.tooltip"))
		super.appendHoverText(itemStack, level, list, tooltipFlag)
	}
}
