package team;


/**
 * Команды, меняющие состояние редактора, сохраняют
 * состояние редактора перед своим действием и
 * сигнализируют об изменении, возвращая true.
 */
public class CutCommand extends Command{
    public CutCommand(Application application, Editor activeEditor) {
        this.app = application;
        this.editor = activeEditor;
    }

    public Boolean execute(){
        saveBackup();
        app.clipboard = editor.getSelection();
        editor.deleteSelection();
        return true;
    }
}

