package shopitems;

import behaviours.ISell;

public class DrumSticks implements ISell {

    private int boughtPrice;
    private int sellingPrice;
    private int markUp;

    public DrumSticks(int boughtPrice, int sellingPrice) {
        this.boughtPrice = boughtPrice;
        this.sellingPrice = sellingPrice;
        this.markUp = markUp;
    }


    public int getBoughtPrice() {
        return this.boughtPrice;
    }

    public int getSellingPrice() {
        return this.sellingPrice;
    }

    public double calculateMarkUp() {
        return sellingPrice - boughtPrice;
    }
}
