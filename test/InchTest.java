import org.junit.Test;

import static org.junit.Assert.*;

public class InchTest {
    @Test
    public void add_returns_sum_of_inch_and_given_length_in_inches() throws Exception {
        Inch _2inch = new Inch(2);
        assertEquals(new Inch(4),_2inch.add(new Inch(2)));
    }
}