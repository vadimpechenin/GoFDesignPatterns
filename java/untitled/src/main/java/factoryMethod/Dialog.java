package factoryMethod;
/**
 * Базовый класс  фабрики. Заметьте, что  "фабрика" – это
 * всего лишь  дополнительная  роль  для  класса. Он  уже  имеет
 * какую-то бизнес-логику, в  которой  требуется  создание
 * разнообразных продуктов.
 */

public abstract class Dialog {

    public void renderWindow() {
        // Отрисовать остальные элементы интерфейса. 28
        Button okButton = createButton();
        okButton.onClick();
        okButton.render();
    }

    // Мы выносим  весь  код  создания  продуктов  в  особый
    // Фабричный метод.
    abstract public Button createButton();
}
