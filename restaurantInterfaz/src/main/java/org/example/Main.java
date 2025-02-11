package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Restaurant UPB");

        PedidoParaLlevar pedido1 = new PedidoParaLlevar();
        PedidoEnMesa pedido2 = new PedidoEnMesa();
        Motorizado motorizado = new Motorizado();
        Ciclista ciclista = new Ciclista();
        //Simular que un pedido sera enviado por un repartidor motorizado!!
        PedidoDomicilio pedido3 = new PedidoDomicilio(motorizado);

        //Simular que un pedido sera enviado por un repartidor ciclista!!!
        PedidoDomicilio pedido4 = new PedidoDomicilio(ciclista);
        Restaurante restaurante = new Restaurante();

        //Agregando mis pedidos
        restaurante.recibirPedido(pedido1);
        restaurante.recibirPedido(pedido2);
        restaurante.recibirPedido(pedido3);
        restaurante.recibirPedido(pedido4);

        //Gestionar Pedidos
        restaurante.gestionarPedidos();
    }
}