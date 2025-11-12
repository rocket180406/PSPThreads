package com.museo;

public class Salida implements Runnable {
    private Sala sala;

    public Salida(Sala sala) {
        this.sala = sala;
    }

    @Override
    public void run() {
        sala.decrementar();
    }
}
