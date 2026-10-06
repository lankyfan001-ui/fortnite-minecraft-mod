package com.lankyfan.fortnite.init;

import com.lankyfan.fortnite.FortniteOverhaul;
import com.lankyfan.fortnite.item.FortniteArmorItem;
import com.lankyfan.fortnite.item.FortniteArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FortniteOverhaul.MOD_ID);

    public static final RegistryObject<Item> JONESY_HELMET = ITEMS.register(
            "jonesy_helmet",
            () -> new FortniteArmorItem(FortniteArmorMaterials.JONESY, ArmorItem.Type.HELMET, new Item.Properties())
    );
    public static final RegistryObject<Item> JONESY_CHESTPLATE = ITEMS.register(
            "jonesy_chestplate",
            () -> new FortniteArmorItem(FortniteArmorMaterials.JONESY, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    public static final RegistryObject<Item> JONESY_LEGGINGS = ITEMS.register(
            "jonesy_leggings",
            () -> new FortniteArmorItem(FortniteArmorMaterials.JONESY, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    public static final RegistryObject<Item> JONESY_BOOTS = ITEMS.register(
            "jonesy_boots",
            () -> new FortniteArmorItem(FortniteArmorMaterials.JONESY, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    public static final RegistryObject<Item> PEELY_HELMET = ITEMS.register(
            "peely_helmet",
            () -> new FortniteArmorItem(FortniteArmorMaterials.PEELY, ArmorItem.Type.HELMET, new Item.Properties())
    );
    public static final RegistryObject<Item> PEELY_CHESTPLATE = ITEMS.register(
            "peely_chestplate",
            () -> new FortniteArmorItem(FortniteArmorMaterials.PEELY, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    public static final RegistryObject<Item> PEELY_LEGGINGS = ITEMS.register(
            "peely_leggings",
            () -> new FortniteArmorItem(FortniteArmorMaterials.PEELY, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    public static final RegistryObject<Item> PEELY_BOOTS = ITEMS.register(
            "peely_boots",
            () -> new FortniteArmorItem(FortniteArmorMaterials.PEELY, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    public static final RegistryObject<Item> DRIFT_HELMET = ITEMS.register(
            "drift_helmet",
            () -> new FortniteArmorItem(FortniteArmorMaterials.DRIFT, ArmorItem.Type.HELMET, new Item.Properties())
    );
    public static final RegistryObject<Item> DRIFT_CHESTPLATE = ITEMS.register(
            "drift_chestplate",
            () -> new FortniteArmorItem(FortniteArmorMaterials.DRIFT, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    public static final RegistryObject<Item> DRIFT_LEGGINGS = ITEMS.register(
            "drift_leggings",
            () -> new FortniteArmorItem(FortniteArmorMaterials.DRIFT, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    public static final RegistryObject<Item> DRIFT_BOOTS = ITEMS.register(
            "drift_boots",
            () -> new FortniteArmorItem(FortniteArmorMaterials.DRIFT, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    public static final RegistryObject<Item> RAVEN_HELMET = ITEMS.register(
            "raven_helmet",
            () -> new FortniteArmorItem(FortniteArmorMaterials.RAVEN, ArmorItem.Type.HELMET, new Item.Properties())
    );
    public static final RegistryObject<Item> RAVEN_CHESTPLATE = ITEMS.register(
            "raven_chestplate",
            () -> new FortniteArmorItem(FortniteArmorMaterials.RAVEN, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    public static final RegistryObject<Item> RAVEN_LEGGINGS = ITEMS.register(
            "raven_leggings",
            () -> new FortniteArmorItem(FortniteArmorMaterials.RAVEN, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    public static final RegistryObject<Item> RAVEN_BOOTS = ITEMS.register(
            "raven_boots",
            () -> new FortniteArmorItem(FortniteArmorMaterials.RAVEN, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    public static final RegistryObject<Item> OMEGA_HELMET = ITEMS.register(
            "omega_helmet",
            () -> new FortniteArmorItem(FortniteArmorMaterials.OMEGA, ArmorItem.Type.HELMET, new Item.Properties())
    );
    public static final RegistryObject<Item> OMEGA_CHESTPLATE = ITEMS.register(
            "omega_chestplate",
            () -> new FortniteArmorItem(FortniteArmorMaterials.OMEGA, ArmorItem.Type.CHESTPLATE, new Item.Properties())
    );
    public static final RegistryObject<Item> OMEGA_LEGGINGS = ITEMS.register(
            "omega_leggings",
            () -> new FortniteArmorItem(FortniteArmorMaterials.OMEGA, ArmorItem.Type.LEGGINGS, new Item.Properties())
    );
    public static final RegistryObject<Item> OMEGA_BOOTS = ITEMS.register(
            "omega_boots",
            () -> new FortniteArmorItem(FortniteArmorMaterials.OMEGA, ArmorItem.Type.BOOTS, new Item.Properties())
    );

    public static final RegistryObject<Item> GOLD_SHIELD_BACKBLING = ITEMS.register(
            "gold_shield_backbling",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> BRITE_BAG_BACKBLING = ITEMS.register(
            "brite_bag_backbling",
            () -> new Item(new Item.Properties())
    );

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
