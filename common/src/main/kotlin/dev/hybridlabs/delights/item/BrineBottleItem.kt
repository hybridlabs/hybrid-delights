package dev.hybridlabs.delights.item

import net.minecraft.advancements.CriteriaTriggers
import net.minecraft.server.level.ServerPlayer
import net.minecraft.sounds.SoundEvent
import net.minecraft.sounds.SoundEvents
import net.minecraft.stats.Stats
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResultHolder
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.*
import net.minecraft.world.level.Level

class BrineBottleItem(properties: Properties) : Item(properties) {
    override fun finishUsingItem(stack: ItemStack, level: Level, entityLiving: LivingEntity): ItemStack {
        super.finishUsingItem(stack, level, entityLiving)
        if (entityLiving is ServerPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger(entityLiving, stack)
            entityLiving.awardStat(Stats.ITEM_USED.get(this))
        }

        if (stack.isEmpty) {
            return ItemStack(Items.GLASS_BOTTLE)
        } else {
            if (entityLiving is Player && !entityLiving.abilities.instabuild) {
                val itemstack = ItemStack(Items.GLASS_BOTTLE)
                if (!entityLiving.inventory.add(itemstack)) {
                    entityLiving.drop(itemstack, false)
                }
            }

            return stack
        }
    }

    override fun getUseDuration(stack: ItemStack): Int {
        return 40
    }

    override fun getUseAnimation(stack: ItemStack): UseAnim {
        return UseAnim.DRINK
    }

    override fun getDrinkingSound(): SoundEvent {
        return SoundEvents.GENERIC_DRINK
    }

    override fun getEatingSound(): SoundEvent {
        return SoundEvents.GENERIC_DRINK
    }

    override fun use(level: Level, player: Player, hand: InteractionHand): InteractionResultHolder<ItemStack?> {
        return ItemUtils.startUsingInstantly(level, player, hand)
    }
}