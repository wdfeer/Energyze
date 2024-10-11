package energyze

import energyze.blocks.*

object ModBlocks {
    init {
        // Factories
        CoalEnergizer()
        CopperEnergizer()
        ThoriumEnergizer()
        EnergizedSiliconCrucible()

        // Power gen
        Discharger()

        // Turrets
        EnergizedDuo()
        EnergizedScorch()
        EnergizedHail()
    }
}