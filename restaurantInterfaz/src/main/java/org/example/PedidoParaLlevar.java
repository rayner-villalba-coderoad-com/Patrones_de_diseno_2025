package org.example;

public class PedidoParaLlevar implements Pedido {
    @Override
    public void preparar() {
        System.out.println("Preparando el pedido para llevar!!");
    }

    @Override
    public void entregar() {
        System.out.println("Entregando el pedido para llevar!!");
    }
}
