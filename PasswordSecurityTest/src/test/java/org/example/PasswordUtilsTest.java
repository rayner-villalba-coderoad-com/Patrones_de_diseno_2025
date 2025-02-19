package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordUtilsTest {

    @Test
    public void vericando_password_menos_ocho_caracteres() {
        //Arrrange (Preparando los datos)
        String password = "abc";
        PasswordUtils passwordUtils = new PasswordUtils();

        //Act
        String nivelSeguridad= passwordUtils.obtenerNivelDeSeguridad(password);

        //Assert
        assertEquals("WEAK", nivelSeguridad);
    }

    @Test
    public void comprobar_weak_password_solo_letras() {
        //Arrange
        String password = "abcqwasdaefgfg";
        PasswordUtils passwordUtils = new PasswordUtils();

        //Act
        String result = passwordUtils.obtenerNivelDeSeguridad(password);
        //Assert
        assertEquals("WEAK", result);
    }
}
