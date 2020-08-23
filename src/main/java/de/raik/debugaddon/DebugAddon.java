package de.raik.debugaddon;

import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.SettingsElement;

import java.util.List;

public class DebugAddon extends LabyModAddon {

    @Override
    public void onEnable() {
        this.getApi().getEventManager().register(new DebugCommandListener());
    }

    @Override
    public void loadConfig() {

    }

    @Override
    protected void fillSettings(List<SettingsElement> list) {

    }
}
