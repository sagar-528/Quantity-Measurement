public enum Unit {
    FEET(12.0, "Length"), INCH(1.0, "Length"),
    YARD(36.0, "Length"), CM(0.4, "Length"),
    LITRE(1, "Volume"), GALLON(3.78, "Volume"),
    ML(0.001, "Volume");

    double baseUnit;
    String quantityName;

    Unit(double baseUnit, String quantityName) {
        this.baseUnit = baseUnit;
        this.quantityName = quantityName;
    }

    public static boolean compare(Quantity quantity1, Quantity quantity2) throws Exception {
       if(!quantity1.unit.quantityName.equals(quantity2.unit.quantityName))
           throw new Exception("Invalid", Exception.ExceptionType.INVALID_CONVERSION);

       return Double.compare(quantity1.value * quantity1.unit.baseUnit,
               quantity2.value * quantity2.unit.baseUnit) == 0;
    }
}
