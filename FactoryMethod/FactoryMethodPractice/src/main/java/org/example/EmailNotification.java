package org.example;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("Email Notification working");
    }
}
