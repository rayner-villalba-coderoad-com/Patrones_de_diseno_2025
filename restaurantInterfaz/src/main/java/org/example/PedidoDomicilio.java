package org.example;

public class PedidoDomicilio implements Pedido {
    Repartidor repartidor;

    public PedidoDomicilio(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pedido para el domicilio!!!");
    }

    @Override
    public void entregar() {
        System.out.println("Entregando pedido en domicilio!!!");
        repartidor.repartir();
    }
}
