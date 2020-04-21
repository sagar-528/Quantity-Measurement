import org.junit.Assert;
import org.junit.Test;

public class FeetTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEquals() {
        Length feet1 = new Length(Length.Unit.FEET ,0.0);
        Length feet2 = new Length(Length.Unit.FEET ,0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1Feet_ShouldReturnNotEquals() {
        Length feet1 = new Length(Length.Unit.FEET ,0.0);
        Length feet2 = new Length(Length.Unit.FEET ,1.1);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd2FeetNull_ShouldReturnFalse() {
        Length feet1 = new Length(Length.Unit.FEET ,0.0);
        Length feet2 = null;
        boolean type = feet1.equals(feet2);
        Assert.assertEquals(false, type);
    }

    @Test
    public void given1FeetAnd2FeetReference_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.FEET ,0.0);
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void given1FeetAnd2FeetType_ShouldReturnFalse() {
        Length feet = new Length(Length.Unit.FEET ,0.0);
        Assert.assertNotSame(feet, "Feet");
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH ,0.0);
        Length inch2 = new Length(Length.Unit.INCH ,0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0InchAnd1Inch_ShouldReturnNotEquals() {
        Length inch1 = new Length(Length.Unit.INCH ,0.0);
        Length inch2 = new Length(Length.Unit.INCH ,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void given1InchAnd2InchNull_ShouldReturnFalse() {
        Length inch1 = new Length(Length.Unit.INCH ,0.0);
        Length inch2 = null;
        boolean type = inch1.equals(inch2);
        Assert.assertEquals(false, type);
    }

    @Test
    public void given1InchAnd2InchReference_ShouldReturnTrue() {
        Length feet = new Length(Length.Unit.INCH ,0.0);
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void given1InchAnd2InchType_ShouldReturnFalse() {
        Length inch = new Length(Length.Unit.INCH ,0.0);
        Assert.assertNotSame(inch, "Feet");
    }

    @Test
    public void given1FeetAnd1Inch_ShouldReturnNotEquals() {
        Length feet = new Length(Length.Unit.FEET ,1.0);
        Length inch = new Length(Length.Unit.INCH ,1.0);
        Assert.assertNotEquals(feet, inch);
    }

    @Test
    public void given0FeetAnd0Inch_ShouldReturnNotEquals() {
        Length feet = new Length(Length.Unit.FEET ,0.0);
        Length inch = new Length(Length.Unit.INCH ,0.0);
        boolean compareCheck =feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1FeetAnd1Inch_ByComparingLength_ShouldReturnNotEquals() {
        Length feet = new Length(Length.Unit.FEET ,1.0);
        Length inch = new Length(Length.Unit.INCH ,1.0);
        boolean compareCheck =feet.compare(inch);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1InchAnd1Feet_ByComparingLength_ShouldReturnNotEquals() {
        Length inch = new Length(Length.Unit.INCH ,1.0);
        Length feet = new Length(Length.Unit.FEET ,1.0);
        boolean compareCheck =inch.compare(feet);
        Assert.assertFalse(compareCheck);
    }

    @Test
    public void given1FeetAnd12Inch_ByComparingLength_ShouldReturnNotEquals() {
        Length feet = new Length(Length.Unit.FEET ,1.0);
        Length inch = new Length(Length.Unit.INCH ,12.0);
        boolean compareCheck =feet.compare(inch);
        Assert.assertTrue(compareCheck);
    }

    @Test
    public void given1InchAnd12Feet_ByComparingLength_ShouldReturnNotEquals() {
        Length inch = new Length(Length.Unit.INCH ,1.0);
        Length feet = new Length(Length.Unit.FEET ,12.0);
        boolean compareCheck =inch.compare(feet);
        Assert.assertFalse(compareCheck);
    }
}
