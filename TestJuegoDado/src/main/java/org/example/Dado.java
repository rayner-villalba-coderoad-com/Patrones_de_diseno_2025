package org.example;

import java.util.Random;

public class Dado {
    private int lados;

    public Dado(int lados) {
        this.lados = lados;
    }

    public int lanzar() {
        return new Random().nextInt(lados) + 1;
    }
}
