import org.junit.Before;
import org.junit.Test;
import shopitems.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks(10, 20);

    }

    @Test
    public void canGetBoughtPrice() {
        assertEquals(10, drumSticks.getBoughtPrice());
    }

    @Test
    public void canGetSellingPrice() {
        assertEquals(20, drumSticks.getSellingPrice());
    }
    @Test
    public void calculateMarkUp() {
        assertEquals(10, drumSticks.calculateMarkUp(), 0.1);
    }

}
