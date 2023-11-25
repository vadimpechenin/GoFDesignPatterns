package team;


import java.util.ArrayList;
import org.apache.commons.lang3.SerializationUtils;
/**
 * Глобальная история команд — это стек
 */
public class CommandHistory {
    private ArrayList<Command> history;

    public CommandHistory(ArrayList<Command> history) {
        this.history = history;
    }

    public void push(Command c){
        // Добавить команду в конец массива-истории.
        if (history==null){
            this.history = new ArrayList<>();
        }
        history.add(c);
    }
    public Command pop(){
        // Достать последнюю команду из массива-истории.
        if (history!=null){
            Command c = history.get(history.size()-1);
            history.remove(history.size()-1);
            return c;
        }
        return null;
    }
}
