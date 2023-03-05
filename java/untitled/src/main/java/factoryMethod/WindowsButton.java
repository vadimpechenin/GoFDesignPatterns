package factoryMethod;

public class WindowsButton implements Button{
    @Override
    public void render() {
        // Отрисовать кнопку в стиле Windows.
        System.out.println("render Windows");
    }

    @Override
    public void onClick() {
        // Навесить на кнопку нативный обработчик события.
        System.out.println("onClick Windows");
    }
}
