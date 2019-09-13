package shop;

import behaviours.ISell;
import shopinstruments.Instrument;

import java.util.ArrayList;

public class Shop {

    private ArrayList<Instrument> instruments;
//    private ArrayList<ISell> shopItems;

    public Shop() {
        instruments = new ArrayList<Instrument>();
//        shopItems = new ArrayList<ISell>();
    }

    public void addShopItems(Instrument item) {
        this.instruments.add(item);
    }

    public void addInstrument(Instrument instrument){
        this.instruments.add(instrument);
    }


    public int countInstruments() {
        return instruments.size();
    }

    public void removeShopItems(Instrument instrument) {
        this.instruments.remove(instrument);
    }
}

