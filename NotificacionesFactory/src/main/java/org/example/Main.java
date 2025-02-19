package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("UPB Notificaciones!!!");

        // Crear una notificación de email
        Notification emailNotification = NotificationFactory.createNotification("email");
        emailNotification.notifyUser(); // Enviando notificación por EMAIL...

        // Crear una notificación de SMS
        Notification smsNotification = NotificationFactory.createNotification("sms");
        smsNotification.notifyUser(); // Enviando notificación por SMS...

        // Crear una notificación push
        Notification pushNotification = NotificationFactory.createNotification("push");
        pushNotification.notifyUser(); // Enviando notificación PUSH...


    }
}