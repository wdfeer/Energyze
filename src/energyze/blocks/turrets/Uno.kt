package energyze.blocks.turrets

import mindustry.content.Fx
import mindustry.content.Items
import mindustry.entities.bullet.BasicBulletType
import mindustry.entities.part.DrawPart
import mindustry.entities.part.RegionPart
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.ItemTurret
import mindustry.world.draw.DrawTurret

class Uno : ItemTurret("uno") {
    init {
        requirements(Category.turret, ItemStack.with(Items.copper, 35))
        ammo(
            Items.copper, BasicBulletType(2.5f, 18f).apply {
                width = 7f * 1.5f
                height = 9f * 1.5f
                lifetime = 60f
                ammoMultiplier = 2f
            },
            Items.graphite, BasicBulletType(3.5f, 36f).apply {
                width = 9f * 1.5f
                height = 12f * 1.5f
                reloadMultiplier = 0.6f
                ammoMultiplier = 4f
                lifetime = 60f
            },
            Items.silicon, BasicBulletType(3f, 24f).apply {
                width = 7f * 1.5f
                height = 9f * 1.5f
                homingPower = 0.1f
                reloadMultiplier = 1.5f
                ammoMultiplier = 5f
                lifetime = 60f
            }
        )

        drawer = DrawTurret().apply {
            parts.add(RegionPart("-barrel").apply {
                progress = DrawPart.PartProgress.recoil
                under = true
                moveY = -1.5f
            })
        }

        recoil = 0.5f
        shootY = 3f
        reload = 40f
        range = 110f
        shootCone = 15f
        ammoUseEffect = Fx.casing1
        health = 250
        inaccuracy = 2f
        rotateSpeed = 10f
        coolant = consumeCoolant(0.1f)

        limitRange()
    }
}