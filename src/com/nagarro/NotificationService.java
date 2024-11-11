package com.nagarro;

public class NotificationService {

    private NotificationFactory notificationFactory;
    private NotificationManager notificationManager;

    public NotificationService() {
        this.notificationFactory = new NotificationFactory();
        this.notificationManager = NotificationManager.getInstance(); // Singleton

        // Subscribing users here keeps the process encapsulated in the service
        notificationManager.subscribe(new UserSubscriber("Alice","alice@123gmail.com","1234567891"));
//        notificationManager.subscribe(new UserSubscriber("Bikki","bikki@123gmail.com","9982381902"));
    }
    public void send(String channelType, String subject, String body) {
        NotificationChannel channel = notificationFactory.getNotificationChannel(channelType);

        notificationManager.notifySubscribers(subject, body,channel); // Notify observers
    }

}
