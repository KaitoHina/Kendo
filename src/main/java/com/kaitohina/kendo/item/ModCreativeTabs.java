package com.kaitohina.kendo.item;

import java.util.function.Supplier;

import com.kaitohina.kendo.Kendo;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
  // Create a DeferredRegister to register the Creative Mode tab
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
      .create(Registries.CREATIVE_MODE_TAB, Kendo.MODID);

  // Define the "Kendo" tab
  public static final Supplier<CreativeModeTab> KENDO_TAB = CREATIVE_MODE_TABS.register("kendo_tab",
      () -> CreativeModeTab.builder()
          .icon(() -> new ItemStack(ModItems.SHINAI.get()))
          .title(Component.translatable("itemGroup.kendo_tab"))
          .displayItems((parameters, output) -> {
            // Add all items belonging to this tab here
            output.accept(ModItems.SHINAI.get());
          })
          .build());

  public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TABS.register(eventBus);
  }
}
