package fooddeliverysystem.apis;

import fooddeliverysystem.data.Order;
import fooddeliverysystem.data.PaymentResponse;
import fooddeliverysystem.data.PaymentStatus;
import fooddeliverysystem.data.User;
import fooddeliverysystem.factory.PaymentManagerFactory;
import fooddeliverysystem.managers.OrderManager;
import fooddeliverysystem.managers.PaymentManager;
import fooddeliverysystem.managers.UserManager;

import java.util.Map;

public class PlaceOrderAPI {

    private final UserManager userManager = new UserManager();
    private final OrderManager orderManager = new OrderManager();

    public Order placeOrder(String userToken, Map<String, String> paymentInfo, String paymentMode) {
        if (userToken == null || userToken.length() == 0)
            throw new IllegalArgumentException("Params missing");
        User user = userManager.getUserByToken(userToken);
        if (user == null)
            throw new IllegalArgumentException("userToken invalid");
        PaymentManager paymentManager = PaymentManagerFactory.getPaymentManager(paymentMode, paymentInfo);
        PaymentResponse paymentResponse = paymentManager.executePayment();
        if (paymentResponse == null || paymentResponse.getStatus() == null ||paymentResponse.getStatus().equals(PaymentStatus.FAILED))
            throw new RuntimeException("payment failed...");
        return orderManager.placeOrder(user);
    }
}
