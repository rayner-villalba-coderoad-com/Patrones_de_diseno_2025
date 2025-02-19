package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("UPB Logistica!!!");

        RoadLogistics camion = new RoadLogistics();
        camion.planDelivery();

        SeaLogistics barco = new SeaLogistics();
        barco.planDelivery();
    }
}