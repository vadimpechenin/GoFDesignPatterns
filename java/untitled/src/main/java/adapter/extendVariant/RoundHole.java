package adapter.extendVariant;


/**
 * Класс КруглоеОтверстие, совместимый с классом круглый колышек
 */
public class RoundHole {
    private Double radius;

    public RoundHole(Double radius) {
        this.radius = radius;
    }

    public RoundHole() {
    }

    public Double getRadius(){
        return radius;
    }

    public Boolean fits(RoundPeg peg){
        return radius >= peg.getRadius();
    }
}
