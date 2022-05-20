package accessories;

public class GuitarStrings extends Accessories {

    private String materials;

    public GuitarStrings(String description, double buyPrice, double intendedSellPrice, String materials) {
        super(description, buyPrice, intendedSellPrice);
        this.materials = materials;
    }

    public String getMaterials() {
        return materials;
    }
}
