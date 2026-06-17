package com.kaitohina.kendo.datagen;

import java.util.concurrent.CompletableFuture;

import com.kaitohina.kendo.item.ModItems;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {
  // Constructor for the ModRecipesProvider class
  public ModRecipesProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
    super(packOutput, registries); // Call the superclass constructor with the provided parameters
  }

  @Override // Override the buildRecipes method to define custom recipes
  public void buildRecipes(RecipeOutput recipeOutput) {
    // 1. shinai_blade (劍身) recipe: 4 bamboo + 1 string
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHINAI_BLADE.get())
        .pattern(" B ")
        .pattern("BSB")
        .pattern(" B ")
        .define('B', Items.BAMBOO)
        .define('S', Items.STRING)
        .unlockedBy(getHasName(Items.BAMBOO), has(Items.BAMBOO))
        .unlockedBy(getHasName(Items.STRING), has(Items.STRING))
        .save(recipeOutput);

    // 2. tsuba (鍔) recipe: 4 Leather
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TSUBA.get())
        .pattern(" L ")
        .pattern("L L")
        .pattern(" L ")
        .define('L', Items.LEATHER)
        .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
        .save(recipeOutput);

    // 3. tsuka (柄) recipe: 1 leather + 1 stick + 1 white dye
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TSUKA.get())
        .pattern("L")
        .pattern("S")
        .pattern("D")
        .define('L', Items.LEATHER)
        .define('S', Items.STICK)
        .define('D', Items.WHITE_DYE)
        .unlockedBy(getHasName(Items.LEATHER), has(Items.LEATHER))
        .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
        .unlockedBy(getHasName(Items.WHITE_DYE), has(Items.WHITE_DYE))
        .save(recipeOutput);

    // 4. shinai recipe: 1 shinai_blade + 1 tsuba + 1 tsuka
    ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.SHINAI.get())
        .pattern(" B ")
        .pattern(" T ")
        .pattern(" K ")
        .define('B', ModItems.SHINAI_BLADE.get())
        .define('T', ModItems.TSUBA.get())
        .define('K', ModItems.TSUKA.get())
        .unlockedBy(getHasName(ModItems.SHINAI_BLADE.get()), has(ModItems.SHINAI_BLADE.get()))
        .unlockedBy(getHasName(ModItems.TSUBA.get()), has(ModItems.TSUBA.get()))
        .unlockedBy(getHasName(ModItems.TSUKA.get()), has(ModItems.TSUKA.get()))
        .save(recipeOutput);
  }
}
