package dependencyinversionprinciple.conformation;

public class NetBankingPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment(int productId, int customerId) {
        System.out.println("NetBankingPaymentProcessor processing...");
    }
}
