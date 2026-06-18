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

    // add tooltip translations
    add("tooltip.kendo.shinai", "Press §6§n§l§oSHIFT§r§r§r§r for more info!");
    add("tooltip.kendo.shinai.shift", "A bamboo sword used in Kendo. It is made of four slats of bamboo and is used for practice and competition.");
  }
}
