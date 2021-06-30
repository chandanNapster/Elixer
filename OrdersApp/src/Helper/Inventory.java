package Helper;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Product> productArrayList;

    public Inventory(){
        productArrayList = new ArrayList<>();
    }

    public boolean addProduct(Product product){
        this.productArrayList.add(product);
        return true;
    }

    public ArrayList<Product> getProductArrayList(){
        return this.productArrayList;
    }


}
