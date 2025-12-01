package com.piccolo;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static final String MSG_LLEGADA = "Todos los camiones han llegado";
    public static void main(String[] args) {

        int numCamiones = 5;
        CountDownLatch latch = new CountDownLatch(numCamiones);

        for (int i = 1; i <= numCamiones; i++) {
            new Thread(new Camion(i, latch)).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(MSG_LLEGADA);
    }
}