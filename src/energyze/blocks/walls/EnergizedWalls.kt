package energyze.blocks.walls

import energyze.ModItems
import mindustry.content.Blocks

object EnergizedWalls {
    init {
        EnergizedWall("energized-copper-wall", ModItems.energizedCopper, Blocks.copperWall, 2)
        EnergizedWall("energized-copper-wall-large", ModItems.energizedCopper, Blocks.copperWall, 3)

        EnergizedWall("energized-thorium-wall", ModItems.energizedThorium, Blocks.thoriumWall, 2)
        EnergizedWall("energized-thorium-wall-large", ModItems.energizedThorium, Blocks.thoriumWall, 3)
    }
}