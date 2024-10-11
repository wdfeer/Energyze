package energyze.blocks

import energyze.ModItems
import mindustry.content.Items
import mindustry.type.ItemStack

class CopperEnergizer : Energizer("copper-energizer", Items.copper, ModItems.energizedCopper, arrayOf(
    ItemStack(Items.titanium, 300),
    ItemStack(Items.plastanium, 120),
    ItemStack(Items.phaseFabric, 80)
))