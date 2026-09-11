package dev.hybridlabs.delights.block.entity

import net.minecraft.core.BlockPos
import net.minecraft.core.Direction
import net.minecraft.core.HolderLookup
import net.minecraft.core.NonNullList
import net.minecraft.nbt.CompoundTag
import net.minecraft.network.chat.Component
import net.minecraft.sounds.SoundEvent
import net.minecraft.sounds.SoundSource
import net.minecraft.world.ContainerHelper
import net.minecraft.world.entity.player.Inventory
import net.minecraft.world.entity.player.Player
import net.minecraft.world.inventory.AbstractContainerMenu
import net.minecraft.world.inventory.ChestMenu
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level
import net.minecraft.world.level.block.entity.ContainerOpenersCounter
import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity
import net.minecraft.world.level.block.state.BlockState
import dev.hybridlabs.delights.block.HybridCabinetBlock
import vectorwing.farmersdelight.common.registry.ModSounds
import vectorwing.farmersdelight.common.utility.TextUtils

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
        return TextUtils.container("Cabinet")
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

    override fun saveAdditional(
        tag: CompoundTag,
        registries: HolderLookup.Provider
    ) {
        super.saveAdditional(tag, registries)

        if (!trySaveLootTable(tag)) {
            ContainerHelper.saveAllItems(tag, contents, registries)
        }
    }

    override fun loadAdditional(
        tag: CompoundTag,
        registries: HolderLookup.Provider
    ) {
        super.loadAdditional(tag, registries)

        contents = NonNullList.withSize(
            containerSize,
            ItemStack.EMPTY
        )

        if (!tryLoadLootTable(tag)) {
            ContainerHelper.loadAllItems(
                tag,
                contents,
                registries
            )
        }
    }

    override fun startOpen(player: Player) {
        if (level != null && !isRemoved && !player.isSpectator) {
            openersCounter.incrementOpeners(
                player,
                level!!,
                blockPos,
                blockState
            )
        }
    }

    override fun stopOpen(player: Player) {
        if (level != null && !isRemoved && !player.isSpectator) {
            openersCounter.decrementOpeners(
                player,
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
        val normal = facing.normal

        val x = blockPos.x + 0.5 + normal.x / 2.0
        val y = blockPos.y + 0.5 + normal.y / 2.0
        val z = blockPos.z + 0.5 + normal.z / 2.0

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