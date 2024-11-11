package com.nagarro;

import java.util.Scanner;
import java.util.logging.*;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        logger.info("Enter Notification Channel (Email/SMS): ");
        String channel = scanner.nextLine();

        logger.info("Enter Subject: ");
        String subject = scanner.nextLine();

        logger.info("Enter Message Body: ");
        String body = scanner.nextLine();

        // Send notification using the façade service
        NotificationService notificationService = new NotificationService();
        notificationService.send(channel, subject, body);
    }
}