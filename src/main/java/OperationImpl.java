public class OperationImpl implements MeasurementOperation
{
    @Override
    public Double add(Quantity quantity1, Quantity quantity2) {
        return quantity1.value * quantity1.unit.baseUnit +
                quantity2.value * quantity2.unit.baseUnit;
    }
}
