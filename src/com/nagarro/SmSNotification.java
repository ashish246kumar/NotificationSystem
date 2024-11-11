package com.nagarro;

public class SmSNotification implements NotificationChannel{


    private final SMSAdapter smsAdapter; // Adapter pattern for SMS

    public SmSNotification() {
        this.smsAdapter = new SMSAdapter(); // Initializes the adapter
    }



    @Override
    public void sendNotification(String subject, String body,String recipient) {

        System.out.println("Sending SMS to " + recipient);
        smsAdapter.sendSMS(subject, body);
    }

}
