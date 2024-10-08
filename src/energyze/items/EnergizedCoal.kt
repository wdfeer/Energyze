package energyze.items

import arc.graphics.Color
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.content.StatusEffects
import mindustry.entities.bullet.ArtilleryBulletType
import mindustry.entities.bullet.BulletType
import mindustry.world.blocks.defense.turrets.ItemTurret

class EnergizedCoal : EnergizedItem("energized-coal", Color.valueOf("373727")) {
    init {
        explosiveness = 0.3f
        flammability = 0.9f
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
            lightningLength = 8
        })

        (Blocks.hail as ItemTurret).ammoTypes.put(this, getArtilleryBullet().apply {
            width = 11f.also { height = it }
        })

        (Blocks.ripple as ItemTurret).ammoTypes.put(this, getArtilleryBullet().apply {
            width = 13f.also { height = it }
        })
    }

    private fun getArtilleryBullet(): ArtilleryBulletType = ArtilleryBulletType(4f, 13f).apply {
        ammoMultiplier = 3f
        hitEffect = Fx.blastExplosion
        knockback = 0.8f
        lifetime = 80f

        collidesTiles = false
        splashDamageRadius = 25f * 0.75f
        splashDamage = 20f

        status = StatusEffects.burning
        statusDuration = 15f * 12f
        makeFire = true

        lightning = 3
        lightningLength = 11
        reloadMultiplier = 1.5f
    }
}