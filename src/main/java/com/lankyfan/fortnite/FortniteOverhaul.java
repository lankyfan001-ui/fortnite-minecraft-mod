package com.lankyfan.fortnite.init;

import com.lankyfan.fortnite.FortniteOverhaul;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FortniteOverhaul.MOD_ID);

    public static final RegistryObject<CreativeModeTab> FORTNITE_TAB = TABS.register(
            "fortnite_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.fortnite_overhaul.main"))
                    .icon(() -> new ItemStack(ModItems.JONESY_CHESTPLATE.get()))
                    .displayItems((params, output) -> {
                        output.accept(ModItems.JONESY_HELMET.get());
                        output.accept(ModItems.JONESY_CHESTPLATE.get());
                        output.accept(ModItems.JONESY_LEGGINGS.get());
                        output.accept(ModItems.JONESY_BOOTS.get());

                        output.accept(ModItems.PEELY_HELMET.get());
                        output.accept(ModItems.PEELY_CHESTPLATE.get());
                        output.accept(ModItems.PEELY_LEGGINGS.get());
                        output.accept(ModItems.PEELY_BOOTS.get());

                        output.accept(ModItems.DRIFT_HELMET.get());
                        output.accept(ModItems.DRIFT_CHESTPLATE.get());
                        output.accept(ModItems.DRIFT_LEGGINGS.get());
                        output.accept(ModItems.DRIFT_BOOTS.get());

                        output.accept(ModItems.RAVEN_HELMET.get());
                        output.accept(ModItems.RAVEN_CHESTPLATE.get());
                        output.accept(ModItems.RAVEN_LEGGINGS.get());
                        output.accept(ModItems.RAVEN_BOOTS.get());

                        output.accept(ModItems.OMEGA_HELMET.get());
                        output.accept(ModItems.OMEGA_CHESTPLATE.get());
                        output.accept(ModItems.OMEGA_LEGGINGS.get());
                        output.accept(ModItems.OMEGA_BOOTS.get());

                        output.accept(ModItems.GOLD_SHIELD_BACKBLING.get());
                        output.accept(ModItems.BRITE_BAG_BACKBLING.get());
                    })
                    .build()
    );

    public static void register(IEventBus bus) {
        TABS.register(bus);
    }
}
