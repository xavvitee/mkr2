package app.modules;

import app.events.Module;
import java.util.ArrayList;
import java.util.List;

public class LogModule extends Module {

    private List<String> log = new ArrayList<>();

    @Override
    public void update(String event) {
        log.add(event);
        System.out.println("Подію збережено у лог - " + event);
    }
}

