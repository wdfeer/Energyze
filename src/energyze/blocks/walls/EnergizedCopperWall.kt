package energyze.blocks.walls

import energyze.ModItems
import mindustry.content.Blocks
import mindustry.content.Items
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.ShieldWall

class EnergizedCopperWall : ShieldWall("energized-copper-wall") {
    init {
        val copperWall = Blocks.copperWall

        requirements(Category.defense, ItemStack.with(ModItems.energizedCopper, 24, Items.silicon, 4, Items.phaseFabric, 1))
        size = 2
        scaledHealth = copperWall.health.toFloat()
        shieldHealth = 150f * size * size
    }
}