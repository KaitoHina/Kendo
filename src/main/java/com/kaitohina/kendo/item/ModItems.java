package com.kaitohina.kendo.item;

import com.kaitohina.kendo.Kendo;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
  // Create a DeferredRegister to manage all items
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Kendo.MODID);

  public static final DeferredItem<Item> SHINAI = ITEMS.register("weapons/shinai",
      () -> new Item(new Item.Properties()));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}
