package org.example;



import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    //Verificar la funcionalidad de la suma con un escenario esperado
    //suma 2 + 2 = 4
    @Test
    public void verificarSuma() {
        //Arrange (Preparar)
        Calculadora calculadora = new Calculadora();
        int numero1 = 2;
        int numero2 = 3;

        //Act (Actua)
        int resultado = calculadora.suma(numero1, numero2);

        //Assert (Verificamos el resultado esperado)
        assertEquals(10, resultado);
    }

}
