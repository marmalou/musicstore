package shopinstruments;


import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {
    private int noOfStrings;

    public Guitar(String type, String material, String colour, int noOfStrings) {
        super(type, material, colour);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play(){
        return ("playing");
    }
}

