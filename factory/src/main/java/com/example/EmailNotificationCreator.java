package com.example;

class EmailNotificationCreator extends NotificationCreator{
    @Override
    public Notification createNotification() {
        return new EmailNotification(); 
    }    
}
