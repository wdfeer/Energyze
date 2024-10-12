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
            ItemStack.with(Items.silicon, 180, Items.phaseFabric, 100, ModItems.energizedThorium, 40)
        )

        scaledHealth = 320f
        range = 240f
        hasPower = true
        consumePower(16f)
        size = 2
        shootLength = 5f
        bulletDamage = 90f
        reload = 4f
        rotateSpeed *= 2f
        retargetTime /= 10f
        envEnabled = envEnabled or Env.space
    }
}