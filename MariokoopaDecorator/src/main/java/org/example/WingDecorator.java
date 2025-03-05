package org.example;

public class WingDecorator extends EnemyDecorator {
    public WingDecorator(Enemy enemy) {
        super(enemy);
    }

    //Step 3 Implement functions of the interface
    public String getDescription() {
        return this.enemy.getDescription() + " con Alas";
    }
    //Step 3 Implement functions of the interface
    public int takeDamage() {
        return this.enemy.takeDamage() / 2;
    }
}
