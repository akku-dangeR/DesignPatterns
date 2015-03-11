package command;

import java.util.ArrayList;
import java.util.List;

/**
 * Class implementing broker.
 *
 * @author Yashraj R. Sontakke
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(final Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (final Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
