package Helper;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private String orderNumber;
//    private Date orderPlacedDate;
//    private Date orderShippedDate;
    private Boolean orderOutofStock;
    private String orderName;
    private ArrayList<Product> products;

    public Order(){
        products = new ArrayList<>();
    }

    public Order(String orderNumber,
//                 Date orderPlacedDate,
//                 Date orderShippedDate,
                 Boolean orderOutofStock,
                 String orderName){
        products = new ArrayList<>();
       this.orderNumber = orderNumber;
       this.orderName = orderName;
       this.orderOutofStock = orderOutofStock;
//       this.orderPlacedDate = orderPlacedDate;
//       this.orderShippedDate = orderShippedDate;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(Product product) {
        products.add(product);
    }

    public Boolean productCannotBePlaced(){
        int count = 0;
        for(Product p: products){
            if(p.getProductOutofStock() == true){
                count++;
            }
        }
        if(count > 0) return true;
        else return false;
    }

    @Override
    public String toString() {
        return "Order{" + "\n"+
                "orderNumber='" + orderNumber + '\'' + "\n"+
//                ", orderPlacedDate=" + orderPlacedDate +
//                ", orderShippedDate=" + orderShippedDate +
                ", orderOutofStock=" + orderOutofStock + "\n"+
                ", orderName='" + orderName + '\'' + "\n"+
                ", products=" + products +
                '}';
    }
}
