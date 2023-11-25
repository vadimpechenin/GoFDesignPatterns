package team;


/**
 * Команды, меняющие состояние редактора, сохраняют
 * состояние редактора перед своим действием и
 * сигнализируют об изменении, возвращая true.
 */
public class PasteCommand extends Command{
    public PasteCommand(Application application, Editor activeEditor) {
        this.app = application;
        this.editor = activeEditor;
    }

    public Boolean execute(){
        saveBackup();
        editor.replaceSelection(app.clipboard);
        return true;
    }
}

