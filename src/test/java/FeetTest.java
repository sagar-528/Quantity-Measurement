import org.junit.Assert;
import org.junit.Test;

public class FeetTest {

    @Test
    public void given0FeetAnd0Feet_ShouldReturnEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given1FeetAnd2Feet_ShouldReturnNotEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.1);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenNullObject_ShouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Assert.assertNotEquals(feet, null);
    }

    @Test
    public void givenDifferentReference_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenDifferentTypeAndFeet_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Assert.assertNotEquals(feet1, "Feet");
    }

    @Test
    public void givenSameReference_ShouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void given0InchAnd0Inch_ShouldReturnEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1, inch2);
    }


    @Test
    public void given1InchAnd2Inch_ShouldReturnEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.1);
        Assert.assertNotEquals(inch1, inch2);
    }
}
