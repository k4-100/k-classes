package com.example.kclasses.interactions;

import com.hypixel.hytale.codec.builder.BuilderCodec;
import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.protocol.InteractionType;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.entity.InteractionContext;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.event.events.player.PlayerReadyEvent;
import com.hypixel.hytale.server.core.modules.interaction.interaction.CooldownHandler;
import com.hypixel.hytale.server.core.modules.interaction.interaction.config.Interaction;
import com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction;
import com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInteraction;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import java.util.function.Supplier;

import java.awt.*;

public class ReloadAgunInteraction extends SimpleInstantInteraction {

  private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();
  public static final BuilderCodec<ReloadAgunInteraction> CODEC = BuilderCodec.builder(
      ReloadAgunInteraction.class, ReloadAgunInteraction::new, SimpleInstantInteraction.CODEC).build();

  @Override
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler) {
    Ref<EntityStore> owningEntity = context.getOwningEntity();
    Store<EntityStore> store = owningEntity.getStore();

    Player player = store.getComponent(owningEntity, Player.getComponentType());

    player.sendMessage(Message.raw("RELOADING"));

    // LOGGER.atInfo().log("RELOADED");
    // // TODO Auto-generated method stub
    // throw new UnsupportedOperationException("Unimplemented method 'firstRun'");
  }

  // @Override
  // protected void tick0(boolean firstRun, float time, InteractionType type,
  // InteractionContext context,
  // CooldownHandler cooldownHandler) {
  //
  // LOGGER.atInfo().log("RELOADED");
  // // super.tick0(firstRun, time, type, context, cooldownHandler);
  // // Ref<EntityStore> owningEntity = context.getOwningEntity();
  //
  // }

}
