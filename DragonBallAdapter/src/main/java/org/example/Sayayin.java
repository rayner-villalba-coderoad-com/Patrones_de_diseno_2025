package org.example;

public class Sayayin implements Warrior{
    public int ATTACK_BASE;
    private String name;
    public Sayayin(String name) {
        this.name = name;
        this.ATTACK_BASE = 100;
    }
    @Override
    public int attack() {
        return (int) (Math.random() * 100 + this.ATTACK_BASE);
    }

    public String getName() {
        return name;
    }
}
