package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    List<Warrior> warriors = new ArrayList<>();
    public void addWarrior(Warrior warrior) {
        warriors.add(warrior);
    }

    public void printWarriors() {
        for (Warrior warrior : warriors) {
            System.out.println(warrior.getName());
        }
    }
}
