package team;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Shortcut {
    public Map<String, Command> commands;

    public Shortcut() {
        this.commands = new HashMap<>();
    }

    public void onKeyPress(String description, Command command){
        this.commands.put(description, command);
    }
}
