package abstractFactory;

/**
 * Абстрактная фабрика знает обо всех (абстрактных)
 * типах продуктов.
 */
public interface GUIFactory {

    public Button createButton();
    public Checkbox createCheckbox();
}
