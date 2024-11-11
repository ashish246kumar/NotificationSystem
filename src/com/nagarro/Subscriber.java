package com.nagarro;

public interface Subscriber {
    public void update(String subject, String body, NotificationChannel channel);
}
