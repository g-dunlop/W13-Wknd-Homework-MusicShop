import accessories.DrumSticks;
import accessories.GuitarStrings;
import behaviours.ISell;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    ISell guitar;
    ISell piano;
    ISell drumSticks;
    ISell guitarStrings;
    InstrumentType instrumentType;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar(instrumentType.STRING, "wood", "brown", 50.00, 100.00, 6, "acoustic");
        piano = new Piano(instrumentType.KEYBOARD, "wood", "Black", 350, 650, "grand");
        drumSticks = new DrumSticks("pair of drumsticks", 5, 15, "wood");
        guitarStrings = new GuitarStrings("acoustic guitar strings", 3, 6, "copper");
    }

    @Test
    public void hasEmptyStockList(){
        assertEquals(0, shop.getNumberOfItemsInStock());
    }

    @Test
    public void canAddStock(){
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getNumberOfItemsInStock());
    }

    @Test
    public void canRemoveStock(){
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.getNumberOfItemsInStock());
    }

    @Test
    public void canHaveDifferentTypesInStock(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumSticks);
        shop.addItemToStock(guitar);
        assertEquals(3, shop.getNumberOfItemsInStock());
    }

    @Test
    public void canCalculatePotentialProfit(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumSticks);
        assertEquals(60, shop.calculatePotentialProfit(), 0.0);
    }

    @Test
    public void canGetClass(){
        shop.addItemToStock(guitar);
        assertEquals("Guitar", shop.getStock().get(0).getClass());
    }

}
