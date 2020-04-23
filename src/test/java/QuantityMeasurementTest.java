import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEquals() {
        Quantity feet1 = new Quantity(Unit.FEET ,0.0);
        Quantity feet2 = new Quantity(Unit.FEET ,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEquals() {
        Quantity feet1 = new Quantity(Unit.FEET ,0.0);
        Quantity feet2 = new Quantity(Unit.FEET ,1.1);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd2FeetNull_ShouldReturnFalse() {
        Quantity feet1 = new Quantity(Unit.FEET ,0.0);
        Quantity feet2 = null;
        boolean type = feet1.equals(feet2);
        Assert.assertEquals(false, type);
    }

    @Test
    public void given1FeetAnd2FeetReference_ShouldReturnTrue() {
        Quantity feet = new Quantity(Unit.FEET ,0.0);
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void given1FeetAnd2FeetType_ShouldReturnFalse() {
        Quantity feet = new Quantity(Unit.FEET ,0.0);
        Assert.assertNotSame(feet, "Feet");
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Quantity inch1 = new Quantity(Unit.INCH ,0.0);
        Quantity inch2 = new Quantity(Unit.INCH ,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEquals() {
        Quantity inch1 = new Quantity(Unit.INCH ,0.0);
        Quantity inch2 = new Quantity(Unit.INCH ,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1InchAnd2InchNull_ShouldReturnFalse() {
        Quantity inch1 = new Quantity(Unit.INCH ,0.0);
        Quantity inch2 = null;
        boolean type = inch1.equals(inch2);
        Assert.assertEquals(false, type);
    }

    @Test
    public void given1InchAnd2InchReference_ShouldReturnTrue() {
        Quantity feet = new Quantity(Unit.INCH ,0.0);
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void given1InchAnd2InchType_ShouldReturnFalse() {
        Quantity inch = new Quantity(Unit.INCH ,0.0);
        Assert.assertNotSame(inch, "Feet");
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEquals() {
        Quantity feet = new Quantity(Unit.FEET ,1.0);
        Quantity inch = new Quantity(Unit.INCH ,1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEquals() throws Exception {
        Quantity feet = new Quantity(Unit.FEET ,0.0);
        Quantity inch = new Quantity(Unit.INCH ,0.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ByComparingLength_ShouldReturnNotEquals() throws Exception {
        Quantity feet = new Quantity(Unit.FEET ,1.0);
        Quantity inch = new Quantity(Unit.INCH ,1.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_ByComparingLength_ShouldReturnNotEquals() throws Exception {
        Quantity inch = new Quantity(Unit.INCH ,1.0);
        Quantity feet = new Quantity(Unit.FEET ,1.0);
        boolean compareCheck = Unit.compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ByComparingLength_ShouldReturnNotEquals() throws Exception {
        Quantity feet = new Quantity(Unit.FEET ,1.0);
        Quantity inch = new Quantity(Unit.INCH ,12.0);
        boolean compareCheck = Unit.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd12Feet_ByComparingLength_ShouldReturnNotEquals() throws Exception {
        Quantity inch = new Quantity(Unit.INCH ,1.0);
        Quantity feet = new Quantity(Unit.FEET ,12.0);
        boolean compareCheck = Unit.compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_ByComparingLength_ShouldReturnEquals() throws Exception {
        Quantity feet = new Quantity(Unit.FEET ,3.0);
        Quantity yard = new Quantity(Unit.YARD ,1.0);
        boolean compareCheck =Unit.compare(feet, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_ByComparingLength_ShouldReturnNotEquals() throws Exception {
        Quantity feet = new Quantity(Unit.FEET ,1.0);
        Quantity yard = new Quantity(Unit.YARD ,1.0);
        boolean compareCheck =Unit.compare(feet, yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_ByComparingLength_ShouldReturnNotEquals() throws Exception {
        Quantity inch = new Quantity(Unit.INCH ,1.0);
        Quantity yard = new Quantity(Unit.YARD ,1.0);
        boolean compareCheck =Unit.compare(inch, yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_ByComparingLength_ShouldReturnEquals() throws Exception {
        Quantity yard = new Quantity(Unit.YARD ,1.0);
        Quantity inch = new Quantity(Unit.INCH ,36.0);
        boolean compareCheck = Unit.compare(yard, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_ByComparingLength_ShouldReturnEquals() throws Exception {
        Quantity inch = new Quantity(Unit.INCH ,36.0);
        Quantity yard = new Quantity(Unit.YARD ,1.0);
        boolean compareCheck = Unit.compare(inch, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_ByComparingLength_ShouldReturnEquals() throws Exception {
        Quantity yard = new Quantity(Unit.YARD ,1.0);
        Quantity feet = new Quantity(Unit.FEET ,3.0);
        boolean compareCheck = Unit.compare(yard, feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_ByComparingLength_ShouldReturnEquals() throws Exception {
        Quantity inch = new Quantity(Unit.INCH ,2.0);
        Quantity cm = new Quantity(Unit.CM ,5.0);
        boolean compareCheck = Unit.compare(inch, cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturn4Inch() {
        Quantity inch1 = new Quantity(Unit.INCH ,2.0);
        Quantity inch2 = new Quantity(Unit.INCH ,2.0);
        OperationImpl op = new OperationImpl();
        double addition = op.add(inch1, inch2);
        Assert.assertEquals(4, addition, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_ShouldReturn14Inch() {
        Quantity feet = new Quantity(Unit.FEET ,1.0);
        Quantity inch = new Quantity(Unit.INCH ,2.0);
        OperationImpl op = new OperationImpl();
        double addition = op.add(feet, inch);
        Assert.assertEquals(14, addition, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_ShouldReturn24Inch() {
        Quantity feet1 = new Quantity(Unit.FEET ,1.0);
        Quantity feet2 = new Quantity(Unit.FEET ,1.0);
        OperationImpl op = new OperationImpl();
        double addition = op.add(feet1, feet2);
        Assert.assertEquals(24, addition, 0.0);
    }

    @Test
    public void given2InchAnd2Point5Cm_ShouldReturn3Inch() {
        Quantity inch = new Quantity(Unit.INCH ,2.0);
        Quantity cm = new Quantity(Unit.CM ,2.5);
        OperationImpl op = new OperationImpl();
        double addition = op.add(inch, cm);
        Assert.assertEquals(3, addition, 0.0);
    }

    @Test
    public void given1GallonAnd3Point78Litres_ShouldReturnEqual() throws Exception {
        Quantity gallon = new Quantity(Unit.GALLON ,1.0);
        Quantity litre = new Quantity(Unit.LITRE ,3.78);
        Boolean result = Unit.compare(gallon, litre);
        Assert.assertTrue(result);
    }
}
