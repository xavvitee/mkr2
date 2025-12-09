package app.events;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

    private static EventManager instance;
    private List<Module> subscribers = new ArrayList<>();

    private EventManager() {}

    public static EventManager getInstance() {
        if (instance == null) {
            instance = new EventManager();
        }
        return instance;
    }

    public void subscribe(Module module) {
        subscribers.add(module);
    }

    public void notifyAllModules(String event) {
        for (Module module : subscribers) {
            module.update(event);
        }
    }
}

