package org.example;

public abstract class EnemyDecorator implements Enemy{
    //Step 2 Declare as attribute an interface
    protected Enemy enemy;

    //Step 3 Send the interface as a parameter in the constructor
    public EnemyDecorator(Enemy enemy) {
        this.enemy = enemy;
    }

    //Step 1.1 Implementing function interface
    @Override
    public int takeDamage() {
        return enemy.takeDamage();
    }

    //Step 1.2 Implementing function interface
    @Override
    public String getDescription() {
        return enemy.getDescription();
    }
}
