package energyze.blocks

import energyze.ModItems
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.gen.Sounds
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.ItemTurret

class EnergizedScorch : ItemTurret("energized-scorch") {
    init {
        val scorch = Blocks.scorch as ItemTurret

        requirements(Category.turret, ItemStack.with(ModItems.energizedCopper, 25, Items.graphite, 22))
        ammoTypes = scorch.ammoTypes.copy()
        recoil = 0f
        reload = 4f
        coolantMultiplier = 1.5f
        range = 100f
        shootY = 3f
        shootCone = 50f
        targetAir = false
        ammoUseEffect = Fx.none
        health = 560
        shootSound = Sounds.flame
        coolant = consumeCoolant(0.2f)
    }
}