package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Juego del dado!!!");

        Dado dado = new Dado(6);

        Jugador jugador = new Jugador(dado, 3);
        boolean gano = jugador.jugar();

        String mensaje = gano ? "GANO" : "NO GANO";
        System.out.println(mensaje);
    }
}