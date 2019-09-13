package shopinstruments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Piano extends Instrument {
    Piano piano;
    private int noOfKeys;

    public Piano(String type, String material, String colour, int noOfKeys) {
        super(type, material, colour);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;


    }

}

