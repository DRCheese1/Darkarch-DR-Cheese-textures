package darkarch.datagen.tag

import darkarch.DarkArch
import darkarch.block.Blocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.ItemTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.ItemTags
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import java.util.concurrent.CompletableFuture


class ItemTagsGen(output: FabricDataOutput, completableFuture: CompletableFuture<HolderLookup.Provider> ): ItemTagProvider(output, completableFuture) {
	private val GUMMY_LOGS: TagKey<Item> = TagKey.create(Registries.ITEM, ResourceLocation(DarkArch.MOD_ID, "gummy_logs"))

	override fun addTags(arg: HolderLookup.Provider) {
		getOrCreateTagBuilder(GUMMY_LOGS).add(Blocks.GUMMY_LOG.asItem()).add(Blocks.STRIPPED_GUMMY_LOG.asItem())
		getOrCreateTagBuilder(ItemTags.LOGS).add(Blocks.GUMMY_LOG.asItem()).add(Blocks.STRIPPED_GUMMY_LOG.asItem())
		getOrCreateTagBuilder(ItemTags.LEAVES).add(Blocks.GUMMY_LEAVES.asItem())
		getOrCreateTagBuilder(ItemTags.PLANKS).add(Blocks.GUMMY_PLANKS.asItem())
		getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN).add(Blocks.GUMMY_PLANKS.asItem())
	}

}
