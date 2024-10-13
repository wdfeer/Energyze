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

        requirements(Category.turret, ItemStack.with(ModItems.energizedCopper, 360, Items.metaglass, 250, Items.thorium, 200, Items.surgeAlloy, 120))
        ammoTypes = getAmmo()
        targetAir = false
        recoil = 2f
        shootCone = 1f
        scaledHealth = 320f
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

    private fun getAmmo(): ObjectMap<Item, BulletType> = ObjectMap<Item, BulletType>().apply {
        put(Items.phaseFabric, ArtilleryBulletType(2f, 60f).apply {
            knockback = 1.6f
            lifetime = 160f
            width = 21f.also { height = it }
            collidesTiles = false
            splashDamageRadius = 200f
            splashDamage = 100f

            hitEffect = Fx.blastExplosion

            lightning = 7
            lightningLength = 22
            lightningDamage = 11f
        })

        put(ModItems.energizedThorium, ArtilleryBulletType(1.5f, 80f).apply {
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
        })
    }
}