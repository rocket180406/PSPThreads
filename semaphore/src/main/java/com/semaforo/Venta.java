package com.semaforo;

public class Venta implements Runnable {

    private final Region region;
    private final String MSG_VENDER = "Vendiendo producto ";

    public Venta(Region region) {
        this.region = region;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                region.vende();
                System.out.println(MSG_VENDER + (i+1));
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
