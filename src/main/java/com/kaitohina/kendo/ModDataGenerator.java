package com.kaitohina.kendo;

import java.util.concurrent.CompletableFuture;

import com.kaitohina.kendo.datagen.ModEnUsLangProvider;
import com.kaitohina.kendo.datagen.ModItemModelsProvider;
import com.kaitohina.kendo.datagen.ModRecipesProvider;
import com.kaitohina.kendo.datagen.ModZhTwLangProvider;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@EventBusSubscriber(modid = Kendo.MODID)
public class ModDataGenerator {

  @SubscribeEvent // Subscribe to the GatherDataEvent to register our data providers
  public static void gatherData(final GatherDataEvent event) {
    // Get the DataGenerator instance
    DataGenerator generator = event.getGenerator();
    // Get the PackOutput for writing data files
    PackOutput output = generator.getPackOutput();
    // Get the ExistingFileHelper for checking existing files during data generation
    ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
    // Get the LookupProvider for accessing registries during data generation
    CompletableFuture<HolderLookup.Provider> LookupProvider = event.getLookupProvider();

    // Add language providers
    generator.addProvider(event.includeClient(), new ModEnUsLangProvider(output, Kendo.MODID));
    generator.addProvider(event.includeClient(), new ModZhTwLangProvider(output, Kendo.MODID));

    // Add item model provider
    generator.addProvider(event.includeClient(), new ModItemModelsProvider(output, Kendo.MODID, existingFileHelper));

    // Add recipe provider
    generator.addProvider(event.includeServer(), new ModRecipesProvider(output, LookupProvider));
  }

}
