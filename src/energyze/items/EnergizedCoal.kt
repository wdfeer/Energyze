package energyze.items

import arc.graphics.Color
import mindustry.type.Item

class EnergizedCoal : Item("energized-coal", Color.valueOf("373727")) {
    init {
        explosiveness = 0.25f
        flammability = 1f
        charge = 0.6f
        buildable = false
    }

    fun addAmmo() {
        // TODO
    }
}