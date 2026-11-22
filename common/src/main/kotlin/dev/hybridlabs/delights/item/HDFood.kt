package dev.hybridlabs.delights.item

import net.minecraft.sounds.SoundEvents
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.food.FoodProperties
import net.minecraft.world.item.Item
import net.minecraft.world.item.ItemUseAnimation
import net.minecraft.world.item.component.Consumable
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect

/**
 * Builds the two components food needs since 1.21.11: the nutrition values stay on
 * [FoodProperties], while the animation, sound, eating speed and on-consume effects live on
 * [Consumable].
 */
fun Item.Properties.hdFood(
    nutrition: Int,
    saturation: Float,
    fast: Boolean = false,
    effect: MobEffectInstance? = null,
    chance: Float = 1.0f,
    drink: Boolean = false,
): Item.Properties {
    val food = FoodProperties.Builder()
        .nutrition(nutrition)
        .saturationModifier(saturation)
        .build()

    if (effect == null && !fast && !drink) {
        return this.food(food)
    }

    val consumable = Consumable.builder()
        .consumeSeconds(if (fast) 0.8f else 2.0f)
        .animation(if (drink) ItemUseAnimation.DRINK else ItemUseAnimation.EAT)
        .sound(if (drink) SoundEvents.GENERIC_DRINK else SoundEvents.GENERIC_EAT)

    if (effect != null) {
        consumable.onConsume(ApplyStatusEffectsConsumeEffect(effect, chance))
    }

    return this.food(food, consumable.build())
}
