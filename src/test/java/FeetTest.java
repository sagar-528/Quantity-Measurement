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
    public void givenStringAndFeet_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Assert.assertNotEquals(feet1, "Feet");
    }
}
