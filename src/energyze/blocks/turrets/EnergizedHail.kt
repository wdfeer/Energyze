package energyze.blocks.turrets

import energyze.ModItems
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.entities.bullet.ArtilleryBulletType
import mindustry.gen.Sounds
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.ItemTurret

class EnergizedHail : ItemTurret("energized-hail") {
    init {
        val hail = Blocks.hail as ItemTurret

        requirements(Category.turret, ItemStack.with(ModItems.energizedCopper, 40, Items.graphite, 17))
        ammoTypes = hail.ammoTypes.copy().also { it.put(ModItems.energizedThorium, getEnergizedThoriumBullet()) }
        targetAir = false
        reload = 40f
        recoil = 2f
        range = 275f
        inaccuracy = 0.5f
        shootCone = 10f
        health = 400
        shootSound = Sounds.bang
        coolant = consumeCoolant(0.2f)
        limitRange(0f)
    }

    private fun getEnergizedThoriumBullet(): ArtilleryBulletType {
        return ArtilleryBulletType(1.5f, 40f).apply {
            knockback = 1.6f
            lifetime = 160f
            width = 16f.also { height = it }
            collidesTiles = false
            splashDamageRadius = 50f * 0.75f
            splashDamage = 66f

            hitEffect = Fx.blastExplosion
            reloadMultiplier = 0.15f

            lightning = 4
            lightningLength = 11
            lightningDamage = 20f
        }
    }
}