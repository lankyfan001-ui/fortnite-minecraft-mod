package com.lankyfan.fortnite.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class FortniteGlowBlock extends Block {
    public FortniteGlowBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getLightEmission(BlockState state, BlockGetter level, BlockPos pos) {
        return 12;
    }
}
