package app.modules;

import app.events.Module;

public class UserInterface extends Module {

    @Override
    public void update(String event) {
        System.out.println("Повідомлення для користувача - " + event);
    }
}

