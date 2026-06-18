package com.kaitohina.kendo.item.weapons;

import java.util.List;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;

public class ShinaiItem extends SwordItem {
  // Constructor for the ShinaiItem class
  public ShinaiItem(Tier tier, Item.Properties properties) {
    super(tier, properties); // Call the constructor of the SwordItem class
  }

  @Override // Override the appendHoverText method to add custom tooltip text
  public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
    // Call the superclass method to retain default behavior
    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    
    if (Screen.hasShiftDown()) {
      // Write the msg in the lang file for the tooltip text when Shift is pressed
      tooltipComponents.add(Component.translatable("tooltip.kendo.shinai.shift")); 
    } else {
      // Write the msg in the lang file for the tooltip text when Shift is not pressed
      tooltipComponents.add(Component.translatable("tooltip.kendo.shinai")); 
    }
  }

  // override methods here later for custom kendo behaviors
}
