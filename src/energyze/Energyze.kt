package energyze

import mindustry.mod.Mod

class Energyze : Mod(){
    override fun loadContent() {
        ModItems
        ModBlocks

        ModItems.energizedCopper.addAmmo()
        ModItems.energizedCoal.addAmmo()
    }
}
