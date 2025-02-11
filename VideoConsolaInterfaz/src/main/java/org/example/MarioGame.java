package org.example;

public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("Salta \uD83E\uDD8A!!!");
    }
    public void down() {
        System.out.println("Entra en un hueco!!!");
    }
    public void left() {
        System.out.println("Ir a atras");
    }
    public void right() {
        System.out.println("Corre...");
    }

}
