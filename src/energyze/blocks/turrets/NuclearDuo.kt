package energyze.blocks.turrets

import energyze.ModItems
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.entities.bullet.BasicBulletType
import mindustry.entities.part.RegionPart
import mindustry.entities.pattern.ShootAlternate
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.ItemTurret
import mindustry.world.draw.DrawTurret
import kotlin.math.floor
import kotlin.math.pow

class NuclearDuo : ItemTurret("nuclear-duo") {
    init {
        size = 2
        val duo = Blocks.duo as ItemTurret

        requirements(Category.turret, ItemStack.with(ModItems.energizedCopper, 140, ModItems.energizedThorium, 50))
        ammo(
            Items.copper, object : BasicBulletType(3f, modifyDamage(9f)) {
                init {
                    width = 7f * size
                    height = 9f * size
                    lifetime = 60f * size
                    ammoMultiplier = 2f
                }
            },
            Items.graphite, object : BasicBulletType(4f, modifyDamage(18f)) {
                init {
                    width = 9f * size
                    height = 12f * size
                    reloadMultiplier = 0.6f
                    ammoMultiplier = 4f
                    lifetime = 60f * size
                }
            },
            Items.silicon, object : BasicBulletType(3.5f, modifyDamage(12f)) {
                init {
                    width = 7f * size
                    height = 9f * size
                    homingPower = 0.1f
                    reloadMultiplier = 1.5f
                    ammoMultiplier = 5f
                    lifetime = 60f * size
                }
            }
        )

        shoot = ShootAlternate(3.5f)

        recoils = 2
        drawer = DrawTurret().apply {
            for (i in 0..1) {
                parts.add(object : RegionPart("-barrel-" + (if (i == 0) "l" else "r")) {
                    init {
                        progress = PartProgress.recoil
                        recoilIndex = i
                        under = true
                        moveY = -1.5f * size
                    }
                })
            }
        }

        recoil = 0.5f
        shootY = 3f * size
        reload = duo.reload
        range = duo.range * size
        shootCone = duo.shootCone * 1.35f
        ammoUseEffect = Fx.casing1
        scaledHealth = 360f
        inaccuracy = 2f
        rotateSpeed = 10f
        coolant = consumeCoolant(0.4f)

        limitRange()
    }

    private fun modifyDamage(duoDamage: Float): Float = floor(duoDamage.pow(1.12f) * size.toFloat().pow(1.75f))
}