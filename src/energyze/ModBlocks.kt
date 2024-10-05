package energyze

import energyze.blocks.CopperDischarger
import energyze.blocks.CopperEnergizer
import energyze.blocks.EnergizedDuo

object ModBlocks {
    init {
        CopperEnergizer()
        CopperDischarger()

        EnergizedDuo()
    }
}