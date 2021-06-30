import Helper.Order;

import java.util.ArrayList;

public class Model {

    public ArrayList<Order> ordersList;

    public Model(){
        ordersList = new ArrayList<>();
    }

    public ArrayList<Order> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(Order order) {
        this.ordersList.add(order);
    }

    @Override
    public String toString() {
        return "Model{" +
                "ordersList=" + ordersList +
                '}';
    }

    public boolean insertOrder(Order o){
        if(o.productCannotBePlaced()){
            return false;
        }
        else{
            return true;
        }
    }
}
