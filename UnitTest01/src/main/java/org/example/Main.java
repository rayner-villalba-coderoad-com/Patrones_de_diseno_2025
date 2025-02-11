package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("UPB Unit tests!!!");

        String message = repeat("hola", 2);
        System.out.println(message);

        assertEquals(message, "holahola");

        //Escenario verificar que el mensaje sea holahola cuando se mande 2 veces a repetir
//        if (message.equals("holahola")) {
//            System.out.println("Test passed");
//        } else {
//            System.out.println("Test failed!!!");
//        }

        //Escenario 2: Recibimos una cadena vacia y tenemos q repetir
       // message = repeat("", 2);

//        if (message.equals("")) {
//            System.out.println("Test passed");
//        } else {
//            System.out.println("Test failed!!!");
//        }

        //Escenario 3: Mandamos una cadena correctamente pero el segundo parametro es un numero negativo
        //message = repeat("hola", -1);

        if (message.equals("")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed!!!");
        }

        //Check if the
       // assertEquals(message,"holahola");

       // message = repeat("hola", 1);

       // assertEquals(message,"holaholla");


    }

    public static String repeat(String s, int times) {
        String result = "";
        if (times < 0) {
            throw new IllegalArgumentException("El numero debe ser mayor que 0");
        }
        for (int i = 0; i < times; i++) {
            result += s;
        }
        return result;
    }

    public static void assertEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("✅Test Passed!!!");
        } else {
            throw new RuntimeException(" ❌Test Failed: " + actual + " is not equal to " + expected);
        }
    }
}