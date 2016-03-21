import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VolumeTest {
    @Test
    public void volume_says_1gallon_is_equal_to_3_point_78_litres() {
        Volume _1gallon = new Volume(1,VolumeUnit.Gallon);
        assertTrue(_1gallon.isEqual(new Volume(3.78,VolumeUnit.Litre)));
    }

    @Test
    public void volume_says_1gallon_is_not_equal_to_3_point_79_litres() {
        Volume _1gallon = new Volume(1,VolumeUnit.Gallon);
        assertFalse(_1gallon.isEqual(new Volume(3.79,VolumeUnit.Litre)));
    }

    @Test
    public void volume_can_add_two_volumes_given_in_gallon_and_litre() {
        Volume _1l = new Volume(1, VolumeUnit.Litre);
        assertEquals(new Volume(4.78,VolumeUnit.Litre),_1l.add(new Volume(1,VolumeUnit.Gallon)));
    }
}
