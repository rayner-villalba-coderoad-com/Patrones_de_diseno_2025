package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Flowers Inventory UPB!");
        String pathCSV = "data/warehouse-stock.csv";
        String pathJSON = "data/warehouse-stock.csv";


        //Leen el archivo
        Flower sucursal1 = new Flower(1, "Tulipan", 5);
        System.out.println(sucursal1.getName());

    }
}