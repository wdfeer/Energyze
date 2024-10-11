package energyze.blocks.energizers

import energyze.ModItems
import mindustry.content.Items
import mindustry.type.ItemStack

class ThoriumEnergizer : Energizer("thorium-energizer", Items.thorium, ModItems.energizedThorium, arrayOf(
    ItemStack(Items.copper, 240),
    ItemStack(Items.titanium, 100),
    ItemStack(Items.silicon, 80),
    ItemStack(Items.phaseFabric, 40),
    ItemStack(ModItems.energizedCopper, 40)
))