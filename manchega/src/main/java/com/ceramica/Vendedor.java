package com.ceramica;

public class Vendedor implements Runnable {

    public static final int NUM_OBRAS = 10;
    
    private Galeria galeria;

    public Vendedor(Galeria galeria) {
        this.galeria = galeria;
    }

    @Override
    public void run() {
        for (int i = 0; i < NUM_OBRAS; i++) {
            galeria.venderObra();
        }
    }
}
