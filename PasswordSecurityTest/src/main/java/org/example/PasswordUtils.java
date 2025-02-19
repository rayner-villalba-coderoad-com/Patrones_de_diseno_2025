package org.example;

public class PasswordUtils {
    public String obtenerNivelDeSeguridad(String password) {
        if (password.length() < 8 || password.matches("[a-zA-Z]+")) {
            return "WEAK";
        }
        return "";
    }
}
