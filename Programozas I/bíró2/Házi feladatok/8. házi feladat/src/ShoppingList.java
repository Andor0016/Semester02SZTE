import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private List<Product> items;

    public ShoppingList() {
        items = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        if(product != null) {
            items.add(product);
        }
    }

    public int countProducts() {
        return items.size();
    }

    public Product getProduct(int index) {
        if(index < 0 || index >= items.size()){
            return null;
        }
        return items.get(index);
    }

    public void printProducts() {
        for(Product product : items){
            System.out.println(product.getName());
        }
    }

    public void delete(Product product) {
        items.remove(product);
    }

    public int deleteUnimportant() {
        int del = 0;
        List<Product> toDel = new ArrayList<>();
        for(Product product : items){
            if(!product.isImportant()){
                del++;
                toDel.add(product);
            }
        }
        for(Product product : toDel){
            items.remove(product);
        }
        return  del;
    }
}
