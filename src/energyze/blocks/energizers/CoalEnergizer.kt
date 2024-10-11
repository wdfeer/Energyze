package energyze.blocks.energizers

import energyze.ModItems
import mindustry.content.Items
import mindustry.type.ItemStack

class CoalEnergizer : Energizer("coal-energizer", Items.coal, ModItems.energizedCoal, arrayOf(
    ItemStack(Items.copper, 180),
    ItemStack(Items.graphite, 80),
    ItemStack(Items.silicon, 60)
)
)