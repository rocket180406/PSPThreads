package com.ceramica;

public class Alfarero implements Runnable {

    private Galeria galeria;

    public static final String OBRA = "Obra ";
    public static final int NUM_OBRAS = 10;

    public Alfarero(Galeria galeria) {

        this.galeria = galeria;
    }

    @Override
    public void run() {
        for (int i = 0; i < NUM_OBRAS; i++) {
            galeria.exponerObra(OBRA + (i + 1));
        }
    }
}
