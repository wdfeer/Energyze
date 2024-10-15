package energyze

import energyze.items.EnergizedCoal
import energyze.items.EnergizedCopper
import energyze.items.EnergizedThorium

object ModItems {
    val energizedCoal = EnergizedCoal()
    val energizedCopper = EnergizedCopper()
    val energizedThorium = EnergizedThorium()

    fun initAmmo() {
        energizedCopper.addAmmo()
        energizedCoal.addAmmo()
        energizedThorium.addAmmo()
    }
}