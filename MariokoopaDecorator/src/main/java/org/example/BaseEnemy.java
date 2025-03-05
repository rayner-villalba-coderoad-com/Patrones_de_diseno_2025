package org.example;

public class BaseEnemy implements Enemy {
    @Override
    public String getDescription() {
        return "Crear Koopa UPB";
    }
    @Override
    public int takeDamage() {
        return 100;
    }
}
