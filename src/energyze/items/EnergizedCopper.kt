package energyze.items

import arc.graphics.Color
import mindustry.content.Blocks
import mindustry.entities.bullet.BasicBulletType
import mindustry.type.Item
import mindustry.world.blocks.defense.turrets.ItemTurret

class EnergizedCopper : Item("energized-copper", Color.valueOf("df9d73")) {
    init {
        cost = 1.1f
    }

    fun addAsDuoAmmo() {
        (Blocks.duo as ItemTurret).ammoTypes.put(this, object : BasicBulletType(2.75f, 20f) {
            init {
                width = 7f
                height = 9f
                lifetime = 60f
                ammoMultiplier = 2f

                reloadMultiplier = 1.5f

                lightningDamage = 6f
                lightning = 3
                lightningLength = 6
            }
        })
    }
}