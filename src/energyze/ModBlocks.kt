package energyze

import energyze.blocks.*

object ModBlocks {
    init {
        // Factories
        CoalEnergizer()
        CopperEnergizer()
        EnergizedSiliconCrucible()

        // Power gen
        Discharger()

        // Turrets
        EnergizedDuo()
        EnergizedScorch()
        EnergizedHail()
    }
}