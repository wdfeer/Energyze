package energyze

import energyze.blocks.*
import energyze.blocks.energizers.CoalEnergizer
import energyze.blocks.energizers.CopperEnergizer
import energyze.blocks.energizers.ThoriumEnergizer
import energyze.blocks.EnergizedSiliconCrucible
import energyze.blocks.turrets.*
import energyze.blocks.walls.EnergizedCopperWall
import energyze.blocks.walls.EnergizedCopperWallLarge

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
        NuclearSegment()
        NuclearHail()
    }

    val energizedCopperWall = EnergizedCopperWall()
    val energizedCopperWallLarge = EnergizedCopperWallLarge()
}