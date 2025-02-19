package org.example;

import org.junit.Test;

public class EmailNotificationTest {

    @Test
    public void verificarNotificacionPorEmail() {
        //Arrange
        EmailNotification emailNotification = new EmailNotification();

        //Act
        emailNotification.notificarUsuarios();


    }
}
