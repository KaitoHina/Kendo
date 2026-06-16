package com.kaitohina.kendo.item;

import com.kaitohina.kendo.Kendo;
import com.kaitohina.kendo.item.weapons.ShinaiItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
  // Create a DeferredRegister to manage all items
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Kendo.MODID);

  // Register the Shinai item
  public static final DeferredItem<ShinaiItem> SHINAI = ITEMS.register("weapons/shinai",
      () -> new ShinaiItem(Tiers.WOOD, new Item.Properties()
          .attributes(SwordItem.createAttributes(Tiers.WOOD, 3, -2.4F))));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}
