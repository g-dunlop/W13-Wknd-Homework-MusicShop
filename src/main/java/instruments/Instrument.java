package instruments;

import behaviours.ISell;

public abstract class Instrument implements ISell {

    private InstrumentType instrumentType;
    private String material;
    private String colour;
    private double buyPrice;
    private double intendedSellPrice;

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getIntendedSellPrice() {
        return intendedSellPrice;
    }

    public Instrument(InstrumentType instrumentType, String material, String colour, double buyPrice, double intendedSellPrice) {
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.intendedSellPrice = intendedSellPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public double calculateMarkup (){
        return this.getIntendedSellPrice() - this.getBuyPrice();
    }
}
