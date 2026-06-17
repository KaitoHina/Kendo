package com.kaitohina.kendo.datagen;

import com.kaitohina.kendo.item.ModItems;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnUsLangProvider extends LanguageProvider {
  public ModEnUsLangProvider(PackOutput output, String modid) {
    super(output, modid, "en_us");
  }

  @Override
  protected void addTranslations() {
    // Add items translations
    add(ModItems.SHINAI_BLADE.get(), "Shinai Blade");
    add(ModItems.TSUBA.get(), "Tsuba");
    add(ModItems.TSUKA.get(), "Tsuka");
    add(ModItems.SHINAI.get(), "Shinai");

    // add creative tab translations
    add("itemGroup.kendo_tab", "Kendo");
  }
}
