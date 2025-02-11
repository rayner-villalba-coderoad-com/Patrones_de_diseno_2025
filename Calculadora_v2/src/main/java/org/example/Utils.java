package org.example;

import java.util.Scanner;

public class Utils {
    public void printMessage(String message) {
        System.out.println(message);
    }

    public double readNumber() {
        Scanner scanner = new Scanner(System.in);
        double number = getValidNumber(scanner);

        return number;
    }

    public double getValidNumber(Scanner scanner) {
        while (true) {
            printMessage("Ingrese un numero: ");
            String input = scanner.nextLine();
            try {
                return Double.parseDouble(input); // Convert to number
            } catch (NumberFormatException e) {
                printMessage("Valor no valido");
                printMessage("Ingrese un numero valido!!!");
            }
        }
    }

    public String getOperator() {
        boolean validOperator = false;
        Scanner scannerOp = new Scanner(System.in);
        String operator = "";


        while (validOperator == false) {
            printMessage("Ingrese el operator: (+, -, *, /) ");
            operator = scannerOp.nextLine();


            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                validOperator = true;
            } else {
                printMessage("Ingrese el operator NO valido!!!");
            }
        }


        return operator;
    }

    public double calculate(double a, double b, String operator) {
        double result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    printMessage("No se puede dividir entre 0");
                }
                break;
        }
        return result;
    }
}

