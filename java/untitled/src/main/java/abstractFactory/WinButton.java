package abstractFactory;


public class WinButton implements Button {
    @Override
    public String paint() {
        // Отрисовать кнопку в стиле Windows.
        System.out.println("paint Windows");
        return "paint Windows";
    }
}
