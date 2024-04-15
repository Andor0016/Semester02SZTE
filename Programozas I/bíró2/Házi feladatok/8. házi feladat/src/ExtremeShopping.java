import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtremeShopping {

    private Map<String, List<Product>> extremeList;

    public ExtremeShopping() {
        extremeList = new HashMap<>();
    }

    public void addShoppingList(String shop, List<Product> productList) {
        extremeList.put(shop, productList);
    }

    public void printShoppingLists() {
        for(Map.Entry<String, List<Product>> extremeItem : extremeList.entrySet()){
            System.out.println(extremeItem.getKey());
            int a = 0;
            for(Product product : extremeItem.getValue()){
                System.out.print( product.getName());
                if(a != extremeItem.getValue().size()-1){
                    System.out.print(" ");
                }
                a++;
            }
            System.out.println();
        }
    }
}
