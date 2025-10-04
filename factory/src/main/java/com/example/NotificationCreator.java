package com.example;

abstract class NotificationCreator {
    //factory method 
    public abstract Notification createNotification(); 

    //common logic using the factory method 
    public void send(String message){
        Notification notification = createNotification();
        notification.send(message); 
    }
}
