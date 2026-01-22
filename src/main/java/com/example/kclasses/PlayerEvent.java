package com.example.kclasses;

import com.hypixel.hytale.protocol.GameMode;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.basecommands.CommandBase;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;

import javax.annotation.Nonnull;

public class PlayerEvent {

  public static void OnPlayerReady(PlayerReadyEvent event) {
    Player player = event.getPlayer();
    player.sendMessage(Message.raw("WELCOME ABOARD " + player.getDisplayName()));
    player.sendMessage(Message.raw("CURRENT MANA: " + player.getPlayerConfigData().lastSavedPosition.toString()));
  }
}
