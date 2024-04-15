import java.util.HashMap;
import java.util.Map;

public class BestPriceFinder {
    private Map<String, String> bestBuys;

    public BestPriceFinder() {
        bestBuys = new HashMap<String, String>();
    }

    public void addProduct(Product product, String shop) {
        bestBuys.put(product.getName(), shop);
    }

    public String getShopFor(String product){
        return bestBuys.get(product);
    }

    public void printBestBuys(){
        for(Map.Entry<String, String> bb : bestBuys.entrySet()){
            System.out.println("Buy " + bb.getValue() + " at " + bb.getKey() + ".");
        }
    }

    public int deleteShop(String shop) {
        int del = 0;

        for(Map.Entry<String, String> bb : bestBuys.entrySet()){
            if(bb.getValue().equals(shop)){
                del++;
            }
        }
        bestBuys.remove(shop);
        return del;
    }
}
