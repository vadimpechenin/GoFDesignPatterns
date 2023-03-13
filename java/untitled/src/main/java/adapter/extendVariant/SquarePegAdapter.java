package adapter.extendVariant;


/**
 * Адаптер классов
 * Адаптер позволяет использовать квадратные колышки и круглые отверстия вместе.
 */
public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public Double getRadius(){
        // Вычислить половину диагонали квадратного колышка
        // по теореме Пифагора.
        return Math.sqrt(2 * Math.pow(peg.getWidth(), 2)) / 2;
    }
}
