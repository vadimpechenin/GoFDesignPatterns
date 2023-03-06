package abstractFactory;


public class MacCheckbox implements Checkbox {
    @Override
    public String paint() {
        // Отрисовать кнопку в стиле macOS.
        System.out.println("paint checkbox macOS");
        return "paint checkbox macOS";
    }
}
