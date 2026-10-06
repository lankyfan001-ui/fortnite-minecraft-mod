package com.lankyfan.fortnite.init;

import com.lankyfan.fortnite.FortniteOverhaul;
import com.lankyfan.fortnite.block.FortniteGlowBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FortniteOverhaul.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FortniteOverhaul.MOD_ID);

    public static final RegistryObject<Block> TILTED_TOWER_BLOCK = registerBlock(
            "tilted_tower_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.5F).sound(SoundType.STONE))
    );

    public static final RegistryObject<Block> LOOT_LAKE_GLOW_BLOCK = registerBlock(
            "loot_lake_glow_block",
            () -> new FortniteGlowBlock(BlockBehaviour.Properties.of().strength(1.8F).sound(SoundType.GLASS).lightLevel(state -> 12))
    );

    public static final RegistryObject<Block> PLEASANT_PARK_BLOCK = registerBlock(
            "pleasant_park_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.0F).sound(SoundType.WOOD))
    );

    public static final RegistryObject<Block> SHIFTY_SHAFTS_BLOCK = registerBlock(
            "shifty_shafts_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(2.2F).sound(SoundType.METAL))
    );

    public static final RegistryObject<Block> POI_MARKER_BLOCK = registerBlock(
            "poi_marker_block",
            () -> new FortniteGlowBlock(BlockBehaviour.Properties.of().strength(1.5F).sound(SoundType.GLASS).lightLevel(state -> 15))
    );

    public static final RegistryObject<Block> BATTLE_PASS_SIGN_BLOCK = registerBlock(
            "battle_pass_sign_block",
            () -> new FortniteGlowBlock(BlockBehaviour.Properties.of().strength(1.2F).sound(SoundType.METAL).lightLevel(state -> 10))
    );

    private static <T extends Block> RegistryObject<T> registerBlock(String name, java.util.function.Supplier<T> supplier) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
        return block;
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
