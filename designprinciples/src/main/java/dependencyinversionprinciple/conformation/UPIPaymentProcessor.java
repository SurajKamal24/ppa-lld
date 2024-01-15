package dependencyinversionprinciple.conformation;

public class UPIPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(int productId, int customerId) {
        System.out.println("UPIPaymentProcessor processing...");
    }
}
