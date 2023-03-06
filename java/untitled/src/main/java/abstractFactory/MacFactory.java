package abstractFactory;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты
 * своей вариации.
 *  Несмотря на то что фабрики оперируют конкретными
 *   классами, их методы возвращают абстрактные типы
 *   продуктов. Благодаря этому, фабрики можно взаимозаменять,
 *   не изменяя клиентский код.
 */
public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
