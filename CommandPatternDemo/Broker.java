package CommandPatternDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by enes on 10/20/2017.
 */
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }
    //siparis ver
    public void placeOrders(){

        for(Order order : orderList){
            order.execute();
        }
        orderList.clear();
    }
}
