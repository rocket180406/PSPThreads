package com.familia;

import java.util.Random;
abstract class Persona extends Thread {
    public static final int TIEMPO_MINIMO = 1000;
    public static final int TIEMPO_MAXIMO = 5000;
    public static final String MSG_DESPERTAR = "Se ha despertado ";

    protected String nombre;
    protected Random random = new Random();

    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    
}
