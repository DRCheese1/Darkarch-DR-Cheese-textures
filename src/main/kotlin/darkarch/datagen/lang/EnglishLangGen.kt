package darkarch.datagen.lang

import darkarch.item.DAItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider

class EnglishLangGen(output: FabricDataOutput): FabricLanguageProvider(output, "en_us") {
	override fun generateTranslations(translationBuilder: TranslationBuilder) {
		translationBuilder.add(DAItems.THE_ENCHIRIDION, "The Enchiridion")
		translationBuilder.add(DAItems.SLIME_PEARL, "Slime Pearl")
		translationBuilder.add(DAItems.FIRE_PEARL, "Fire Pearl")
		translationBuilder.add(DAItems.GUMMY_PEARL, "Gummy Pearl")
		translationBuilder.add(DAItems.ICE_PEARL, "Ice Pearl")
	}
}
