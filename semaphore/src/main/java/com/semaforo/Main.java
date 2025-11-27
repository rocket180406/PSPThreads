package com.semaforo;

public class Main {
    public static void main(String[] args) {

        Region region = new Region();

        Thread producer = new Thread(new Produccion(region));
        Thread consumer = new Thread(new Venta(region));

        producer.start();
        consumer.start();
    }
}