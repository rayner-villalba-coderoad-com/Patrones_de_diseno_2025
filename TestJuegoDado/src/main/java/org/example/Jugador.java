package org.example;

public class Jugador {
    private Dado dado;
    private int minNumeroParaGanar;

    public Jugador(Dado dado, int minNumeroParaGanar) {
        this.dado = dado;
        this.minNumeroParaGanar = minNumeroParaGanar;
    }
    public boolean jugar() {
        int numeroDelDado = dado.lanzar();

        System.out.println("El numero del dado es: " + numeroDelDado + " y el numero de ganar debe ser mayor o igual: " + minNumeroParaGanar);
        return numeroDelDado > minNumeroParaGanar;
    }
}
