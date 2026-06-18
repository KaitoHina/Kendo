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

    // add tooltip translations
    add("tooltip.kendo.shinai", "按 §6§n§l§oSHIFT§r§r§r§r 以獲取更多資訊!");
    add("tooltip.kendo.shinai.shift", "竹刀是劍道中使用的竹製劍。它由四片竹片組成，用於練習和比賽。");
  }
}
