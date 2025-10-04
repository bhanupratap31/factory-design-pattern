package com.example;

public class Main {
    public static void main(String[] args) {
        NotificationCreator creator; 

        //send email
        creator = new EmailNotificationCreator(); 
        creator.send("Welcome to our platform!"); 

        //send SMS 
        creator = new SMSNotificationCreator(); 
        creator.send("Your OTP is 123456"); 

        //send push notification
        creator = new PushNotificationCreator(); 
        creator.send("You have a new follower!"); 

        //Send slack notification 
        creator = new SlackNotificationCreator(); 
        creator.send("Daily standup at 10 AM");

    }
}