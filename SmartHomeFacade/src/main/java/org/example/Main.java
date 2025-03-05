package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SmartHomeFacade smartHomeFacade = new SmartHomeFacade();
        smartHomeFacade.setEveningRoutine();
    }
}