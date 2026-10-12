    package org.example;

    public class NotificationFactory {
        public Notification createNotification(String type) {
            if(type.equalsIgnoreCase("email")) {
                return new EmailNotification();
            }else if(type.equalsIgnoreCase("sms")) {
                return new SmsNotification();
            }else{
                throw  new RuntimeException(type + "Invalid notification type");
            }
        }
    }
