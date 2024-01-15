package dependencyinversionprinciple.conformation;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(int productId, int customerId) {
        System.out.println("EmailNotificationSender sending notification...");
    }
}
