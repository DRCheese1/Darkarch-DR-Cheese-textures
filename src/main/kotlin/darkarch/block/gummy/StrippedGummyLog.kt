package darkarch.block.gummy

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.world.level.block.Block
import net.minecraft.world.level.block.RotatedPillarBlock
import net.minecraft.world.level.block.SoundType
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument
import net.minecraft.world.level.material.MapColor

class StrippedGummyLog: RotatedPillarBlock(FabricBlockSettings.create().mapColor(MapColor.WOOD).instrument(
	NoteBlockInstrument.BASS).strength(2.0F).sound(
	SoundType.WOOD).ignitedByLava()) {
}
