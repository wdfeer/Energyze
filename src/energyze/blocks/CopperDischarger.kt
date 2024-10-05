package energyze.blocks

import energyze.ModItems
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.gen.Sounds
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.power.ConsumeGenerator
import mindustry.world.draw.DrawDefault
import mindustry.world.draw.DrawMulti
import mindustry.world.draw.DrawWarmupRegion


class CopperDischarger : ConsumeGenerator("copper-discharger") {
    init {
        requirements(Category.power, ItemStack.with(Items.titanium, 800, ModItems.energizedCopper, 150))
        itemDuration = 16f
        powerProduction = CopperEnergizer.POWER_PER_OUTPUT / itemDuration

        size = 3

        ambientSound = Sounds.pulse
        ambientSoundVolume = 0.05f
        generateEffect = Fx.redgeneratespark

        consumeItems(ItemStack(ModItems.energizedCopper, 1))

        drawer = DrawMulti(DrawDefault(), DrawWarmupRegion())
    }
}