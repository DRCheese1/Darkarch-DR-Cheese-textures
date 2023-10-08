package darkarch.datagen.tag

import darkarch.DarkArch
import darkarch.block.Blocks
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider
import net.minecraft.core.HolderLookup
import net.minecraft.core.registries.Registries
import net.minecraft.resources.ResourceLocation
import net.minecraft.tags.BlockTags
import net.minecraft.tags.TagKey
import net.minecraft.world.item.Item
import net.minecraft.world.level.block.Block
import java.util.concurrent.CompletableFuture

class BlockTagsGen(output: FabricDataOutput, completableFuture: CompletableFuture<HolderLookup.Provider>): BlockTagProvider(output, completableFuture) {
	private val COMMON_PLANKS_THAT_BURN_TAG: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation("c", "planks_that_burn"))
	private val GUMMY_LOGS: TagKey<Block> = TagKey.create(Registries.BLOCK, ResourceLocation(DarkArch.MOD_ID, "gummy_logs"))

	override fun addTags(arg: HolderLookup.Provider) {
		getOrCreateTagBuilder(GUMMY_LOGS).add(Blocks.GUMMY_LOG).add(Blocks.STRIPPED_GUMMY_LOG)
		getOrCreateTagBuilder(COMMON_PLANKS_THAT_BURN_TAG).add(Blocks.GUMMY_LOG).add(Blocks.STRIPPED_GUMMY_LOG).add(
			Blocks.GUMMY_PLANKS)
		getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE).add(Blocks.GUMMY_PLANKS).add(Blocks.GUMMY_LOG).add(Blocks.STRIPPED_GUMMY_LOG)
		getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL).add(Blocks.GUMMY_GRASS_BLOCK)
		getOrCreateTagBuilder(BlockTags.DIRT).add(Blocks.GUMMY_GRASS_BLOCK)
		getOrCreateTagBuilder(BlockTags.LOGS).add(Blocks.GUMMY_LOG, Blocks.STRIPPED_GUMMY_LOG)
		getOrCreateTagBuilder(BlockTags.LEAVES).add(Blocks.GUMMY_LEAVES)
		getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).add(Blocks.GUMMY_PLANKS)
		getOrCreateTagBuilder(BlockTags.PLANKS).add(Blocks.GUMMY_PLANKS)
	}
}
