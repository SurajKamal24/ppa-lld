package dependencyinversionprinciple.conformation;

public class PurchaseFlowManagerSimulator {
    public static void main(String[] args) {
        PurchaseFlowManager purchaseFlowManager = new PurchaseFlowManager(new NetBankingPaymentProcessor(), new EmailNotificationSender());
        purchaseFlowManager.triggerPurchaseFlow(1,2);
        System.out.println("**********************");
        PurchaseFlowManager altPurchaseFlowManager = new PurchaseFlowManager(new UPIPaymentProcessor(), new SMSNotificationSender());
        altPurchaseFlowManager.triggerPurchaseFlow(1, 3);
    }
}
