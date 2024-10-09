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

class EnergizedSiliconCrucible : GenericCrafter("energized-silicon-crucible") {
    init {
        requirements(
            Category.crafting,
            ItemStack.with(Items.titanium, 120, Items.thorium, 120, Items.silicon, 80, ModItems.energizedCopper, 60)
        )
        craftEffect = Fx.smeltsmoke
        craftTime = 45f
        size = 3
        hasLiquids = false
        itemCapacity = 30
        drawer = DrawMulti(DrawDefault(), DrawFlame(Color.valueOf("ffef99")))
        ambientSound = Sounds.smelter
        ambientSoundVolume = 0.07f
        outputItem = ItemStack(Items.silicon, 6)

        consumeItems(*ItemStack.with(Items.coal, 3, Items.sand, 3, ModItems.energizedCopper, 1))
    }
}