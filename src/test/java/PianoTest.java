import org.junit.Before;
import org.junit.jupiter.api.Test;
import shopinstruments.Piano;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PianoTest {
    Piano piano;


    @Before
    public void before(){
         piano = new Piano("keyboard", "wood", "black", 88);
    }

    @Test
    public void canGetType(){
        assertEquals("keyboard", piano.getType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", piano.getMaterial());
    }
    @Test
    public void canGetColour(){
        assertEquals("black", piano.getColour());
    }

    @Test void canGetNoOfKeys(){
        assertEquals(88, piano.getNoOfKeys());
    }

}
