import behaviours.IPlay;
import behaviours.ISell;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;
import shopinstruments.Instrument;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Instrument instrument;
//    private ArrayList<ISell> shopItems;
//    private ArrayList<IPlay> instruments;

    @Before
    public void before() {
        shop = new Shop();
        instrument = new Instrument("Drums", "plastic", "blue");
//        shop.addInstrument(instrument);
    }

    @Test
    public void canAddShopItems() {
        shop.addShopItems(instrument);
        assertEquals(1, shop.countInstruments());
    }
    @Test
    public void canRemoveShopItems(){
        shop.removeShopItems(instrument);
        assertEquals(0, shop.countInstruments());
    }
}