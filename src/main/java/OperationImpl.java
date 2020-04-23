public class OperationImpl implements MeasurementOperation
{
    @Override
    public Double add(Length length1, Length length2) {
        return length1.value * length1.unit.baseUnit +
                length2.value * length2.unit.baseUnit;
    }
}
