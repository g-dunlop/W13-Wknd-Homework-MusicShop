package instruments;

import behaviours.IPlay;

public class Saxophone extends Instrument implements IPlay {

    private int openings;

    public Saxophone(InstrumentType instrumentType, String material, String colour, double buyPrice, double intendedSellPrice, int openings) {
        super(instrumentType, material, colour, buyPrice, intendedSellPrice);
        this.openings = openings;
    }

    public int getOpenings() {
        return openings;
    }

    public String play(){
        return "silky jazz";
    }
}
