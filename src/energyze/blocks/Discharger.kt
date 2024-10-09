package energyze.blocks

import energyze.ModItems
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.gen.Sounds
import mindustry.type.Category
import mindustry.type.ItemStack
import mindustry.world.blocks.power.ConsumeGenerator
import mindustry.world.consumers.ConsumeItemCharged
import mindustry.world.draw.DrawDefault
import mindustry.world.draw.DrawMulti
import mindustry.world.draw.DrawWarmupRegion


class Discharger : ConsumeGenerator("discharger") {
    init {
        requirements(Category.power, ItemStack.with(Items.titanium, 450, Items.silicon, 200, ModItems.energizedCopper, 100))
        itemDuration = 10f
        powerProduction = CopperEnergizer.POWER_PER_OUTPUT / itemDuration

        size = 3

        ambientSound = Sounds.pulse
        ambientSoundVolume = 0.05f
        generateEffect = Fx.redgeneratespark

        consume(ConsumeItemCharged())

        drawer = DrawMulti(DrawDefault(), DrawWarmupRegion())
    }
}