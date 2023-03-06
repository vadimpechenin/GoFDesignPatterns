package abstractFactory;


public class MacButton implements Button {
    @Override
    public String paint() {
        // Отрисовать кнопку в стиле macOS.
        System.out.println("paint macOS");
        return "paint macOS";
    }
}
