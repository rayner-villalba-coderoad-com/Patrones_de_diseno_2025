package org.example;

public class GameRunner {
    GamingConsole game;
    public GameRunner(GamingConsole game) {
        System.out.println("GameRunner constructor");
        this.game = game;
    }

    public void run() {
        System.out.println("Esta corriendo el juego: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
