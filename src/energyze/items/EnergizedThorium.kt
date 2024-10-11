package energyze.items

import arc.graphics.Color

class EnergizedThorium : EnergizedItem("energized-thorium", Color.valueOf("f9a3c7")) {
    init {
        explosiveness = 0.4f
        radioactivity = 1.2f
        cost = 1.4f
        healthScaling = 0.2f
    }

    fun addAmmo() {
        // TODO
    }
}