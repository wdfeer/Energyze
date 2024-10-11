package energyze

import energyze.blocks.*
import energyze.blocks.energizers.CoalEnergizer
import energyze.blocks.energizers.CopperEnergizer
import energyze.blocks.energizers.ThoriumEnergizer
import energyze.blocks.turrets.EnergizedDuo
import energyze.blocks.turrets.EnergizedHail
import energyze.blocks.turrets.EnergizedScorch
import energyze.blocks.turrets.EnergizedSiliconCrucible

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