package org.example;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    List<Pedido> pedidos;

    public Restaurante() {
        this.pedidos = new ArrayList<>();
    }

    public void recibirPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Tenemos un nuevo pedido \uD83D\uDDD2\uFE0F!!! ");
    }

    public void gestionarPedidos() {
        for (Pedido pedido : pedidos) {
            pedido.preparar();
            pedido.entregar();
            System.out.println("----------------------------");
        }
    }
}
