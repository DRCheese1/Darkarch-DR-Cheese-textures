package darkarch.datagen

import darkarch.DarkArch
import darkarch.block.Blocks
import darkarch.item.Items
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.ModelTemplates
import net.minecraft.data.models.model.TextureSlot
import net.minecraft.data.models.model.TexturedModel
import net.minecraft.resources.ResourceLocation
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block

class ModelsGen(output: FabricDataOutput) : FabricModelProvider(output) {
	override fun generateBlockStateModels(gen: BlockModelGenerators) {
		val cubeBlocks = arrayOf(Blocks.GUMMY_PLANKS)

		cubeBlocks.forEach { block: Block ->
			gen.createTrivialBlock(block, TexturedModel.CUBE)
		}

		gen.createTrivialBlock(Blocks.GUMMY_GRASS_BLOCK, TexturedModel.CUBE_TOP_BOTTOM)
		gen.createTrivialBlock(Blocks.GUMMY_LEAVES, TexturedModel.LEAVES)
		gen.createRotatedPillarWithHorizontalVariant(Blocks.GUMMY_LOG, TexturedModel.COLUMN_ALT, TexturedModel.COLUMN_HORIZONTAL_ALT)
		gen.createRotatedPillarWithHorizontalVariant(Blocks.STRIPPED_GUMMY_LOG, TexturedModel.COLUMN_ALT.updateTexture { it.put(
			TextureSlot.END, ResourceLocation(DarkArch.MOD_ID, "block/gummy_log_top")
		) }, TexturedModel.COLUMN_HORIZONTAL_ALT.updateTexture { it.put(
			TextureSlot.END, ResourceLocation(DarkArch.MOD_ID, "block/gummy_log_top")
		) })
	}

	override fun generateItemModels(gen: ItemModelGenerators) {
		val flatItems = arrayOf(Items.THE_ENCHIRIDION, Items.GUMMY_PEARL, Items.FIRE_PEARL, Items.ICE_PEARL, Items.SLIME_PEARL)

		flatItems.forEach { item: Item ->
			gen.generateFlatItem(item, ModelTemplates.FLAT_ITEM)
		}
	}
}
