package com.example;

class SlackNotificationCreator extends NotificationCreator {
    @Override 
    public Notification createNotification(){
        return new SlackNotification();
    }
}
