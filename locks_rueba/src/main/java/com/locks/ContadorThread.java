package com.locks;

public class ContadorThread implements Runnable {
    private final Contador contador;

    public ContadorThread(Contador contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            contador.incrementar();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}