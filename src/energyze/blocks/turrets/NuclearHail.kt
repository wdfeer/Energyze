package energyze.blocks.turrets

import arc.struct.ObjectMap
import energyze.ModItems
import mindustry.content.Blocks
import mindustry.content.Fx
import mindustry.content.Items
import mindustry.entities.bullet.ArtilleryBulletType
import mindustry.entities.bullet.BulletType
import mindustry.gen.Sounds
import mindustry.type.Category
import mindustry.type.Item
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.ItemTurret

class NuclearHail : ItemTurret("nuclear-hail") {
    init {
        val foreshadow = Blocks.foreshadow as ItemTurret

        requirements(Category.turret, ItemStack.with(ModItems.energizedCopper, 360, Items.metaglass, 250, ModItems.energizedThorium, 200, Items.surgeAlloy, 120))
        ammoTypes = ObjectMap<Item, BulletType>().apply {
            put(ModItems.energizedThorium, getEnergizedThoriumBullet())
        }
        targetAir = false
        recoil = 2f
        shootCone = 1f
        scaledHealth = 400f
        shootSound = Sounds.mediumCannon
        limitRange(0f)

        reload = foreshadow.reload * 2.5f
        range = foreshadow.range * 0.8f
        size = 2
        ammoPerShot = 10

        consumePower(6f)
        coolantMultiplier = 0.6f
        coolant = consumeCoolant(0.5f)
    }

    private fun getEnergizedThoriumBullet(): ArtilleryBulletType {
        return ArtilleryBulletType(1.5f, 80f).apply {
            knockback = 1.6f
            lifetime = 160f
            width = 18f.also { height = it }
            collidesTiles = false
            splashDamageRadius = 100f
            splashDamage = 130f

            hitEffect = Fx.blastExplosion

            lightning = 6
            lightningLength = 11
            lightningDamage = 30f
        }
    }
}