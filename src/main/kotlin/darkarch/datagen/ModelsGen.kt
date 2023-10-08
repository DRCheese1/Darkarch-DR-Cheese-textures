package darkarch.datagen

import darkarch.item.DAItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider
import net.minecraft.data.models.BlockModelGenerators
import net.minecraft.data.models.ItemModelGenerators
import net.minecraft.data.models.model.ModelTemplates
import net.minecraft.world.item.Item

class ModelsGen(output: FabricDataOutput): FabricModelProvider(output) {
	override fun generateBlockStateModels(gen: BlockModelGenerators) {

	}

	override fun generateItemModels(gen: ItemModelGenerators) {
		val flatItems = arrayOf(DAItems.THE_ENCHIRIDION,DAItems.GUMMY_PEARL, DAItems.FIRE_PEARL, DAItems.ICE_PEARL, DAItems.SLIME_PEARL)

		flatItems.forEach { item: Item ->
			gen.generateFlatItem(item, ModelTemplates.FLAT_ITEM)
		}
	}
}
