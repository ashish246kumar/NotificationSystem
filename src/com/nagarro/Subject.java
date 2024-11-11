package com.nagarro;

public interface Subject {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);   // Remove observer
    void notifySubscribers(String subject, String body, NotificationChannel channel);  //
}
