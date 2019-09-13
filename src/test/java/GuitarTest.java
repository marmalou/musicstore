import org.junit.Before;
import org.junit.Test;
import shopinstruments.Guitar;
import shopinstruments.Instrument;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("string", "wood", "red", 6);
    }

    @Test
    public void canGetType(){
        assertEquals("string", guitar.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }
    @Test
    public void canGetColour(){
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void canGetNoOfStrings(){
        assertEquals(6, guitar.getNoOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("playing",guitar.play());
    }
}
