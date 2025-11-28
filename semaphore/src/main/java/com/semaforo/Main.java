package com.semaforo;

public class Main {
    public static void main(String[] args) {

        Region region = new Region();

        Thread produccion = new Thread(new Produccion(region));
        Thread venta = new Thread(new Venta(region));

        produccion.start();
        venta.start();
    }
}