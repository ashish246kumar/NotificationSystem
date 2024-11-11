package com.nagarro;

public class EmailNotification implements NotificationChannel{


    private final EmailAdapter emailAdapter; // Adapter pattern to integrate email sending API

    public EmailNotification() {
        this.emailAdapter = new EmailAdapter(); // Initializes the adapter
    }

    @Override
    public void sendNotification(String subject, String body,String recipient) {
        System.out.println("Sending Email to " + recipient);
        emailAdapter.sendEmail(subject, body);
    }

}
