package org.example;

public class Main {
    public static void main(String[] args) {
        Utils utils = new Utils();
        //Display Messsage
        utils.printMessage("-----------------------");
        utils.printMessage("    CALCULADORA UPB!   ");
        utils.printMessage("-----------------------");

         //Step 1 Read first number and validate it
        double firstNumber = utils.readNumber();

        //Step 2 Read second number and validate it
        double secondNumber = utils.readNumber();

        //Step 3 Read operator and validate it
        String operator = utils.getOperator();

        //Step 4 Calculate the result
        double result = utils.calculate(firstNumber, secondNumber, operator);

        utils.printMessage("RESULTADO: " + result);

    }
}