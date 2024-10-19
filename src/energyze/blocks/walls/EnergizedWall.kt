package energyze.blocks.walls

import energyze.items.EnergizedItem
import mindustry.content.Items
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.Block
import mindustry.world.blocks.defense.ShieldWall

class EnergizedWall(name: String, item: EnergizedItem, baseWall: Block, size: Int) : ShieldWall(name) {
    init {
        this.size = size
        val sqrSize = size * size

        requirements(Category.defense, ItemStack.with(item, sqrSize * 6, Items.silicon, sqrSize, Items.phaseFabric, size))
        scaledHealth = baseWall.health.toFloat()
        shieldHealth = 150f * sqrSize
    }
}