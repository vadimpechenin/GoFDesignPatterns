package team;


/**
 * Команда копирования не записывается в историю, так
 * как она не меняет состояние редактора.
 */
public class CopyCommand extends Command{
    public CopyCommand(Application application, Editor activeEditor) {
        this.app = application;
        this.editor = activeEditor;
    }

    public Boolean execute(){
        app.clipboard = editor.getSelection();
        return false;
    }
}

