package com.example.kclasses;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;

public class MainPlugin extends JavaPlugin {

    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public MainPlugin(JavaPluginInit init) {
        super(init);
        LOGGER.atInfo().log("Hello from %s version %s", this.getName(), this.getManifest().getVersion().toString());

    }

    @Override
    protected void setup() {
        this.getCommandRegistry()
                .registerCommand(new MainCommand(this.getName(), this.getManifest().getVersion().toString()));
    }

    // @Override
    // protected void start() {
    // // TODO Auto-generated method stub
    // super.start();
    // }

}
