package com.supermercado;

public class Cliente implements Runnable {
    private Caja caja;

    public Cliente(Caja caja) {
        this.caja = caja;
    }

    @Override
    public void run() {
        caja.entrar();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        caja.salir();
    }

}
