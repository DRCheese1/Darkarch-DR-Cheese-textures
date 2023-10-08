package darkarch

import darkarch.datagen.lang.EnglishLangGen
import darkarch.datagen.ModelsGen
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator

class DADataGen: DataGeneratorEntrypoint {
	override fun onInitializeDataGenerator(fabricDataGenerator: FabricDataGenerator) {
		val pack: FabricDataGenerator.Pack = fabricDataGenerator.createPack()

		pack.addProvider(::ModelsGen)
		pack.addProvider(::EnglishLangGen)
	}
}
