package darkarch.block.gummy

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.SoundType
import net.minecraft.world.level.material.MapColor

class GummyGrassBlock: Block(FabricBlockSettings.create().mapColor(MapColor.GRASS).randomTicks().strength(0.6F).sound(
	SoundType.GRASS)) {

}
