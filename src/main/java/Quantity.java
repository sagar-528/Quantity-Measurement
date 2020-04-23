public class Quantity
{
    public final Unit unit;
    public final double value;

    public Quantity(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Quantity quantity = (Quantity) that;
        return Double.compare(quantity.value, value) == 0 &&
                unit == quantity.unit;
    }
}
