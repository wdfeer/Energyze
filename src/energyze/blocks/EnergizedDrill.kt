package energyze.blocks

import energyze.ModItems
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.world.blocks.production.Drill

class EnergizedDrill : Drill("energized-drill") {
    init {
        val blastDrill = Blocks.blastDrill as Drill

        requirements(blastDrill.category, blastDrill.requirements.map { it.copy() }.onEach {
            if (it.item == Items.copper) it.item = ModItems.energizedCopper
            else if (it.item == Items.thorium) it.item = Items.phaseFabric
        }.toTypedArray())

        drillTime = blastDrill.drillTime / 3.6f
        size = 4
        drawRim = true
        tier = 5
        updateEffect = Fx.pulverize
        updateEffectChance = 0.02f
        drillEffect = Fx.mineHuge
        rotateSpeed = 6f
        itemCapacity = 50

        consumeItem(ModItems.energizedCopper)
    }
}