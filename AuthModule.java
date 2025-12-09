package app.modules;

import app.events.EventManager;
import app.events.Module;

public class AuthModule extends Module {

    public void authorizeUser() {
        String event = "Користувач авторизувався.";
        System.out.println(event);
        EventManager.getInstance().notifyAllModules(event);
    }

    @Override
    public void update(String event) {
        // AuthModule тільки генерує події
    }
}

