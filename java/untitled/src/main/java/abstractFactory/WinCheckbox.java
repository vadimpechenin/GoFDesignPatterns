package abstractFactory;


public class WinCheckbox implements Checkbox {
    @Override
    public String paint() {
        // Отрисовать кнопку в стиле Windows.
        System.out.println("paint checkbox Windows");
        return "paint checkbox Windows";
    }
}
