package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;
    private String type;

    public Guitar(InstrumentType instrumentType, String material, String colour, double buyPrice, double intendedSellPrice, int numberOfStrings, String type) {
        super(instrumentType, material, colour, buyPrice, intendedSellPrice);
        this.numberOfStrings = numberOfStrings;
        this.type = type;
    }

    public String play(){
        return "twaaang";
    }
    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getType() {
        return type;
    }
}
