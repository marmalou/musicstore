package shopinstruments;

public class Trumpet extends Instrument {
    private int noOfValves;

    public Trumpet(String type, String material, String colour, int noOfValves){
        super(type, material, colour);
        this.noOfValves = noOfValves;
    }
}
