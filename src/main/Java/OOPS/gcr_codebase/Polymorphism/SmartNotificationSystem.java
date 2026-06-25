package main.Java.OOPS.gcr_codebase.Polymorphism;

class Notification {

    String recipientName;
    String message;

    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    void sendNotification() {
        System.out.println("Notification Sent");
    }
}

class EmailNotification extends Notification {

    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println(
                "Email sent to "
                        + recipientName
                        + " : "
                        + message
        );
    }
}

class SMSNotification extends Notification {

    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println(
                "SMS sent to "
                        + recipientName
                        + " : "
                        + message
        );
    }
}

class PushNotification extends Notification {

    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    void sendNotification() {
        System.out.println(
                "Push Notification sent to "
                        + recipientName
                        + " : "
                        + message
        );
    }
}

public class SmartNotificationSystem {

    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Ritika", "Welcome"),
                new SMSNotification("Aman", "OTP Sent"),
                new PushNotification("Priya", "New Offer")
        };

        for (Notification notification : notifications) {
            notification.sendNotification();
        }
    }
}