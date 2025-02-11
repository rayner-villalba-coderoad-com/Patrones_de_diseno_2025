package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("UPB Calculadora!");
        Calculadora calculadora = new Calculadora();

        int result = calculadora.suma(2, 3);
        System.out.println(result);
    }
}