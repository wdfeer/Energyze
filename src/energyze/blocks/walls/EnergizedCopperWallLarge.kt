package energyze.blocks.walls

import energyze.ModBlocks
import mindustry.content.Blocks
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.ShieldWall

class EnergizedCopperWallLarge : ShieldWall("energized-copper-wall-large") {
    init {
        val copperWall = Blocks.copperWall

        requirements(Category.defense, ItemStack.mult(ModBlocks.energizedCopperWall.requirements, 9f / 4f))
        size = 3
        scaledHealth = copperWall.health.toFloat()
        shieldHealth = 100f * size * size
    }
}