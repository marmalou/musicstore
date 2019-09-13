package shopinstruments;

public class Violin extends Instrument {
    private int noOfStrings;

    public Violin(String type, String material, String colour, int noOfStrings){
        super(type, material, colour);
        this.noOfStrings = noOfStrings;
    }
}
