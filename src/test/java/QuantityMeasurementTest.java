import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEquals() {
        Length feet1 = new Length(Unit.FEET ,0.0);
        Length feet2 = new Length(Unit.FEET ,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEquals() {
        Length feet1 = new Length(Unit.FEET ,0.0);
        Length feet2 = new Length(Unit.FEET ,1.1);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd2FeetNull_ShouldReturnFalse() {
        Length feet1 = new Length(Unit.FEET ,0.0);
        Length feet2 = null;
        boolean type = feet1.equals(feet2);
        Assert.assertEquals(false, type);
    }

    @Test
    public void given1FeetAnd2FeetReference_ShouldReturnTrue() {
        Length feet = new Length(Unit.FEET ,0.0);
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void given1FeetAnd2FeetType_ShouldReturnFalse() {
        Length feet = new Length(Unit.FEET ,0.0);
        Assert.assertNotSame(feet, "Feet");
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH ,0.0);
        Length inch2 = new Length(Unit.INCH ,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEquals() {
        Length inch1 = new Length(Unit.INCH ,0.0);
        Length inch2 = new Length(Unit.INCH ,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1InchAnd2InchNull_ShouldReturnFalse() {
        Length inch1 = new Length(Unit.INCH ,0.0);
        Length inch2 = null;
        boolean type = inch1.equals(inch2);
        Assert.assertEquals(false, type);
    }

    @Test
    public void given1InchAnd2InchReference_ShouldReturnTrue() {
        Length feet = new Length(Unit.INCH ,0.0);
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void given1InchAnd2InchType_ShouldReturnFalse() {
        Length inch = new Length(Unit.INCH ,0.0);
        Assert.assertNotSame(inch, "Feet");
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEquals() {
        Length feet = new Length(Unit.FEET ,1.0);
        Length inch = new Length(Unit.INCH ,1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEquals() {
        Length feet = new Length(Unit.FEET ,0.0);
        Length inch = new Length(Unit.INCH ,0.0);
        boolean compareCheck =Unit.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ByComparingLength_ShouldReturnNotEquals() {
        Length feet = new Length(Unit.FEET ,1.0);
        Length inch = new Length(Unit.INCH ,1.0);
        boolean compareCheck =Unit.compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_ByComparingLength_ShouldReturnNotEquals() {
        Length inch = new Length(Unit.INCH ,1.0);
        Length feet = new Length(Unit.FEET ,1.0);
        boolean compareCheck =Unit.compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ByComparingLength_ShouldReturnNotEquals() {
        Length feet = new Length(Unit.FEET ,1.0);
        Length inch = new Length(Unit.INCH ,12.0);
        boolean compareCheck =Unit.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd12Feet_ByComparingLength_ShouldReturnNotEquals() {
        Length inch = new Length(Unit.INCH ,1.0);
        Length feet = new Length(Unit.FEET ,12.0);
        boolean compareCheck =Unit.compare(inch, feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given3FeetAnd1Yard_ByComparingLength_ShouldReturnEquals() {
        Length feet = new Length(Unit.FEET ,3.0);
        Length yard = new Length(Unit.YARD ,1.0);
        boolean compareCheck =Unit.compare(feet, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Yard_ByComparingLength_ShouldReturnNotEquals() {
        Length feet = new Length(Unit.FEET ,1.0);
        Length yard = new Length(Unit.YARD ,1.0);
        boolean compareCheck =Unit.compare(feet, yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Yard_ByComparingLength_ShouldReturnNotEquals() {
        Length inch = new Length(Unit.INCH ,1.0);
        Length yard = new Length(Unit.YARD ,1.0);
        boolean compareCheck =Unit.compare(inch, yard);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1YardAnd36Inch_ByComparingLength_ShouldReturnEquals() {
        Length yard = new Length(Unit.YARD ,1.0);
        Length inch = new Length(Unit.INCH ,36.0);
        boolean compareCheck =Unit.compare(yard, inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given36InchAnd1Yard_ByComparingLength_ShouldReturnEquals() {
        Length inch = new Length(Unit.INCH ,36.0);
        Length yard = new Length(Unit.YARD ,1.0);
        boolean compareCheck =Unit.compare(inch, yard);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1YardAnd3Feet_ByComparingLength_ShouldReturnEquals() {
        Length yard = new Length(Unit.YARD ,1.0);
        Length feet = new Length(Unit.FEET ,3.0);
        boolean compareCheck =Unit.compare(yard, feet);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_ByComparingLength_ShouldReturnEquals() {
        Length inch = new Length(Unit.INCH ,2.0);
        Length cm = new Length(Unit.CM ,5.0);
        boolean compareCheck =Unit.compare(inch, cm);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given2InchAnd2Inch_ShouldReturn4Inch() {
        Length inch1 = new Length(Unit.INCH ,2.0);
        Length inch2 = new Length(Unit.INCH ,2.0);
        OperationImpl op = new OperationImpl();
        double addition = op.add(inch1, inch2);
        Assert.assertEquals(4, addition, 0.0);
    }

}
