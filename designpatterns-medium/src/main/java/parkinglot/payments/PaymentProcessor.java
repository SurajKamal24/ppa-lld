package parkinglot.payments;

public interface PaymentProcessor {

    boolean executePayment();

    double getAmount();

}
