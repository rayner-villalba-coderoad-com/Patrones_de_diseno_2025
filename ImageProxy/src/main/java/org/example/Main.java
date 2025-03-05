package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
      //  RealImage imagen1 = new RealImage("imagen1.jpg");
       // imagen1.display();
        ProxyImage image1 = new ProxyImage("image1.jpg");
        image1.display();
        image1.display();

    }
}