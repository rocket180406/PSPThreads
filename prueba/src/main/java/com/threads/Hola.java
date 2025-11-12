package com.threads;

public class Hola extends Saludo implements Runnable {

    public Hola() {
        this.saludo = "Hola";
    }

    @Override
    public void run() {
        System.out.println(saludo);
    }
}
