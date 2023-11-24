package chainOfResponsibility;


/**
 * Базовый класс простых компонентов.
 */
public abstract class Component implements ContextualHelp{
    public String tooltipText;
    // Контейнер, содержащий компонент, служит в качестве
    //следующего звена цепочки.
    protected Container container;


    // Компонент показывает всплывающую подсказку, если
    // задан текст подсказки. В обратном случае, он
    // перенаправляет запрос контейнеру, если
    // тот существует.
    public void showHelp(){
        if (tooltipText != null){
            //System.out.println("Подсказка 1");
        }else{
            container.showHelp();
        }
    }
}
