package energyze.blocks

import energyze.ModItems
import mindustry.content.Blocks
import mindustry.content.Items
import mindustry.gen.Sounds
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.ItemTurret

class EnergizedHail : ItemTurret("energized-hail") {
    init {
        val hail = Blocks.hail as ItemTurret

        requirements(Category.turret, ItemStack.with(ModItems.energizedCopper, 40, Items.graphite, 17))
        ammoTypes = hail.ammoTypes.copy()
        targetAir = false
        reload = 40f
        recoil = 2f
        range = 275f
        inaccuracy = 1f
        shootCone = 10f
        health = 400
        shootSound = Sounds.bang
        coolant = consumeCoolant(0.2f)
        limitRange(0f)
    }
}