import org.graalvm.compiler.nodes.NodeView;

public interface MeasurementOperation {

   static Double add(Quantity quantity1, Quantity quantity2) throws Exception{
       if(!quantity1.unit.quantityName.equals(quantity2.unit.quantityName))
           throw new Exception("Invalid Quantity name Measurement", Exception.ExceptionType.INVALID_QUANTITY_NAME_CONVERSION);
       return quantity1.value * quantity1.unit.baseUnit +
               quantity2.value * quantity2.unit.baseUnit;
    }
}
