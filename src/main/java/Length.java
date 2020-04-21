import java.util.Objects;

public class Length
{
    private final Unit unit;
    private final double value;
    private static final double feetToInch = 12;

    enum Unit{
       FEET, INCH, Null
   };

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that){
        if (this.unit.equals(that.unit)){
            return Double.compare(this.value, that.value) == 0;
        }
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH)){
            return Double.compare(Math.round(this.value*feetToInch), that.value) == 0;
        }
        if (this.unit.equals(Unit.INCH) && that.unit.equals(Unit.FEET)){
            return Double.compare(this.value, Math.round(that.value*feetToInch)) == 0;
        }
        return false;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Length length = (Length) that;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
