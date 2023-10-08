package darkarch

import darkarch.datagen.ModelsGen
import darkarch.datagen.tag.ItemTagsGen
import darkarch.datagen.lang.EnglishLangGen
import darkarch.datagen.tag.BlockTagsGen
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

class DADataGen : DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack: FabricDataGenerator.Pack = fabricDataGenerator.createPack()

		pack.addProvider(::ModelsGen)
		pack.addProvider(::ItemTagsGen)
		pack.addProvider(::BlockTagsGen)
		pack.addProvider(::EnglishLangGen)
	}
}
