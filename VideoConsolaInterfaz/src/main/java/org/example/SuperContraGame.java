package org.example;

public class SuperContraGame implements GamingConsole{
    public void up() {
        System.out.println("Apuntar arriba");
    }

    public void down() {
        System.out.println("Agacharse");
    }

    public void left() {
        System.out.println("Ir atrás... ");
    }

    public void right() {
        System.out.println("Disparar...");
    }
}
