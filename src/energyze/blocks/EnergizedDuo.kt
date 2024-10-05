package energyze.blocks

import energyze.ModItems
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.entities.pattern.ShootAlternate
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.ItemTurret

class EnergizedDuo : ItemTurret("energized-duo") {
    init {
        val duo = Blocks.duo as ItemTurret

        requirements(Category.turret, ItemStack.with(ModItems.energizedCopper, 35))
        ammoTypes = duo.ammoTypes.copy().onEach {
            it.value = it.value.copy().apply { damage *= 2f }
        }

        shoot = ShootAlternate(3.5f)

        recoils = 2
        drawer = duo.drawer

        recoil = 0.5f
        shootY = 3f
        reload = 10f
        range = duo.range * 2f
        shootCone = 15f
        ammoUseEffect = Fx.casing1
        health = 300
        inaccuracy = 2f
        rotateSpeed = 10f
        coolant = consumeCoolant(0.2f)

        limitRange()
    }
}