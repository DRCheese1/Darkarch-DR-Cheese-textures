package darkarch.block

import darkarch.DarkArch
import darkarch.block.gummy.*
import io.wispforest.owo.itemgroup.OwoItemSettings
import net.minecraft.core.Registry
import net.minecraft.core.registries.BuiltInRegistries
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.BlockItem
import net.minecraft.world.level.block.Block

class Blocks {
	companion object {
		val GUMMY_PLANKS = register("gummy_planks", GummyPlanks())
		val GUMMY_LOG = register("gummy_log", GummyLog())
		val GUMMY_LEAVES = register("gummy_leaves", GummyLeaves())
		val STRIPPED_GUMMY_LOG = register("stripped_gummy_log", StrippedGummyLog())
		val GUMMY_GRASS_BLOCK = register("gummy_grass_block", GummyGrassBlock())

		private fun register(name: String, block: Block): Block {
			Registry.register(BuiltInRegistries.ITEM, ResourceLocation(DarkArch.MOD_ID, name), BlockItem(block, OwoItemSettings().group(DarkArch.ITEM_GROUP)))
			return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation(DarkArch.MOD_ID, name), block)
		}

		fun registerAll() {}
	}
}
