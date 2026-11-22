package dev.hybridlabs.delights.item

import dev.hybridlabs.hapi.item.HAPIToolMaterials
import dev.hybridlabs.delights.HybridDelightsCommon
import dev.hybridlabs.delights.item.HDItemProperties
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.item.Item
import net.minecraft.world.item.Items
import java.util.function.Supplier

object HDItems {

    val BRINE_BOTTLE = register(
        "brine_bottle"
    ) {
        BrineBottleItem(
            HDItemProperties.props()
                .hdFood(0, 0.0f, effect = MobEffectInstance(MobEffects.POISON, 300, 0), chance = 1.0f, drink = true)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val SALT = register(
        "salt"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(2, 0.3f)
        )
    }

    val SALTED_COD = register(
        "salted_cod"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(3, 0.3f, fast = true)
        )
    }

    val SALTED_COD_SLICE = register(
        "salted_cod_slice"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(2, 0.3f, fast = true)
        )
    }

    val SALTED_SALMON = register(
        "salted_salmon"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(3, 0.3f, fast = true)
        )
    }

    val SALTED_SALMON_SLICE = register(
        "salted_salmon_slice"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(2, 0.3f, fast = true)
        )
    }

    val CORAL_KNIFE = register(
        "coral_knife"
    ) {
        Item(HDItemProperties.props().sword(HAPIToolMaterials.CORAL, 0.5f, -2.0f))
    }

    val SHARK_TOOTH_KNIFE = register(
        "shark_tooth_knife"
    ) {
        Item(HDItemProperties.props().sword(HAPIToolMaterials.SEASHELL, 0.5f, -2.0f))
    }

    val PICKLED_HERRING = register(
        "pickled_herring"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(6, 0.6f, drink = true)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val PICKLED_BULL_KELP = register(
        "pickled_bull_kelp"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(6, 0.6f, drink = true)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val FISH_GELATIN = register(
        "fish_gelatin"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(1, 0.2f)
        )
    }

    val COD_ROE = register(
        "cod_roe"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(2, 0.4f)
                .stacksTo(16)
        )
    }

    val CURED_COD_ROE = register(
        "cured_cod_roe"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(4, 0.6f, fast = true)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val SALMON_ROE = register(
        "salmon_roe"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(2, 0.4f)
                .stacksTo(16)
        )
    }

    val CURED_SALMON_ROE = register(
        "cured_salmon_roe"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(4, 0.6f, fast = true)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val TROPICAL_FISH_ROE = register(
        "tropical_fish_roe"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(2, 0.4f)
                .stacksTo(16)
        )
    }

    val CURED_TROPICAL_FISH_ROE = register(
        "cured_tropical_fish_roe"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(4, 0.6f, fast = true)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val CARP_ROE = register(
        "carp_roe"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(2, 0.4f)
                .stacksTo(16)
        )
    }

    val CURED_CARP_ROE = register(
        "cured_carp_roe"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(4, 0.6f, fast = true)
                .craftRemainder(Items.GLASS_BOTTLE)
                .stacksTo(16)
        )
    }

    val CAVIAR_TOAST = register(
        "caviar_toast"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(8, 0.8f, fast = true)
                .stacksTo(16)
        )
    }

    val RAY_WING = register(
        "ray_wing"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(2, 0.1f)
        )
    }

    val COOKED_RAY_WING = register(
        "cooked_ray_wing"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(6, 0.8f)
        )
    }

    val SALTED_RAY_WING = register(
        "salted_ray_wing"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(3, 0.3f, fast = true)
        )
    }

    val PUFFERFISH_SLICE = register(
        "pufferfish_slice"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(1, 0.1f, effect = MobEffectInstance(MobEffects.POISON, 300, 0), chance = 0.25f)
        )
    }

    val COOKED_PUFFERFISH_SLICE = register(
        "cooked_pufferfish_slice"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(3, 0.8f)
        )
    }

    val SALTED_PUFFERFISH_SLICE = register(
        "salted_pufferfish_slice"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(2, 0.3f, fast = true)
        )
    }

    val CRAB_CAKE = register(
        "crab_cake"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(3, 0.8f)
        )
    }

    val CRAB_RANGOON = register(
        "crab_rangoon"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(3, 0.8f, fast = true)
        )
    }

    val BISQUE = register(
        "bisque"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(12, 0.8f)
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
        )
    }

    val SHRIMP_FRIED_RICE = register(
        "shrimp_fried_rice"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(12, 0.8f)
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
        )
    }

    val LOBSTER_STEW = register(
        "lobster_stew"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(12, 0.8f)
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
        )
    }


    val CHOWDER = register(
        "chowder",
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(12, 0.8f)
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
        )
    }

    val TUNA_SANDWICH = register(
        "tuna_sandwich"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(10, 0.8f)
        )
    }

    val TUNA_NACHOS = register(
        "tuna_nachos"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(10, 0.8f)
                .stacksTo(16)
        )
    }

    val TUNA_CASSEROLE = register(
        "tuna_casserole"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(14, 0.75f)
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
        )
    }

    val TUNA_SALAD = register(
        "tuna_salad"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(8, 0.95f)
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
        )
    }

    val FISHERMANS_SOUP = register(
        "fishermans_soup"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(12, 0.8f)
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
        )
    }

    val EEL_NOODLES = register(
        "eel_noodles"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(14, 0.75f)
                .craftRemainder(Items.BOWL)
                .stacksTo(16)
        )
    }

    val FISHERMANS_PIE = register(
        "fishermans_pie"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(14, 0.75f)
                .stacksTo(1)
        )
    }

    val JELLIED_CARP = register(
        "jellied_carp",
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(14, 0.75f)
                .stacksTo(16)
        )
    }

    val MASGOUF = register(
        "masgouf",
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(14, 0.75f)
                .stacksTo(16)
        )
    }

    val FISH_KEBAB = register(
        "fish_kebab"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(10, 1.0f)
                .stacksTo(16)
        )
    }

    val FISH_N_CHIPS = register(
        "fish_n_chips"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(10, 1.0f)
                .stacksTo(16)
        )
    }

    val TUNA_ROLL = register(
        "tuna_roll",
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(7, 0.6f)
        )
    }

    val BAKED_STUFFED_LOBSTER = register(
        "baked_stuffed_lobster",
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(14, 0.75f)
                .stacksTo(16)
        )
    }


    //#region Hybrid Birds items
    val SUNFLOWER_OIL = register(
        "sunflower_oil"
    ) {
        Item(
            HDItemProperties.props()
        )
    }

    val CHICKEN_NUGGET = register(
        "chicken_nugget"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(4, 0.6f, fast = true)
        )
    }

    val FRIED_CHICKEN = register(
        "fried_chicken"
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(6, 0.8f)
        )
    }

    val MOSTLY_EATEN_BUCKET_OF_CHICKEN = register(
        "mostly_eaten_bucket_of_chicken",
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(8, 0.2f)
                .usingConvertsTo(Items.BUCKET)
                .stacksTo(1)
        )
    }

    val PARTIALLY_EATEN_BUCKET_OF_CHICKEN = register(
        "partially_eaten_bucket_of_chicken",
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(8, 0.4f)
                .usingConvertsTo(MOSTLY_EATEN_BUCKET_OF_CHICKEN.get())
                .stacksTo(1)
        )
    }

    val BUCKET_OF_CHICKEN = register(
        "bucket_of_chicken",
    ) {
        Item(
            HDItemProperties.props()
                .hdFood(8, 0.6f)
                .usingConvertsTo(PARTIALLY_EATEN_BUCKET_OF_CHICKEN.get())
                .stacksTo(1)
        )
    }
    //#endregion

    private fun register(id: String, item: Supplier<Item>): Supplier<Item> {
        return HybridDelightsCommon.ITEMS.register(id) { HDItemProperties.withId(id, item::get) }
    }
}
