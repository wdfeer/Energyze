package energyze

import energyze.blocks.*
import energyze.blocks.energizers.CoalEnergizer
import energyze.blocks.energizers.CopperEnergizer
import energyze.blocks.energizers.ThoriumEnergizer
import energyze.blocks.EnergizedSiliconCrucible
import energyze.blocks.turrets.*
import energyze.blocks.walls.EnergizedWalls

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
        EnergizedLancer()
        NuclearDuo()
        NuclearHail()
        NuclearSegment()
        NuclearLancer()

        EnergizedWalls
    }
}