package org.example;

public class Flower {
    private int id;
    private String name;
    private int stock;

    public Flower(int id, String name, int stock) {
        this.id = id;
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }
}
