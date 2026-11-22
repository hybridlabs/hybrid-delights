package dev.hybridlabs.delights.block.entity

import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.core.NonNullList
import net.minecraft.network.chat.Component
import net.minecraft.sounds.SoundEvent
import net.minecraft.sounds.SoundSource
import net.minecraft.world.ContainerHelper
import net.minecraft.world.entity.player.Inventory
import net.minecraft.world.entity.ContainerUser
import net.minecraft.world.entity.LivingEntity
import net.minecraft.world.entity.player.Player
import net.minecraft.world.inventory.AbstractContainerMenu
import net.minecraft.world.inventory.ChestMenu
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level
import net.minecraft.world.level.storage.ValueInput
import net.minecraft.world.level.storage.ValueOutput
import net.minecraft.world.level.block.entity.ContainerOpenersCounter
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity
import net.minecraft.world.level.block.state.BlockState
import dev.hybridlabs.delights.block.HybridCabinetBlock
import vectorwing.farmersdelight.common.registry.ModSounds

class HybridCabinetBlockEntity(
    pos: BlockPos,
    state: BlockState
) : RandomizableContainerBlockEntity(
    HDBlockEntityTypes.CABINET.get(),
    pos,
    state
) {

    private var contents: NonNullList<ItemStack> =
        NonNullList.withSize(27, ItemStack.EMPTY)

    private val openersCounter = object : ContainerOpenersCounter() {

        override fun onOpen(
            level: Level,
            pos: BlockPos,
            state: BlockState
        ) {
            this@HybridCabinetBlockEntity.playSound(
                state,
                ModSounds.BLOCK_CABINET_OPEN.get()
            )

            this@HybridCabinetBlockEntity.updateBlockState(state, true)
        }

        override fun onClose(
            level: Level,
            pos: BlockPos,
            state: BlockState
        ) {
            this@HybridCabinetBlockEntity.playSound(
                state,
                ModSounds.BLOCK_CABINET_CLOSE.get()
            )

            this@HybridCabinetBlockEntity.updateBlockState(state, false)
        }

        override fun openerCountChanged(
            level: Level,
            pos: BlockPos,
            state: BlockState,
            oldCount: Int,
            newCount: Int
        ) {
        }

        override fun isOwnContainer(player: Player): Boolean {
            val menu = player.containerMenu

            return menu is ChestMenu &&
                    menu.container === this@HybridCabinetBlockEntity
        }
    }

    override fun getDefaultName(): Component {
        return Component.translatable("container.hybrid_delights.cabinet")
    }

    override fun getItems(): NonNullList<ItemStack> {
        return contents
    }

    override fun setItems(items: NonNullList<ItemStack>) {
        contents = items
    }

    override fun getContainerSize(): Int {
        return 27
    }

    override fun createMenu(
        id: Int,
        player: Inventory
    ): AbstractContainerMenu {
        return ChestMenu.threeRows(id, player, this)
    }

    override fun saveAdditional(output: ValueOutput) {
        super.saveAdditional(output)

        if (!trySaveLootTable(output)) {
            ContainerHelper.saveAllItems(output, contents)
        }
    }

    override fun loadAdditional(input: ValueInput) {
        super.loadAdditional(input)

        contents = NonNullList.withSize(
            containerSize,
            ItemStack.EMPTY
        )

        if (!tryLoadLootTable(input)) {
            ContainerHelper.loadAllItems(input, contents)
        }
    }

    override fun startOpen(user: ContainerUser) {
        if (level != null && !isRemoved && user is LivingEntity && !user.isSpectator) {
            openersCounter.incrementOpeners(
                user,
                level!!,
                blockPos,
                blockState,
                user.containerInteractionRange
            )
        }
    }

    override fun stopOpen(user: ContainerUser) {
        if (level != null && !isRemoved && user is LivingEntity && !user.isSpectator) {
            openersCounter.decrementOpeners(
                user,
                level!!,
                blockPos,
                blockState
            )
        }
    }

    fun recheckOpen() {
        if (level != null && !isRemoved) {
            openersCounter.recheckOpeners(
                level!!,
                blockPos,
                blockState
            )
        }
    }

    private fun updateBlockState(
        state: BlockState,
        open: Boolean
    ) {
        level?.setBlock(
            blockPos,
            state.setValue(HybridCabinetBlock.OPEN, open),
            3
        )
    }

    private fun playSound(
        state: BlockState,
        sound: SoundEvent
    ) {
        val level = level ?: return

        val facing = state.getValue(HybridCabinetBlock.FACING)

        val x = blockPos.x + 0.5 + facing.stepX / 2.0
        val y = blockPos.y + 0.5 + facing.stepY / 2.0
        val z = blockPos.z + 0.5 + facing.stepZ / 2.0

        level.playSound(
            null,
            x,
            y,
            z,
            sound,
            SoundSource.BLOCKS,
            0.5f,
            level.random.nextFloat() * 0.1f + 0.9f
        )
    }
}