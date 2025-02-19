package org.example;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class JugadorTest {

    @Test
   public void pierdesCuandoElNumeroDelDadoEsMuyBajo() {
        //Primero simulamos a la clase con la libreria Mockito
       Dado dado = Mockito.mock(Dado.class);
       //Cuando ejecutemos la funcion lanzar de la clase Dado siempre retornará 2
       Mockito.when(dado.lanzar()).thenReturn(2);

       Jugador jugador = new Jugador(dado, 3);

       assertEquals(false, jugador.jugar());
   }

    @Test
    public void ganaCuandoElNumeroDelDadoEsMayou() {
        //Primero simulamos a la clase con la libreria Mockito
        Dado dado = Mockito.mock(Dado.class);
        //Cuando ejecutemos la funcion lanzar de la clase Dado siempre retornará 2
        Mockito.when(dado.lanzar()).thenReturn(7);

        Jugador jugador = new Jugador(dado, 3);

        assertEquals(true, jugador.jugar());
    }
}