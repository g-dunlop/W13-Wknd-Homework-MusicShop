package accessories;

import behaviours.ISell;

public abstract class Accessories implements ISell {

    private String description;
    private double buyPrice;
    private double intendedSellPrice;


    public Accessories(String description, double buyPrice, double intendedSellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.intendedSellPrice = intendedSellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getIntendedSellPrice() {
        return intendedSellPrice;
    }

    public double calculateMarkup(){
        return this.getIntendedSellPrice() - this.getBuyPrice();
    }
}
