package accessories;

public class DrumSticks extends Accessories {

    private String material;

    public DrumSticks(String description, double buyPrice, double intendedSellPrice, String material) {
        super(description, buyPrice, intendedSellPrice);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
