package darkarch.datagen.lang

import darkarch.item.DAItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider

class EnglishLangGen(output: FabricDataOutput) : FabricLanguageProvider(output, "en_us") {
	override fun generateTranslations(translationBuilder: TranslationBuilder) {
		translationBuilder.add(DAItems.THE_ENCHIRIDION, "The Enchiridion")
		translationBuilder.add("item.darkarch.the_enchiridion.tooltip", "§o§eBook of the Great Sage")

		translationBuilder.add(DAItems.SLIME_PEARL, "Slime Pearl")
		translationBuilder.add("item.darkarch.slime_pearl.tooltip", "§o§aSlime, Doctors, Health")

		translationBuilder.add(DAItems.FIRE_PEARL, "Fire Pearl")
		translationBuilder.add("item.darkarch.fire_pearl.tooltip", "§o§6Pyro, Warriors, Strength")

		translationBuilder.add(DAItems.GUMMY_PEARL, "Gummy Pearl")
		translationBuilder.add("item.darkarch.gummy_pearl.tooltip", "§o§dGummy, Scholars, Knowledge")

		translationBuilder.add(DAItems.ICE_PEARL, "Ice Pearl")
		translationBuilder.add("item.darkarch.ice_pearl.tooltip", "§o§bCryo, Sages, Eternity")

		translationBuilder.add("itemGroup.darkarch.darkarch", "Dark Arch")
		translationBuilder.add("itemGroup.darkarch.darkarch.button.github", "GitHub")
		translationBuilder.add("itemGroup.darkarch.darkarch.button.modrinth", "Modrinth")
	}
}
