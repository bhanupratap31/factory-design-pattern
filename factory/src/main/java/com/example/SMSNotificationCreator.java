package com.example;

class SMSNotificationCreator extends NotificationCreator{
    @Override 
    public Notification createNotification(){
        return new SMSNotification(); 
    }
}
