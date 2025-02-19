package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Flowers Inventory UPB!");
        String pathCSV = "data/warehouse-stock.csv";
        String pathJSON = "data/warehouse-stock.json";
        String pathXML = "data/warehouse-stock.xml";


        //Leen el archivo
//        Flower sucursal1 = new Flower(1, "Tulipan", 5);
//        System.out.println(sucursal1.getName());

        FileReaderInventory fileReaderInventory = new FileReaderInventory(pathCSV);
        String contenido = fileReaderInventory.readFileContent();

        System.out.println(contenido);

        FeedParserCsv parserCsv = new FeedParserCsv();
        List<Flower> flores = parserCsv.parse(contenido);
    }
}