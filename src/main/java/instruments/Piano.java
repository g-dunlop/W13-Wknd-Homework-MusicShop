package instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private String style;

    public Piano(InstrumentType instrumentType, String material, String colour, double buyPrice, double intendedSellPrice, String style) {
        super(instrumentType, material, colour, buyPrice, intendedSellPrice);
        this.style = style;
    }

    public String play(){
        return "tinkle tinkle";
    }
    public String getStyle() {
        return style;
    }
}
