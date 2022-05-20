import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList getStock(){
        return this.stock;
    }

    public int getNumberOfItemsInStock(){
        return this.getStock().size();
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        this.stock.remove(item);
    }

    public double calculatePotentialProfit(){
        double potentialProfit = 0;
        for (int i=0; i< this.getNumberOfItemsInStock(); i++){
            potentialProfit += this.stock.get(i).calculateMarkup();
        }
        return potentialProfit;
    }
}
