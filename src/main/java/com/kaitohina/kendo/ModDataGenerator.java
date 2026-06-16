package com.kaitohina.kendo;

import com.kaitohina.kendo.datagen.ModEnUsLangProvider;
import com.kaitohina.kendo.datagen.ModZhTwLangProvider;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Kendo.MODID)
public class ModDataGenerator {

  @SubscribeEvent // Subscribe to the GatherDataEvent to register our data providers
  public static void gatherData(final GatherDataEvent event) {
    // Get the DataGenerator instance
    DataGenerator generator = event.getGenerator();
    // Get the PackOutput for writing data files
    PackOutput output = generator.getPackOutput();

    // Add language providers
    generator.addProvider(event.includeClient(), new ModEnUsLangProvider(output, Kendo.MODID));
    generator.addProvider(event.includeClient(), new ModZhTwLangProvider(output, Kendo.MODID));
  }
}
