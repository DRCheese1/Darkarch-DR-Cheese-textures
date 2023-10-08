package darkarch.datagen.lang

import darkarch.block.Blocks
import darkarch.item.Items
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider

class EnglishLangGen(output: FabricDataOutput) : FabricLanguageProvider(output, "en_us") {
	override fun generateTranslations(translationBuilder: TranslationBuilder) {
		translationBuilder.add("itemGroup.darkarch.darkarch", "Dark Arch")
		translationBuilder.add("itemGroup.darkarch.darkarch.button.github", "GitHub")
		translationBuilder.add("itemGroup.darkarch.darkarch.button.modrinth", "Modrinth")

		translationBuilder.add(Items.THE_ENCHIRIDION, "The Enchiridion")
		translationBuilder.add("item.darkarch.the_enchiridion.tooltip", "§o§eBook of the Great Sage")

		translationBuilder.add(Items.SLIME_PEARL, "Slime Pearl")
		translationBuilder.add("item.darkarch.slime_pearl.tooltip", "§o§aSlime, Doctors, Health")

		translationBuilder.add(Items.FIRE_PEARL, "Fire Pearl")
		translationBuilder.add("item.darkarch.fire_pearl.tooltip", "§o§6Pyro, Warriors, Strength")

		translationBuilder.add(Items.GUMMY_PEARL, "Gummy Pearl")
		translationBuilder.add("item.darkarch.gummy_pearl.tooltip", "§o§dGummy, Scholars, Knowledge")

		translationBuilder.add(Items.ICE_PEARL, "Ice Pearl")
		translationBuilder.add("item.darkarch.ice_pearl.tooltip", "§o§bCryo, Sages, Eternity")

		translationBuilder.add(Blocks.GUMMY_GRASS_BLOCK, "Gummy Grass Block")
		translationBuilder.add(Blocks.GUMMY_PLANKS, "Gummy Planks")
		translationBuilder.add(Blocks.STRIPPED_GUMMY_LOG, "Stripped Gummy Log")
		translationBuilder.add(Blocks.GUMMY_LOG, "Gummy Log")
		translationBuilder.add(Blocks.GUMMY_LEAVES, "Gummy Leaves")
	}
}
