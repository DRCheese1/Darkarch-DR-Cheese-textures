package darkarch

import darkarch.datagen.ModelsGen
import darkarch.datagen.lang.EnglishLangGen
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

class DADataGen : DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack: FabricDataGenerator.Pack = fabricDataGenerator.createPack()

		pack.addProvider(::ModelsGen)
		pack.addProvider(::EnglishLangGen)
	}
}
