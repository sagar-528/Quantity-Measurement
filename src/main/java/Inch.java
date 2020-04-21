import java.util.Objects;

public class Inch {

    private final Double value;

    public Inch(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Objects.equals(value, inch.value);
    }
}
