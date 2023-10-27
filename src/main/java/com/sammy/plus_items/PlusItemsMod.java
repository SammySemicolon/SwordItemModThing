package com.sammy.plus_items;

import net.minecraft.resources.*;
import net.minecraft.world.item.*;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;

@Mod(PlusItemsMod.MODID)
public class PlusItemsMod {
    public static final String MODID = "plus_items";

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> COOL_SWORD = ITEMS.register("seikkan_sword", () -> new CoolSwordItem(new Item.Properties().stacksTo(1)));

    public PlusItemsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ITEMS.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(PlusItemsMod::creativeTabSetup);
    }

    public static ResourceLocation path(String path) {
        return new ResourceLocation(MODID, path);
    }

    public static void creativeTabSetup(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey().equals(CreativeModeTabs.COMBAT)) {
            event.accept(COOL_SWORD);
        }
    }
}
