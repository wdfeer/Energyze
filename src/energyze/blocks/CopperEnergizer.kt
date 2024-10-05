package energyze.blocks

import arc.graphics.Color
import energyze.ModItems
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.gen.Sounds
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.production.GenericCrafter
import mindustry.world.draw.DrawDefault
import mindustry.world.draw.DrawFlame
import mindustry.world.draw.DrawMulti

class CopperEnergizer : GenericCrafter("copper-energizer") {
    init {
        requirements(Category.crafting, ItemStack.with(Items.titanium, 300, Items.plastanium, 120, Items.phaseFabric, 80))
        craftEffect = Fx.smeltsmoke
        outputItem = ItemStack(ModItems.energizedCopper, 1)
        craftTime = CRAFT_TIME
        size = 2
        hasPower = true
        hasLiquids = false
        drawer = DrawMulti(DrawDefault(), DrawFlame(Color.valueOf("fcf387")))
        ambientSound = Sounds.techloop
        ambientSoundVolume = 0.02f

        consumeItems(ItemStack(Items.copper, 2))
        consumePower(POWER_PER_OUTPUT / CRAFT_TIME)
    }

    companion object {
        const val POWER_PER_OUTPUT = 1000f
        const val CRAFT_TIME = 120f
    }
}