import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;
    InstrumentType instrumentType;

    @Before
    public void before(){
        piano = new Piano(instrumentType.KEYBOARD, "wood", "Black", 350, 650, "grand");
    }

    @Test
    public void canPlay(){
        assertEquals("tinkle tinkle", piano.play());
    }
}
