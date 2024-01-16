package fooddeliverysystem.apis;

import fooddeliverysystem.data.Order;
import fooddeliverysystem.data.OrderStatus;
import fooddeliverysystem.data.User;
import fooddeliverysystem.managers.OrderManager;
import fooddeliverysystem.managers.UserManager;

public class UpdateOrderAPI {

    UserManager userManager = new UserManager();
    OrderManager orderManager = new OrderManager();

    public void updateOrder(int orderId, OrderStatus status, String userToken) {
        //...
        User user = userManager.getUserByToken(userToken);
        //
        Order order = orderManager.getOrder(orderId);
        //
        if (status.equals(OrderStatus.COOKING))
            orderManager.setOrderToCooking(user, order);
    }

}
