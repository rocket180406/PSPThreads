package com.semaforo;

import java.util.concurrent.Semaphore;

public class Region {
    private final Semaphore puedeProducir;
    private final Semaphore puedeVender;

    public Region() {
        puedeProducir = new Semaphore(1);

        puedeVender = new Semaphore(0);
    }

    public void produce() throws InterruptedException {
        puedeProducir.acquire();
        puedeVender.release();
    }

    public void vende() throws InterruptedException {
        puedeVender.acquire();
        puedeProducir.release();
    }
}