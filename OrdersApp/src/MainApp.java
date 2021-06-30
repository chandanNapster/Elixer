import Helper.Order;
import Helper.Product;

import java.util.ArrayList;

public class MainApp {



    public static void main(String[] arg){
        System.out.println("Hello");

        Product p1 = new Product("Skirt", 2,"SK76",false);
        Product p2 = new Product("Shirt", 1,"SH76",true);
        Product p3 = new Product("Boxes", 5,"BX001",false);
        Product p4 = new Product("Clay Ports", 7,"CP87",false);

        Order o1 = new Order("OD456",false,"CXV5");
        o1.setProducts(p1);
        o1.setProducts(p2);
        o1.setProducts(p3);
        o1.setProducts(p4);

        Order o2 = new Order("OD458",false,"JTYP");
        o2.setProducts(p1);
        o2.setProducts(p3);

        Model m1 = new Model();

        ArrayList<Order> orderlist = new ArrayList<>();
        orderlist.add(o1);
        orderlist.add(o2);

        for(Order o : orderlist){
            if(m1.insertOrder(o)){
                m1.setOrdersList(o);
            }
        }

//        m1.setOrdersList(o1);
//        m1.setOrdersList(o2);

        System.out.println(m1);


    }


}
