package energyze.blocks.energizers

import arc.graphics.Color
import mindustry.content.Fx
import mindustry.gen.Sounds
import mindustry.type.Category
import mindustry.type.Item
import mindustry.type.ItemStack
import mindustry.world.blocks.production.GenericCrafter
import mindustry.world.consumers.ConsumeItems
import mindustry.world.consumers.ConsumePower
import mindustry.world.draw.DrawDefault
import mindustry.world.draw.DrawFlame
import mindustry.world.draw.DrawMulti

abstract class Energizer(name: String, input: Item, output: Item, requirements: Array<ItemStack>) : GenericCrafter (name) {
    init {
        this.requirements(Category.crafting, requirements)
        craftEffect = Fx.smeltsmoke
        outputItem = ItemStack(output, 1)
        craftTime = CRAFT_TIME
        size = 2
        hasPower = true
        hasLiquids = false
        drawer = DrawMulti(DrawDefault(), DrawFlame(Color.valueOf("fcf387")))
        ambientSound = Sounds.techloop
        ambientSoundVolume = 0.02f

        consumeItems(ItemStack(input, 3))
        consumePower(POWER_PER_OUTPUT / CRAFT_TIME)
    }

    final override fun consumeItems(vararg items: ItemStack?): ConsumeItems = super.consumeItems(*items)
    final override fun consumePower(powerPerTick: Float): ConsumePower = super.consumePower(powerPerTick)

    companion object {
        const val POWER_PER_OUTPUT = 1000f
        const val CRAFT_TIME = 120f
    }
}