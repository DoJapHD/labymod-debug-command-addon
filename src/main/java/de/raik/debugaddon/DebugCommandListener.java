package de.raik.debugaddon;

import net.labymod.api.events.MessageSendEvent;
import net.labymod.support.util.Debug;

public class DebugCommandListener implements MessageSendEvent {

    @Override
    public boolean onSend(String message) {
        if (!message.startsWith("/debugcon"))
            return false;

        Debug.openDebugConsole();

        return true;
    }
}
