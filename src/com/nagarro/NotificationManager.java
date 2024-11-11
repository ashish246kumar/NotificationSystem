package com.nagarro;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager implements Subject{

    private static NotificationManager instance;
    private final List<Subscriber> subscribers = new ArrayList<>(); // List of subscribers

    // Private constructor to prevent direct instantiation
    private NotificationManager() {}

    // Singleton - get the single instance of NotificationManager
    public static synchronized NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }
        return instance;
    }

    // Method to allow users to subscribe to notifications
    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Method to allow users to unsubscribe from notifications

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Notify all subscribed users by calling their update method
    @Override
    public void notifySubscribers(String subject, String body, NotificationChannel channel) {
        for (Subscriber subscriber : subscribers) {
            // Each subscriber handles its own notification using the passed-in channel
            subscriber.update(subject, body, channel);
        }
    }

}
