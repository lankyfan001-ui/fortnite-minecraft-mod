package com.lankyfan.fortnite.worldgen;

import com.lankyfan.fortnite.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class FortnitePOIFeature extends Feature<NoneFeatureConfiguration> {
    public FortnitePOIFeature() {
        super(NoneFeatureConfiguration.CODEC);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        WorldGenLevel level = context.level();
        BlockPos origin = context.origin();

        for (int x = -2; x <= 2; x++) {
            for (int z = -2; z <= 2; z++) {
                for (int y = 0; y <= 3; y++) {
                    BlockPos pos = origin.offset(x, y, z);
                    if (Math.abs(x) + Math.abs(z) <= 4) {
                        level.setBlock(pos, ModBlocks.TILTED_TOWER_BLOCK.get().defaultBlockState(), 3);
                    }
                }
            }
        }

        BlockPos core = origin.above(3);
        level.setBlock(core, ModBlocks.POI_MARKER_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(core.north(), ModBlocks.LOOT_LAKE_GLOW_BLOCK.get().defaultBlockState(), 3);
        level.setBlock(core.south(), ModBlocks.BATTLE_PASS_SIGN_BLOCK.get().defaultBlockState(), 3);
        return true;
    }
}
