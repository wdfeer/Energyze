package energyze.blocks.turrets

import arc.graphics.Color
import energyze.ModItems
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.entities.bullet.LaserBulletType
import mindustry.entities.effect.MultiEffect
import mindustry.entities.pattern.ShootSpread
import mindustry.gen.Sounds
import mindustry.graphics.Pal
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.PowerTurret
import mindustry.world.blocks.defense.turrets.Turret

class NuclearLancer : PowerTurret("nuclear-lancer") {
    init {
        requirements(
            Category.turret,
            ItemStack.with(Items.lead, 540, Items.silicon, 250, ModItems.energizedCopper, 150, ModItems.energizedThorium, 120, Items.surgeAlloy, 100)
        )
        range = (Blocks.foreshadow as Turret).range * 0.68f

        recoil = 3f
        reload = 80f * 2.25f
        shake = 4f
        shootEffect = Fx.lancerLaserShoot
        smokeEffect = Fx.none
        heatColor = Color.pink
        size = 4
        scaledHealth = 280f
        targetAir = true
        moveWhileCharging = false
        accurateDelay = false
        shootSound = Sounds.laserblast
        coolant = consumeCoolant(1f)
        coolantMultiplier /= 6

        consumePower(36f)

        shoot = ShootSpread(3, 1.5f)

        shootType = LaserBulletType(256f).apply {
            colors = arrayOf(Pal.lancerLaser.cpy().a(0.4f), Pal.lancerLaser, Color(1f, 1f, 1f).mul(Color.pink))
            chargeEffect = MultiEffect(Fx.lancerLaserCharge, Fx.lancerLaserChargeBegin)

            buildingDamageMultiplier = 0.25f
            hitEffect = Fx.hitLancer
            hitSize = 6f
            lifetime = 16f * 1.1f
            drawSize = 400f * 2f
            collidesAir = true
            length = this@NuclearLancer.range + 8f
            pierceCap = 3
        }
    }
}