import Helper.CSV;
import Helper.Inventory;
import Helper.Order;
import Helper.Product;

import java.util.ArrayList;
import java.util.List;

public class MainApp {



    public static void main(String[] arg){
//        System.out.println("Hello");
//
//        Product p1 = new Product("Skirt", 2,"SK76",false);
//        Product p2 = new Product("Shirt", 1,"SH76",false);
//        Product p3 = new Product("Boxes", 5,"BX001",false);
//        Product p4 = new Product("Clay Ports", 7,"CP87",false);
//
//        Inventory inventory = new Inventory();
//        inventory.addProduct(p1);
//        inventory.addProduct(p2);
//        inventory.addProduct(p3);
//        inventory.addProduct(p4);
//
//        Order o1 = new Order("OD456",false,"CXV5");
//        for(Product p : inventory.getProductArrayList()){
//            o1.setProducts(p);
//        }
////        o1.setProducts(p1);
////        o1.setProducts(p2);
////        o1.setProducts(p3);
////        o1.setProducts(p4);
//
//        Inventory i2 = new Inventory();
//        i2.addProduct(p1);
//        i2.addProduct(p3);
//
//        Order o2 = new Order("OD458",false,"JTYP");
//        for(Product p : i2.getProductArrayList()){
//            o2.setProducts(p);
//        }
//
//        Model m1 = new Model();
//
//        ArrayList<Order> orderlist = new ArrayList<>();
//        orderlist.add(o1);
//        orderlist.add(o2);
//
//        for(Order o : orderlist){
//            if(m1.insertOrder(o)){
//                m1.setOrdersList(o);
//            }
//        }
//
////        m1.setOrdersList(o1);
////        m1.setOrdersList(o2);
//
//        System.out.println(m1);

        CSV csv = new CSV();
        List<Product> prdList = csv.getData();

        for(Product p : prdList){
            System.out.println("The product is-->" + p);
        }

    }


}
