package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mario Koopa!!!");
        // write your code here
        System.out.println("Enemigos de Mario \uD83D\uDC22 \uD83C\uDF44!!!");

        Enemy koopa = new BaseEnemy();

        System.out.println("Daño del koopa: " + koopa.takeDamage());
        System.out.println("koopa description: " + koopa.getDescription());

          HelmetDecorator helmetKoopa = new HelmetDecorator(koopa);
//
        System.out.println("Enemigo: " + helmetKoopa.getDescription());
        System.out.println("Daño del koopa con Casco: " + helmetKoopa.takeDamage());
//
        WingDecorator koopaWithWings = new WingDecorator(koopa);
        System.out.println("Enemigo: " + koopaWithWings.getDescription());
        System.out.println("Daño del koopa con Alas: " + koopaWithWings.takeDamage());

    }
}