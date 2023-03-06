package abstractFactory;


/**
 * Код, использующий фабрику, не волнует с какой конкретно
 * фабрикой он работает. Все получатели продуктов работают с
 * продуктами через абстрактный интерфейс.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;
    private GUIFactory factory;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI(){
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public String paint(){
        return button.paint();
        //checkbox.paint();
    }




}
