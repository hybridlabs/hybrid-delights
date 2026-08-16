package dev.hybridlabs.delights.data.server.loot

import dev.hybridlabs.aquatic.entity.HAEntityTypes
import dev.hybridlabs.aquatic.item.HAItems
import dev.hybridlabs.delights.item.HDItems
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider
import net.minecraft.advancements.critereon.EntityFlagsPredicate
import net.minecraft.advancements.critereon.EntityPredicate
import net.minecraft.core.HolderLookup
import net.minecraft.resources.ResourceKey
import net.minecraft.world.level.storage.loot.LootPool
import net.minecraft.world.level.storage.loot.LootTable
import net.minecraft.world.level.storage.loot.entries.LootItem
import net.minecraft.world.level.storage.loot.functions.EnchantedCountIncreaseFunction
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator
import java.util.concurrent.CompletableFuture
import java.util.function.BiConsumer

/**
 * Generates entity loot tables.
 */
class EntityTypeLootTableProvider(exporter: FabricDataOutput, val lookupProvider: CompletableFuture<HolderLookup.Provider>) :
    SimpleFabricLootTableProvider(exporter, lookupProvider, LootContextParamSets.ENTITY) {
    override fun generate(exporter: BiConsumer<ResourceKey<LootTable>, LootTable.Builder>) {
        val lookup = lookupProvider.join()

        export(exporter, HAEntityTypes.MOON_JELLYFISH.get().defaultLootTable){
            pool(
                LootPool.lootPool()
                    .add(
                        LootItem.lootTableItem(HDItems.JELLY.get())
                            .apply(EnchantedCountIncreaseFunction.lootingMultiplier(lookup,UniformGenerator.between(0.0F, 1.0F)))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                    ).build()
            )
        }

        export(exporter, HAEntityTypes.SEA_NETTLE.get().defaultLootTable){
            pool(
                LootPool.lootPool()
                    .add(
                        LootItem.lootTableItem(HDItems.JELLY.get())
                            .apply(EnchantedCountIncreaseFunction.lootingMultiplier(lookup,UniformGenerator.between(0.0F, 1.0F)))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                    ).build()
            )
        }

        export(exporter, HAEntityTypes.NOMURA_JELLYFISH.get().defaultLootTable){
            pool(
                LootPool.lootPool()
                    .add(
                        LootItem.lootTableItem(HDItems.JELLY.get())
                            .apply(EnchantedCountIncreaseFunction.lootingMultiplier(lookup,UniformGenerator.between(0.0F, 1.0F)))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                    ).build()
            )
        }

        export(exporter, HAEntityTypes.LIONS_MANE_JELLYFISH.get().defaultLootTable){
            pool(
                LootPool.lootPool()
                    .add(
                        LootItem.lootTableItem(HDItems.JELLY.get())
                            .apply(EnchantedCountIncreaseFunction.lootingMultiplier(lookup,UniformGenerator.between(0.0F, 1.0F)))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                    ).build()
            )
        }

        export(exporter, HAEntityTypes.BLUE_JELLYFISH.get().defaultLootTable){
            pool(
                LootPool.lootPool()
                    .add(
                        LootItem.lootTableItem(HDItems.JELLY.get())
                            .apply(EnchantedCountIncreaseFunction.lootingMultiplier(lookup,UniformGenerator.between(0.0F, 1.0F)))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                    ).build()
            )
        }


        export(exporter, HAEntityTypes.BARREL_JELLYFISH.get().defaultLootTable){
            pool(
                LootPool.lootPool()
                    .add(
                        LootItem.lootTableItem(HDItems.JELLY.get())
                            .apply(EnchantedCountIncreaseFunction.lootingMultiplier(lookup,UniformGenerator.between(0.0F, 1.0F)))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                    ).build()
            )
        }

        export(exporter, HAEntityTypes.MAUVE_STINGER.get().defaultLootTable){
            pool(
                LootPool.lootPool()
                    .add(
                        LootItem.lootTableItem(HDItems.JELLY.get())
                            .apply(EnchantedCountIncreaseFunction.lootingMultiplier(lookup,UniformGenerator.between(0.0F, 1.0F)))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                    ).build()
            )
        }

        export(exporter, HAEntityTypes.CEPHEIDAE_JELLYFISH.get().defaultLootTable){
            pool(
                LootPool.lootPool()
                    .add(
                        LootItem.lootTableItem(HDItems.JELLY.get())
                            .apply(EnchantedCountIncreaseFunction.lootingMultiplier(lookup,UniformGenerator.between(0.0F, 1.0F)))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                    ).build()
            )
        }

        export(exporter, HAEntityTypes.CROWN_JELLYFISH.get().defaultLootTable){
            pool(
                LootPool.lootPool()
                    .add(
                        LootItem.lootTableItem(HAItems.GLOWSLIME.get())
                            .apply(EnchantedCountIncreaseFunction.lootingMultiplier(lookup,UniformGenerator.between(0.0F, 1.0F)))
                            .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                    ).build()
            )
        }
    }

    /**
     * Exports a loot table for [entityType] to [exporter] using its loot table id.
     */
    private fun export(
        exporter: BiConsumer<ResourceKey<LootTable>, LootTable.Builder>,
        entityTable: ResourceKey<LootTable>,
        builder: LootTable.Builder.() -> Unit
    ) {
        exporter.accept(entityTable, LootTable.lootTable().apply(builder))
    }

    companion object {
        private val NEEDS_ENTITY_ON_FIRE: EntityPredicate.Builder =
            EntityPredicate.Builder.entity().flags(EntityFlagsPredicate.Builder.flags().setOnFire(true))
    }
}
