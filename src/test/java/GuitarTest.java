import instruments.Guitar;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    InstrumentType instrumentType;

    @Before
    public void before(){
        guitar = new Guitar(instrumentType.STRING, "wood", "brown", 50.00, 100.00, 6, "acoustic");
    }

    @Test
    public void canPlay(){
        assertEquals("twaaang", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50, guitar.calculateMarkup(), 0.0);
    }

    @Test
    public void hasInstrumentType(){
        assertEquals(instrumentType.STRING, guitar.getInstrumentType() );
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void hasType(){
        assertEquals("acoustic", guitar.getType());
    }
}
