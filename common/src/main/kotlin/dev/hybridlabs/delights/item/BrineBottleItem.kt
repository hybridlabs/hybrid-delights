package dev.hybridlabs.delights.item

import net.minecraft.advancements.triggers.CriteriaTriggers
import net.minecraft.server.level.ServerPlayer
import net.minecraft.stats.Stats
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResult
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
                    entityLiving.drop(itemstack, false, net.minecraft.util.Prediction.PREDICTED)
                }
            }

            return stack
        }
    }

    override fun getUseDuration(stack: ItemStack, entity: LivingEntity): Int {
        return 40
    }

    override fun getUseAnimation(stack: ItemStack): ItemUseAnimation {
        return ItemUseAnimation.DRINK
    }

    override fun use(level: Level, player: Player, hand: InteractionHand): InteractionResult {
        return ItemUtils.startUsingInstantly(level, player, hand)
    }
}
