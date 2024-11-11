package com.nagarro;

public class UserSubscriber implements Subscriber{
    private String name;
    private String email;
    private String phone;

    public UserSubscriber(String name,String email,String phone) {

        this.name = name;
        this.email=email;
        this.phone=phone;
    }

    @Override
    public void update(String subject, String body, NotificationChannel channel) {
        if (channel instanceof EmailNotification) {
            channel.sendNotification(subject, body, email);
        } else{
            channel.sendNotification(subject, body, phone);
        }

    }
}
