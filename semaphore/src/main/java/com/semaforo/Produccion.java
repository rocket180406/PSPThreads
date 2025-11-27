package com.semaforo;

public class Produccion implements Runnable {
    private final String MSG_CREAR = "Creando producto ";
    private final Region region;

    public Produccion(Region region) {
        this.region = region;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                region.produce();
                System.out.println(MSG_CREAR + (i+1));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
