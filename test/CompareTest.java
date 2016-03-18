import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CompareTest {
    @Test
    public void length_should_be_able_to_tell_if_it_is_greater_than_a_given_length_in_feet_and_inch() throws Exception {
        Compare _1ft = new Compare(new Feet(1));

        assertTrue(_1ft.isGreaterThan(new Inch(11)));
    }

    @Test
    public void length_says_1ft_is_equal_to_12_inches() throws Exception {
        Compare _1ft = new Compare(new Feet(1));

        assertTrue(_1ft.isEqual(new Inch(12)));
    }

    @Test
    public void length_should_be_able_to_tell_if_it_is_less_than_a_given_length_in_feet_and_inch() throws Exception {
        Compare _1ft = new Compare(new Feet(1));

        assertTrue(_1ft.isLessThan(new Inch(13)));
    }


    @Test
    public void length_should_be_able_to_tell_if_it_is_greater_than_a_given_length_in_inches_and_cm() throws Exception {
        Compare _1in = new Compare(new Inch(1));

        assertTrue(_1in.isGreaterThan(new Centimeter(2)));
    }

    @Test
    public void length_says_2inches_is_equal_to_5cm() throws Exception {
        Compare _2in = new Compare(new Inch(2));

        assertTrue(_2in.isEqual(new Centimeter(5)));
    }

    @Test
    public void length_should_be_able_to_tell_if_it_is_less_than_a_given_length_in_inches_and_cm() throws Exception {
        Compare _1in = new Compare(new Inch(1));

        assertTrue(_1in.isLessThan(new Centimeter(3)));
    }


    @Test
    public void length_should_be_able_to_tell_if_it_is_greater_than_a_given_length_in_mm_and_cm() throws Exception {
        Compare _1cm = new Compare(new Centimeter(1));

        assertTrue(_1cm.isGreaterThan(new Millimeter(9)));
    }

    @Test
    public void length_says_10mm_is_equal_to_1cm() throws Exception {
        Compare _2cm = new Compare(new Centimeter(2));

        assertTrue(_2cm.isEqual(new Millimeter(20)));
    }

    @Test
    public void length_should_be_able_to_tell_if_it_is_less_than_a_given_length_in_mm_and_cm() throws Exception {
        Compare _1cm = new Compare(new Centimeter(1));

        assertTrue(_1cm.isLessThan(new Millimeter(11)));
    }

    @Test
    public void length_says_1gallon_is_equal_to_3_point_78l() throws Exception {
        Compare _1gallon = new Compare(new Gallon(1));

        assertTrue(_1gallon.isEqual(new Litre(3.78)));
    }


}
