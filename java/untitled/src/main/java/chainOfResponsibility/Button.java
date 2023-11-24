package chainOfResponsibility;


/**
 * Примитивные компоненты может устраивать поведение помощи
 * по умолчанию...
 */
public class Button extends Component{
    public int x;
    public int y;
    public int width;
    public int height;
    public String text;

    public Button(int x, int y, int w, int h, String text){
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.text = text;
    }

    public void showHelp(){
        if (tooltipText != null){
            System.out.println(tooltipText);
        }else{
            container.showHelp();
        }
    }

}
