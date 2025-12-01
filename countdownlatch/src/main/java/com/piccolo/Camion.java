package com.piccolo;

import java.util.concurrent.CountDownLatch;

public class Camion implements Runnable {

    public static final String CAMION = "Camión ";
    public static final String MSG_LLEGADA = " ha llegado al centro logístico.";

    private int id;
    private CountDownLatch latch;

    public Camion(int id, CountDownLatch latch) {
        this.id = id;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(CAMION + id + MSG_LLEGADA);
        latch.countDown();
    }
}
