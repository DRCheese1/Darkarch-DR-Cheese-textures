package darkarch.block.gummy

import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.world.level.block.Blocks
import net.minecraft.world.level.block.LeavesBlock
import net.minecraft.world.level.block.SoundType
import net.minecraft.world.level.material.MapColor
import net.minecraft.world.level.material.PushReaction

class GummyLeaves: LeavesBlock(FabricBlockSettings.create().mapColor(MapColor.PLANT).strength(0.2F).randomTicks().sound(
	SoundType.GRASS
).noOcclusion().isValidSpawn(
	Blocks::ocelotOrParrot).isSuffocating(Blocks::never).isViewBlocking(Blocks::never).ignitedByLava().pushReaction(
	PushReaction.DESTROY).isRedstoneConductor(Blocks::never)) {
}
