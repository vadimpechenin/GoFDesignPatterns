package chainOfResponsibility;


/**
 * Но сложные компоненты могут переопределять метод помощь
 * по-своему. Но если помощь не может быть предоставлена,
 * компонент вызовет базовую реализацию (см.
 * класс Component)
 */
public class Panel extends Container{
    public String modalHelpText;
    public int x;
    public int y;
    public int width;
    public int height;

    public Panel(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
    }

    public void showHelp(){
        if (modalHelpText != null){
            System.out.println(modalHelpText);
        }else{
            super.showHelp();
        }
    }
}
