public enum Unit {
    FEET(12.0), INCH(1.0), YARD(36.0), CM(0.4);

    double baseUnit;

    Unit(double baseUnit) {
        this.baseUnit = baseUnit;
    }

    public static boolean compare(Length length1, Length length2){
        return Double.compare(length1.value * length1.unit.baseUnit,
                length2.value * length2.unit.baseUnit) == 0;
    }
}
