package energyze.blocks.walls

import energyze.ModBlocks
import mindustry.content.Blocks
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.ShieldWall

class EnergizedCopperWallLarge : ShieldWall("energized-copper-wall-large") {
    init {
        val copperWallLarge = Blocks.copperWallLarge

        requirements(Category.defense, ItemStack.mult(ModBlocks.energizedCopperWall.requirements, 4f))
        health = copperWallLarge.health
        size = 2
        shieldHealth = 400f
    }
}