package energyze.items

import arc.graphics.Color
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.entities.bullet.BasicBulletType
import mindustry.entities.bullet.FlakBulletType
import mindustry.world.blocks.defense.turrets.ItemTurret

class EnergizedCopper : EnergizedItem("energized-copper", Color.valueOf("df9d73")) {
    init {
        cost = 1.1f
    }

    fun addAmmo() {
        (Blocks.duo as ItemTurret).ammoTypes.put(this, BasicBulletType(2.75f, 20f).apply {
            width = 7f
            height = 9f
            lifetime = 60f
            ammoMultiplier = 2f

            reloadMultiplier = 1.5f

            lightningDamage = 6f
            lightning = 3
            lightningLength = 6
        })

        (Blocks.scatter as ItemTurret).ammoTypes.put(this, FlakBulletType(4.2f, 11f).apply {
            lifetime = 60f
            ammoMultiplier = 4f
            shootEffect = Fx.shootSmall
            width = 6f
            height = 8f
            hitEffect = Fx.flakExplosion
            splashDamage = 12f * 1.5f
            splashDamageRadius = 8f

            lightning = 2
            lightningLength = 8

            reloadMultiplier = 1.2f
        })
    }
}