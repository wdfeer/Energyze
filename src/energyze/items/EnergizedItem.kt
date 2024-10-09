package energyze.items

import arc.graphics.Color
import mindustry.type.Item

abstract class EnergizedItem(name: String, color: Color) : Item(name, color) {
    init {
        charge = 1f
    }
}