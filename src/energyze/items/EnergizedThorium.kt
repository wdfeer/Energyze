package energyze.items

import arc.graphics.Color
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.entities.bullet.BasicBulletType
import mindustry.world.blocks.defense.turrets.ItemTurret

class EnergizedThorium : EnergizedItem("energized-thorium", Color.valueOf("f9a3c7")) {
    init {
        explosiveness = 0.4f
        radioactivity = 1.2f
        cost = 1.4f
        healthScaling = 0.2f
    }

    fun addAmmo() {
        (Blocks.salvo as ItemTurret).ammoTypes.put(this, BasicBulletType(4f, 23f, "bullet").apply {
            width = 10f
            height = 13f
            shootEffect = Fx.shootBig
            smokeEffect = Fx.shootBigSmoke
            ammoMultiplier = 4f
            lifetime = 60f

            reloadMultiplier = 1.2f

            lightning = 1
            lightningDamage = 13f

            splashDamage = 16f
            splashDamageRadius = 12f
        })
    }
}