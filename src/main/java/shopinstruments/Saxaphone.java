package shopinstruments;

public class Saxaphone extends Instrument {
    private int noOfValves;

    public Saxaphone(String type, String material, String colour, int noOfValves){
        super(type, material, colour);
        this.noOfValves = noOfValves;
    }
}
