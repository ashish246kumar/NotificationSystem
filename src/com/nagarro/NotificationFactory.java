package com.nagarro;

public class NotificationFactory {
    public static NotificationChannel getNotificationChannel(String channelType){
         switch (channelType.toLowerCase()){
             case "email":
                 return new EmailNotification();
             case "sms":
                 return new SmSNotification();
             default:
                 throw new IllegalArgumentException("Invalid Channel type:"+channelType);
         }
    }
}
