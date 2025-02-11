public class Calculadora {

    public static void calcular(int a, int b, String operacion) {
        int resultado = 0;
        switch (operacion) {
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multiplicacion":
                resultado = a * b;
                break;
            case "division":
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida.");
                return;
        }
        System.out.println("El resultado de la " + operacion + " es: " + resultado);
    }

    public static void main(String[] args) {
        calcular(10, 5, "suma");
        calcular(10, 5, "resta");
        calcular(10, 5, "multiplicacion");
        calcular(10, 5, "division");
    }
}