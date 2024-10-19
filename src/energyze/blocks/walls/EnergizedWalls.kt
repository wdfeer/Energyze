package energyze.blocks.walls

import energyze.ModItems
import mindustry.content.Blocks

object EnergizedWalls {
    init {
        EnergizedWall("energized-copper-wall", ModItems.energizedCopper, Blocks.copperWall, 2)
        EnergizedWall("energized-copper-wall-large", ModItems.energizedCopper, Blocks.copperWall, 3)
    }
}