package energyze.blocks.turrets

import energyze.ModItems
import mindustry.content.Items
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.PointDefenseTurret
import mindustry.world.meta.Env

class EnergizedSegment : PointDefenseTurret("energized-segment") {
    init {
        requirements(
            Category.turret,
            ItemStack.with(Items.silicon, 130, Items.phaseFabric, 60, ModItems.energizedThorium, 60)
        )

        scaledHealth = 250f
        range = 240f
        hasPower = true
        consumePower(12f)
        size = 2
        shootLength = 5f
        bulletDamage = 30f
        reload = 6f
        envEnabled = envEnabled or Env.space
    }
}