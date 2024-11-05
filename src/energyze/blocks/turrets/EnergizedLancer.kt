package energyze.blocks.turrets

import arc.graphics.Color
import energyze.ModItems
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.entities.bullet.LaserBulletType
import mindustry.entities.effect.MultiEffect
import mindustry.entities.pattern.ShootAlternate
import mindustry.gen.Sounds
import mindustry.graphics.Pal
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.PowerTurret

class EnergizedLancer : PowerTurret("energized-lancer") {
    init {
        requirements(
            Category.turret,
            ItemStack.with(ModItems.energizedCopper, 120, Items.lead, 90, Items.silicon, 70, Items.titanium, 35)
        )
        range = 165f * 1.2f

        shoot = ShootAlternate(4f).apply { shots = 2 }
        shoot.firstShotDelay = 60f

        recoil = 2f
        reload = 80f * 1.35f
        shake = 3f
        shootEffect = Fx.lancerLaserShoot
        smokeEffect = Fx.none
        heatColor = Color.gold
        size = 2
        scaledHealth = 320f
        targetAir = false
        moveWhileCharging = false
        accurateDelay = false
        shootSound = Sounds.laser
        coolant = consumeCoolant(0.3f)

        consumePower(12f)

        shootType = LaserBulletType(140f).apply {
            colors = arrayOf(Pal.lancerLaser.cpy().a(0.4f), Pal.lancerLaser, Color.white)
            chargeEffect = MultiEffect(Fx.lancerLaserCharge, Fx.lancerLaserChargeBegin)

            buildingDamageMultiplier = 0.25f
            hitEffect = Fx.hitLancer
            hitSize = 4f
            lifetime = 16f
            drawSize = 400f
            collidesAir = false
            length = 173f * 1.2f
            ammoMultiplier = 1f
            pierceCap = 4
        }
    }
}