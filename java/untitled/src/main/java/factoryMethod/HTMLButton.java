package factoryMethod;

public class HTMLButton implements Button{
    @Override
    public void render() {
        // Вернуть HTML-код  кнопки.
        System.out.println("render HTML");
    }

    @Override
    public void onClick() {
        // Навесить на кнопку обработчик события браузера.
        System.out.println("OnClick HTML");
    }
}
