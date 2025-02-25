package org.example;

public class Namekiano implements Warrior{
    public int ATTACK_BASE = 50;
    public String name;

    public Namekiano(String name){
        this.name = name;
    }
    @Override
    public int attack() {
        return (int) (Math.random() * 50 + this.ATTACK_BASE);
    }

    public String getName() {
        return name;
    }
}
