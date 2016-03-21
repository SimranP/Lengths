import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LengthTest {
    @Test
    public void length_says_1ft_is_equal_to_12in() {
        Length _1ft = new Length(1,LengthUnit.Feet);
        assertTrue(_1ft.isEqual(new Length(12,LengthUnit.Inch)));
    }

    @Test
    public void length_says_1ft_is_not_equal_to_13in() {
        Length _1ft = new Length(1,LengthUnit.Feet);
        assertFalse(_1ft.isEqual(new Length(13,LengthUnit.Inch)));
    }

    @Test
    public void length_says_2in_is_equal_to_5cm() {
        Length _2in = new Length(2,LengthUnit.Inch);
        assertTrue(_2in.isEqual(new Length(5,LengthUnit.Centimeter)));
    }

    @Test
    public void length_says_1cm_is_equal_to_10mm() {
        Length _1cm = new Length(1,LengthUnit.Centimeter);
        assertTrue(_1cm.isEqual(new Length(10,LengthUnit.Millimeter)));
    }

    @Test
    public void length_should_add_two_lengths_given_in_inches() {
        Length _2in = new Length(2, LengthUnit.Inch);
        assertEquals(new Length(4,LengthUnit.Inch),_2in.add(new Length(2, LengthUnit.Inch)));
    }

    @Test
    public void length_should_add_two_different_lengths_given_in_inch_and_centimeter() {
        Length _2in = new Length(2, LengthUnit.Inch);
        assertEquals(new Length(3,LengthUnit.Inch),_2in.add(new Length(2.5, LengthUnit.Centimeter)));
    }
}
