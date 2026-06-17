package com.kaitohina.kendo.datagen;

import com.kaitohina.kendo.Kendo;
import com.kaitohina.kendo.item.ModItems;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelsProvider extends ItemModelProvider {
  // Constructor for the ModItemModelsProvider class
  public ModItemModelsProvider(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
    super(output, modid, existingFileHelper);
  }

  @Override // Override the registerModels method to define custom item models
  protected void registerModels() {
    // gen the 3 components model of shinai
    createItemModel(ModItems.SHINAI_BLADE);
    createItemModel(ModItems.TSUKA);
    createItemModel(ModItems.TSUBA);
  }

  // Helper method to create an item model for a given Item
  private void createItemModel(DeferredItem<?> deferredItem) {
    // Get the path of the item and define the model path
    String path = deferredItem.getId().getPath();
    String modelPath = "item/" + path;

    // Create the item model using the builder pattern, setting the parent model and texture
    this.getBuilder(modelPath)
        .parent(new ModelFile.UncheckedModelFile("item/generated"))
        .texture("layer0", ResourceLocation.fromNamespaceAndPath(Kendo.MODID, "item/" + path));
}
}
