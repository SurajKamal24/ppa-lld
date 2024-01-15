package dependencyinversionprinciple.conformation;

public class SMSNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(int productId, int customerId) {
        System.out.println("SMSNotificationSender sending notification...");
    }
}
