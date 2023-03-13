package adapter.extendVariant;


/**
 * Класс КруглыйКолышек, совместимый с классом круглое отверстие
 */
public class RoundPeg {
    private Double radius;
    public RoundPeg(Double radius) {
        this.radius = radius;
    }

    public RoundPeg() {
    }

    public Double getRadius(){
        return radius;
    }



}
