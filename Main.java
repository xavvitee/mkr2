package app;

import app.events.EventManager;
import app.modules.AuthModule;
import app.modules.LogModule;
import app.modules.UserInterface;

public class Main {
    public static void main(String[] args) {

        EventManager eventManager = EventManager.getInstance();

        AuthModule auth = new AuthModule();
        LogModule logger = new LogModule();
        UserInterface ui = new UserInterface();

        eventManager.subscribe(logger);
        eventManager.subscribe(ui);

        auth.authorizeUser();
    }
}

