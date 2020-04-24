public class Quantity
{
    public final Unit unit;
    public final double value;

    public Quantity(Unit unit, double value) throws Exception
    {
        this.unit = unit;
        if (value < 0.0) {
            throw new Exception("value should be positive", Exception.ExceptionType.INVALID_VALUE_GIVEN);
        }
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
