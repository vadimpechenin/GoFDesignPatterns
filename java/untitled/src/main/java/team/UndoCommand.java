package team;


/**
 * Отмена это тоже команда.
 */
public class UndoCommand extends Command{
    public UndoCommand(Application application, Editor activeEditor) {
        this.app = application;
        this.editor = activeEditor;
    }

    public Boolean execute(){
        app.undo();
        return false;
    }
}

