interface Notification {
    void sendNotification(String message);
}

class EmailNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("Email Notification: " + message);
    }
}

class SMSNotification implements Notification {

    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification: " + message);
    }
}

public class Main {
    public static void main(String[] args) {

        Notification email = new EmailNotification();
        Notification sms = new SMSNotification();

        email.sendNotification("Your admission has been confirmed.");
        sms.sendNotification("Your fee payment is successful.");
    }
}