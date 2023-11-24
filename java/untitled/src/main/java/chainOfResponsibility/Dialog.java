package chainOfResponsibility;


/**
 * Но сложные компоненты могут переопределять метод помощь
 * по-своему. Но если помощь не может быть предоставлена,
 * компонент вызовет базовую реализацию (см.
 * класс Component)
 */
public class Dialog extends Container{
    public String wikiPageURL;
    public String text;
    public Dialog(String text) {
        this.text = text;
    }

    public void showHelp(){
        if (wikiPageURL != null){
            System.out.println(wikiPageURL);
        }else{
            super.showHelp();
        }
    }
}
