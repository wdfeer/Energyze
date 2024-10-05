package energyze.blocks

import energyze.ModItems
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.entities.part.RegionPart
import mindustry.entities.pattern.ShootAlternate
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.ItemTurret
import mindustry.world.draw.DrawTurret

class EnergizedDuo : ItemTurret("energized-duo") {
    init {
        val duo = Blocks.duo as ItemTurret

        requirements(Category.turret, ItemStack.with(ModItems.energizedCopper, 35))
        ammoTypes = duo.ammoTypes.copy()

        shoot = ShootAlternate(3.5f).apply { shots = 2 }

        recoils = 2
        drawer = DrawTurret().apply {
            for (i in 0..1) {
                parts.add(object : RegionPart("-barrel-" + (if (i == 0) "l" else "r")) {
                    init {
                        progress = PartProgress.recoil
                        recoilIndex = i
                        under = true
                        moveY = -1.5f
                    }
                })
            }
        }

        recoil = 0.5f
        shootY = 3f
        reload = duo.reload / 1.5f
        range = duo.range * 1.35f
        shootCone = duo.shootCone * 1.35f
        ammoUseEffect = Fx.casing1
        health = 360
        inaccuracy = 2f
        rotateSpeed = 10f
        coolant = consumeCoolant(0.2f)

        limitRange()
    }
}