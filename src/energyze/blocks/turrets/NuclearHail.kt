package energyze.blocks.turrets

import arc.struct.ObjectMap
import energyze.ModItems
import mindustry.content.Blocks
import mindustry.content.Items
import mindustry.entities.bullet.ArtilleryBulletType
import mindustry.entities.bullet.BulletType
import mindustry.entities.effect.ExplosionEffect
import mindustry.gen.Sounds
import mindustry.graphics.Pal
import mindustry.type.Category
import mindustry.type.Item
import mindustry.type.ItemStack
import mindustry.world.blocks.defense.turrets.ItemTurret

class NuclearHail : ItemTurret("nuclear-hail") {
    init {
        val foreshadow = Blocks.foreshadow as ItemTurret

        requirements(Category.turret, ItemStack.with(ModItems.energizedCopper, 360, Items.metaglass, 250, Items.thorium, 200, Items.surgeAlloy, 120))
        ammoTypes = getAmmo()
        targetAir = false
        recoil = 2f
        shootCone = 1f
        scaledHealth = 320f
        shootSound = Sounds.mediumCannon
        limitRange(0f)

        reload = foreshadow.reload * 2f
        range = foreshadow.range * 0.8f
        size = 2
        ammoPerShot = 10

        consumePower(6f)
        coolantMultiplier = 0.6f
        coolant = consumeCoolant(0.5f)
    }

    private fun getAmmo(): ObjectMap<Item, BulletType> = ObjectMap<Item, BulletType>().apply {
        put(Items.phaseFabric, ArtilleryBulletType(2f, 120f).apply {
            knockback = 1.6f
            lifetime = 160f
            width = 20f.also { height = it }
            collidesTiles = false
            splashDamageRadius = 160f
            splashDamage = 120f

            hitEffect = ExplosionEffect().apply {
                waveColor = Pal.surge
                waveRad = splashDamageRadius
                waveStroke = 8f
            }

            reloadMultiplier = 1.5f
        })

        put(ModItems.energizedThorium, ArtilleryBulletType(1.5f, 200f).apply {
            knockback = 1.6f
            lifetime = 160f
            width = 20f.also { height = it }
            collidesTiles = false
            splashDamageRadius = 100f
            splashDamage = 200f

            hitEffect = ExplosionEffect().apply {
                waveColor = Pal.surge
                waveRad = splashDamageRadius
                waveStroke = 6f
            }

            lightning = 6
            lightningLength = 11
            lightningDamage = 30f
        })
    }
}