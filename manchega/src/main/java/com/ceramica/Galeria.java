package com.ceramica;

public class Galeria {
    
    public static final String OBRA = "Obra ";
    public static final int NUM_OBRAS = 10;
    public static final String VENDIDA = " vendida";
    public static final String EXPUESTA = " expuesta";

    private String obraExpuesta = null;

    public synchronized void exponerObra(String obra) {
        while (obraExpuesta != null) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        obraExpuesta = obra;
        System.out.println(obra + EXPUESTA);
        notifyAll();
    }

    public synchronized String venderObra() {
        while (obraExpuesta == null) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        String obraVendida = obraExpuesta;
        obraExpuesta = null;
        System.out.println(obraVendida + VENDIDA);
        notifyAll();
        return obraVendida;
    }
}
