package com.supermercado;

public class App {
    public static void main(String[] args) {

        Caja caja = new Caja();

        Thread cajero = new Thread(new Cajero(1, caja));

        Thread cliente = new Thread(new Cliente(caja));

        cajero.start();
        cliente.start();
    }
}