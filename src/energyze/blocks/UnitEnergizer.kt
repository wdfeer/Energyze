package energyze.blocks

import energyze.ModItems
import mindustry.content.Items
import mindustry.content.UnitTypes
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.units.Reconstructor

class UnitEnergizer : Reconstructor("unit-energizer") {
    init {
        requirements(Category.units, ItemStack.with(Items.lead, 150, ModItems.energizedCopper, 200, Items.silicon, 150, Items.plastanium, 90))

        constructTime = 60f * 15f

        size = 3
        consumeItems(*ItemStack.with(ModItems.energizedCopper, 50))

        upgrades.addAll(
            arrayOf(UnitTypes.dagger, TODO("energizedDagger"))
        )
    }

}