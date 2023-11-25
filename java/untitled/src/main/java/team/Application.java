package team;


import java.util.ArrayList;

/**
 * Класс приложения настраивает объекты для совместной
 * работы. Он выступает в роли отправителя — создаёт
 * команды, чтобы выполнить какие-то действия.
 */
public class Application {
    public String clipboard;
    public ArrayList<Editor> editors;
    public Editor activeEditor;
    public CommandHistory history;

    // Код, привязывающий команды к элементам интерфейса
    // может выглядеть примерно так.
    public void createUI(){
        history = new CommandHistory(new ArrayList<>());
        Shortcut shortcuts = new Shortcut();
        Button copyButton = new Button();
        Button cutButton = new Button();
        Button pasteButton = new Button();
        Button undoButton = new Button();

        activeEditor = new Editor("Копирование");
        Command copyCommand = new CopyCommand(this, activeEditor);
        executeCommand(copyCommand);
        copyButton.setCommand(copyCommand);
        shortcuts.onKeyPress("Ctrl+C", copyCommand);

        activeEditor.replaceSelection("Вырезать");
        Command cutCommand = new CutCommand(this, activeEditor);
        executeCommand(cutCommand);
        cutButton.setCommand(cutCommand);
        shortcuts.onKeyPress("Ctrl+X", cutCommand);

        activeEditor.replaceSelection("Вставить");
        Command pasteCommand = new PasteCommand(this, activeEditor);
        executeCommand(pasteCommand);
        pasteButton.setCommand(pasteCommand);
        shortcuts.onKeyPress("Ctrl+V", pasteCommand);

        activeEditor.replaceSelection("Отменить");
        Command undoCommand = new UndoCommand(this, activeEditor);
        executeCommand(undoCommand);
        undoButton.setCommand(undoCommand);
        shortcuts.onKeyPress("Ctrl+Z", undoCommand);

    }

    // Запускаем команду и проверяем, надо ли добавить её
    // в историю.
    public void executeCommand(Command command){
        if (command.execute()){
            history.push(command);
        }
    }

    // Берём последнюю команду из истории и заставляем её
    // все отменить. Мы не знаем конкретный тип команды, но
    // это и не важно, так как каждая команда знает как
    // отменить своё действие.
    public void undo(){
        Command command = history.pop();
        if (command!=null){
            command.undo();
        }
    }
}
