package com.semaforo;

import java.util.concurrent.Semaphore;

public class Region {
    private final Semaphore Producir;
    private final Semaphore Vender;



    public Region() {
        Producir = new Semaphore(1);

        Vender = new Semaphore(0);
    }

    public void produce() throws InterruptedException {
        Producir.acquire();
        Vender.release();
    }

    public void vende() throws InterruptedException {
        Vender.acquire();
        Producir.release();
    }
}