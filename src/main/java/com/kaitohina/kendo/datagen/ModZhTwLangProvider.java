package com.kaitohina.kendo.datagen;

import com.kaitohina.kendo.item.ModItems;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModZhTwLangProvider extends LanguageProvider {
  public ModZhTwLangProvider(PackOutput output, String modid) {
    super(output, modid, "zh_tw");
  }

  @Override
  protected void addTranslations() {
    // Add items translations
    add(ModItems.SHINAI_BLADE.get(), "竹刀刀身");
    add(ModItems.TSUBA.get(), "鍔");
    add(ModItems.TSUKA.get(), "柄");
    add(ModItems.SHINAI.get(), "竹刀");

    // add creative tab translations
    add("itemGroup.kendo_tab", "劍道");
  }
}
