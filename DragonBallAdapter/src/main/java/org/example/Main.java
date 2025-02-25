package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("UPB Dragon Ball Torneo!");

        Sayayin goku = new Sayayin("Goku");
        Sayayin vegeta = new Sayayin("Vegeta");

        Namekiano picoro = new Namekiano("Picoro");

        Android android17 = new Android("Android 17");
        AndroidAdapter androidAdapter = new AndroidAdapter(android17);

        System.out.println("Peleador: " + android17.getName());

        Tournament torneo = new Tournament();
        torneo.addWarrior(goku);
        torneo.addWarrior(vegeta);
        torneo.addWarrior(picoro);
        torneo.addWarrior(androidAdapter);

        //Imprimimos todos los participantes
        torneo.printWarriors();

        System.out.println("Goku Ataca: " + goku.attack());
        System.out.println("Vegeta Ataca: " + vegeta.attack());
        System.out.println("Androide Ataca: " + androidAdapter.attack());

    }
}