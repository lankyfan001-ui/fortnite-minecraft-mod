package com.lankyfan.fortnite.worldgen;

import com.lankyfan.fortnite.FortniteOverhaul;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModWorldGen {
    public static final DeferredRegister<Feature<?>> FEATURES =
            DeferredRegister.create(Registries.FEATURE, FortniteOverhaul.MOD_ID);

    public static final RegistryObject<Feature<NoneFeatureConfiguration>> FORTNITE_POI =
            FEATURES.register("fortnite_poi", FortnitePOIFeature::new);

    public static void register(IEventBus bus) {
        FEATURES.register(bus);
    }
}
