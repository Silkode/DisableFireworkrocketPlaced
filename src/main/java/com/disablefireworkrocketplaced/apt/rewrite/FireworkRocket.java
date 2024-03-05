package com.disablefireworkrocketplaced.apt.rewrite;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;

public class FireworkRocket implements ModInitializer {
    @Override
    public void onInitialize() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            ItemStack heldItem = player.getStackInHand(hand);
            Item item = heldItem.getItem();
            ItemStack Elytra = player.getEquippedStack(EquipmentSlot.CHEST);
            if (Elytra.getItem() == Items.ELYTRA && item == Items.FIREWORK_ROCKET) {
                return ActionResult.SUCCESS;
            }
            return ActionResult.PASS;
        });
    }
}