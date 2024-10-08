package energyze.items

import arc.graphics.Color
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.content.StatusEffects
import mindustry.entities.bullet.BulletType
import mindustry.type.Item
import mindustry.world.blocks.defense.turrets.ItemTurret

class EnergizedCoal : Item("energized-coal", Color.valueOf("373727")) {
    init {
        explosiveness = 0.25f
        flammability = 1f
        charge = 0.6f
        buildable = false
    }

    fun addAmmo() {
        (Blocks.scorch as ItemTurret).ammoTypes.put(this, BulletType(4.2f, 27f).apply {
            ammoMultiplier = 3f
            hitSize = 7f
            lifetime = 18f
            pierce = true
            collidesAir = false
            statusDuration = 60f * 4
            shootEffect = Fx.shootSmallFlame
            hitEffect = Fx.hitFlameSmall
            despawnEffect = Fx.none
            status = StatusEffects.burning
            keepVelocity = false
            hittable = false

            lightning = 2
            lightningDamage = 7f
        })
    }
}