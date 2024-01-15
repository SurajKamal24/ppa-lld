package dependencyinversionprinciple.conformation;

public interface PaymentProcessor {
    void processPayment(int productId, int customerId);
}
