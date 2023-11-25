package team;


/**
* Класс редактора содержит непосредственные операции над
* текстом. Он отыгрывает роль получателя – команды
* делегируют ему свои действия.
 */
public class Editor {
    public String text;

    public Editor(String text) {
        this.text = text;
    }

    public String getSelection(){
        // Вернуть выбранный текст.
        return text;
    }

    public void deleteSelection(){
        // Удалить выбранный текст.
        text ="";
    }

    public void replaceSelection(String text){
        this.text = text;
    }
}
