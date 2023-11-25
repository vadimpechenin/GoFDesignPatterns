package team;


/**
 * Абстрактная команда задаёт общий интерфейс для
 * всех команд.
 */
public abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup;

    public void Command(Application app, Editor editor){
        this.app = app;
        this.editor = editor;
    }
    // Сохраняем состояние редактора.
    public void saveBackup(){
        this.backup = editor.text;
    }

    // Восстанавливаем состояние редактора.
    public void undo(){
        editor.text = backup;
    }

    // Главный метод команды остаётся абстрактным, чтобы
    // каждая конкретная команда определила его по-своему.
    // Метод должен возвратить true или false, в зависимости
    // о того, изменила ли команда состояние редактора, а
    // значит, нужно ли её сохранить в истории.
    public abstract Boolean execute();
}
