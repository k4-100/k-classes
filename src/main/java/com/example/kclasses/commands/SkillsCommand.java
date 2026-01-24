package com.example.kclasses.commands;

import com.example.kclasses.pages.SkillsPage;
import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.basecommands.AbstractPlayerCommand;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.World;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;

public class SkillsCommand extends AbstractPlayerCommand {

  public SkillsCommand() {
    super("skills", "Opening Skills UI...", false);
  }

  @Override
  protected void execute(CommandContext arg0, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef,
      World world) {

    Player player = store.getComponent(ref, Player.getComponentType());
    SkillsPage page = new SkillsPage(playerRef);
    player.getPageManager().openCustomPage(ref, store, page);
  }

}
