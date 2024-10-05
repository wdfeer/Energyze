package energyze.items

import arc.graphics.Color
import mindustry.content.Blocks
import mindustry.entities.bullet.BasicBulletType
import mindustry.type.Item
import mindustry.world.blocks.defense.turrets.ItemTurret

class EnergizedCopper : Item("energized-copper", Color.valueOf("df9d73")) {
    init {
        cost = 1.1f

        (Blocks.duo as ItemTurret).ammoTypes.put(this, object : BasicBulletType(3f, 18f) {
            init {
                width = 7f
                height = 9f
                lifetime = 80f
                ammoMultiplier = 2f

                reloadMultiplier = 2f

                lightningDamage = 9f
                lightning = 2
                lightningLength = 10
            }
        })
    }
}